import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class negativeregistration extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion by email test description")
    public void mail_registration() {
        SoftAssert soft = new SoftAssert();
        step mailregistration = new step();
        mailregistration
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        mailregistration.Clickregistr();
        soft.assertEquals("რეგისტრაცია", $(".active").getText());
        mailregistration.Head_element()
                .Reg_email(reg_email)
                .Register_phone_number(phoneNumber)
                .Username(some_name);
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში", $(".heading").getText());
        mailregistration.Creat_account();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                        "გთხოვ, შეავსო პაროლის ველი\n" +
                        "გაიმეორე პაროლი"
                , $(".hQCfBs").getText());
        soft.assertAll();
        sleep(13000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registration with Short passwords")
    public void short_pass() {
        SoftAssert soft = new SoftAssert();
        step shortpass = new step();
        shortpass
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        shortpass.Clickregistr();
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში", $(".heading").getText());
        shortpass.Head_element()
                .Reg_email(reg_email)
                .Username(username)
                .Register_phone_number("")
                .Singup_pass(password)
                .Repeat_pass(password);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        shortpass.Creat_account();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს\n" +
                "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს", $(".flex-column").getText());
        soft.assertAll();
        sleep(5000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion with empty fields detailed test description")
    public void Ngtest() {
        SoftAssert soft = new SoftAssert();
        step emptyvalues = new step();
        emptyvalues
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        emptyvalues.Title()
                .CheckVisibility()
                .Clickregistr()
                .Head_element()
                .Creat_account()
                .Repeat_password();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                        "გთხოვ, შეავსო მეილის ველი\n" +
                        "გთხოვ, შეავსო სახელი და გვარი\n" +
                        "გთხოვ, შეავსო პაროლის ველი\n" +
                        "გაიმეორე პაროლი"
                , $(".hQCfBs").getText());
        soft.assertAll();
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion detailed test description")
    public void WrongPhoneNumb() {   //რეგისტრაციის დროს არაკორექტული მონცემბის შეყვანა მობილურის ნომრის ველში
        SoftAssert soft = new SoftAssert();
        step register = new step();
        register
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        register.Title();
        soft.assertEquals("რეგისტრაცია", $(".active").getText());
        register.RegTitle();
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში", $(".heading").getText());
        register.Head_element()
                .Reg_email("testeight@veli.store")
                .Username("tester")
                .Register_phone_number("5adb")
                .Singup_pass(pass)
                .Repeat_pass(pass);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        register.Creat_account();
      //  soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                //"გთხოვ, შეავსო მეილის ველი\n" + "გთხოვ, შეავსო სახელი და გვარი", $(".flex-column").getText());
     //   register.Error_message()
           //     .Error_sms();
        soft.assertAll();  // aq dasamatebelia aserti ro gacheqos bagi gvaqvs aq unda gamodiodes erros text
        sleep(15000);

    }
}
