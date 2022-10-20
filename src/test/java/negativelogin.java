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

public class negativelogin extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void ShortPas() {
        SoftAssert soft = new SoftAssert();
        step shortpassword = new step();
        shortpassword
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        shortpassword.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        shortpassword.CheckVisibility()
                .RegTitle()
                .Email(Bigletter)
                .Pass(short_pass);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        shortpassword.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText()); // aq
        shortpassword.loginBtn();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს", $(".hQCfBs").getText());
        shortpassword.errortext()
                .Pass_length()
                .loginBtn(); // es ver ascres chatvirtvas mill aqvs dasamatebelii dasacgeqia tilebi da error sms
        soft.assertAll();
        sleep(3000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Bigletter and wrong password test description")
    public void Bigletter() {
        SoftAssert soft = new SoftAssert();
        step Bigchar = new step();
        Bigchar
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        Bigchar.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        Bigchar.CheckVisibility()
                .Email("Testnine@veli.store")
                .Pass(some_password);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        Bigchar.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText());
        Bigchar.loginBtn();
        soft.assertAll();
        sleep(8000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Bigletter and wrong password test description")
    public void BigletterWrongPass() {
        SoftAssert soft = new SoftAssert();
        step Bigchar = new step();
        Bigchar
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        Bigchar.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        Bigchar.CheckVisibility()
                .Email("Testnine@veli.store")
                .Pass(some_pswrd);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        Bigchar.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText());
        Bigchar.loginBtn();
        soft.assertAll();
        sleep(9000);

    }



    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void loginspace() {
        SoftAssert soft = new SoftAssert();
        step secondspace = new step();
        secondspace
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        secondspace.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        secondspace.CheckVisibility()
                .Email("vachika@mail.ru     ")
                .Pass(some_pswrd);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        secondspace.Forget_pass()
                .loginBtn();
        soft.assertAll();
        sleep(5000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void loginwithspace() {
        SoftAssert soft = new SoftAssert();
        step space = new step();
        space
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        space.Checklogintitle()
                .CheckVisibility()
                .Email("      vachika@mail.ru")
                .Pass(some_pswrd);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        space.Forget_pass()
                .loginBtn();
        soft.assertAll();
        sleep(5000);


    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void Emailerror() {
        SoftAssert soft = new SoftAssert();
        step emailerror = new step();
        emailerror
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount()
                .Checklogintitle()
                .CheckVisibility()
                .Email(email)
                .Pass(pas)
                .Forget_pass();
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        emailerror.loginBtn();
        soft.assertAll();
        // gamodis inglisuri shtyobineba rom ar sheciavs meili @ davazusto
        // moxdeba tu ara am bagis gamoscoreba
        sleep(10000);


    }

}
