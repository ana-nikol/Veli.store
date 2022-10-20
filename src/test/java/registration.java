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

public class registration extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion detailed test description")
    public void PositiveReg() {
        SoftAssert soft = new SoftAssert();
        step registration = new step();
        registration
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        registration.Title();
        soft.assertEquals("რეგისტრაცია", $(".active").getText());
        registration.RegTitle();
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში", $(".heading").getText());
        registration.Head_element()
                .Reg_email("testnine@veli.store") // aq chavcero axali email
                .Username("Test")
                .Register_phone_number("59585627")
                .Singup_pass(pass)
                .Repeat_pass(pass);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        registration.Creat_account();
        soft.assertAll();
        sleep(10000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion detailed test description")
    public void Regemail() {   //რეგისტრაცია მეილის სახელის და გვარის გარეშე
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
                .Reg_email("")
                .Username("")
                .Register_phone_number("")
                .Singup_pass(pass)
                .Repeat_pass(pass);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        register.Creat_account();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო მეილის ველი\n" + "გთხოვ, შეავსო სახელი და გვარი", $(".flex-column").getText());
        register.Error_message()
                .Error_sms();
        soft.assertAll();  //
        sleep(7000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion without name test description")
    public void Reg_Name() {   // სახელის და გვარის გარეშე
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
                .Reg_email(new_email) //
                .Username("")
                .Register_phone_number("")
                .Singup_pass(pass)
                .Repeat_pass(pass);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        register.Creat_account();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო სახელი და გვარი", $(".flex-column").getText());

        register
                .Name_error()
                .Error_message()
                .Error_sms();
        soft.assertAll();  //
        sleep(5000);
    }





    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion without email test description")
    public void Mail() {
        SoftAssert soft = new SoftAssert();
        step withoutmail = new step();
        withoutmail
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        withoutmail.Title();
        soft.assertEquals("რეგისტრაცია", $(".active").getText());
        withoutmail.RegTitle();
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში", $(".heading").getText());
        withoutmail.Head_element()
                .Reg_email("")
                .Username(some_name)
                .Register_phone_number(phoneNumber)
                .Singup_pass(pass)
                .Repeat_pass(pass);
        soft.assertEquals("შექმენი ანგარიში", $(".dCwCil").getText());
        withoutmail.Creat_account();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო მეილის ველი", $(".flex-column").getText());
        withoutmail.Error_message()
                .Error_sms();
        soft.assertAll();
        sleep(8000);
    }

}
