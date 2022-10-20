import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.*;
import static Veli.Store.DataObject.veliData.Bigletter;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Recover extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Password recover")
    public void PassRecover_Positive() {
        SoftAssert soft = new SoftAssert();
        step passrecover = new step(); //პაროლის აღდგენის პოზიტიური სცენარი
        passrecover
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        passrecover.Forget_pass()
                .click_recoverpass();
        soft.assertEquals("პაროლის აღსადგენად, შეიყვანე რეგისტრირებული მეილი", $(".description").getText());
        passrecover.recover_pass()
                .recover_title()
                .recover_mail("testone@veli.store")
                .Send()
                .Recovery_link()
                .Rerovery_email();
        soft.assertEquals("მეილი არ მოვიდა?\n" +
                        "ხელახლა გაგზავნა"
                , $(".send-again").getText());
        passrecover
                .Send_email_isvisible();
        soft.assertAll();
        sleep(9000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Recover password")
    public void RecoverPass() {
        SoftAssert soft = new SoftAssert();
        step recoverpass = new step();  // პაროლის აღდგენაა და ხელახლა გაგზავნის სცენარი
        recoverpass
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        recoverpass.Forget_pass()
                .click_recoverpass();
        soft.assertEquals("პაროლის აღსადგენად, შეიყვანე რეგისტრირებული მეილი", $(".description").getText());
        recoverpass
                .recover_pass()
                .recover_title()
                .recover_mail("testone@veli.store")
                .Send()
                .Recovery_link()
                .Rerovery_email();
        soft.assertEquals("მეილი არ მოვიდა?\n" +
                        "ხელახლა გაგზავნა"
                , $(".send-again").getText());
        recoverpass.Send_emailagain()
                .recover_mail(some_mail)
                .Send();
        soft.assertEquals("მეილი არ მოვიდა?\n" +
                        "ხელახლა გაგზავნა"
                , $(".send-again").getText());
        recoverpass.Recovery_link()
                .Rerovery_email();
        soft.assertAll();
        sleep(5000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Password recover with wrong mail")
    public void Recover_Password() {
        SoftAssert soft = new SoftAssert();
        step passrecover = new step(); // დაურეგისტრირებელ მეილზე პაროლის აღდგენის მოთხოვნა
        passrecover
                .Cookies() // აქ გვაქვს მიმდინარე ბაგი
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        passrecover.Forget_pass()
                .click_recoverpass();
        soft.assertEquals("პაროლის აღსადგენად, შეიყვანე რეგისტრირებული მეილი", $(".description").getText());
        passrecover.recover_pass()
                .recover_mail(some_mail)
                .Send()
                .Mail_error();
        soft.assertAll(); // ბაგი გვაქვს აქ
        sleep(50000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Password recover with Big letter")
    public void RecoverPass_BigLetter() {
        SoftAssert soft = new SoftAssert();
        step passrecover = new step(); // პატარა ასოთი რეგისტრირებული მეილის პაროლის აღდგენა დიდი ასოთი es dasasrulebelia
        passrecover
                .Cookies() // აქ ბაგი იყო
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        passrecover.Forget_pass()
                .click_recoverpass();
        soft.assertEquals("პაროლის აღსადგენად, შეიყვანე რეგისტრირებული მეილი", $(".description").getText());
        passrecover
                .recover_pass()
                .recover_mail("Testtwo@veli.store")
                .Send();
        soft.assertEquals("მეილი არ მოვიდა?\n" +
                        "ხელახლა გაგზავნა"
                , $(".send-again").getText());
        passrecover.Recovery_link()
                .Rerovery_email();
        soft.assertAll();
        sleep(5000);

    }


}
