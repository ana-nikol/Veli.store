import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Myaccount_security extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check parameters detail test description")
    public void Myaccount_security() {
      //  SoftAssert soft = new SoftAssert();
        step_two security = new step_two();
        security

                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .prmtrs()
                //     .Profile_navigation()
                .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .Cancel_btn();
      //  soft.assertAll();
        //    .scroll_scroll(true); // სოფოსთან ერთად გავიარო ეს სცენარი
        sleep(5000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("change password detail test description")
    public void Change_pass_positive() {
 //       SoftAssert soft = new SoftAssert();
        step_two changepass = new step_two();
        changepass

                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .prmtrs()
         //       .Profile_navigation()
                .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .Ol_pass(some_password) // old password შეყავს
                .scroll_scroll(true)
                .Enter_pass(NewPass)
                .Repeat_pass(NewPass)
                .Profile_navigation()
                .UpdatePassword_btn();
    //    soft.assertAll();
        sleep(9000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("change password detail test description")
    public void Changepass_negative() {
  //      SoftAssert soft = new SoftAssert();
        step_two changepass = new step_two();
        changepass

        /*   .Cookies()
                .TermsofUse()
                .Accept()  */
                .login_steps()
                .My_veli()
                .prmtrs()
           //     .Profile_navigation()
          //      .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .Ol_pass(some_password) // old password შეყავს
                .scroll_scroll(true)
                .Enter_pass(NewPass)
                .UpdatePassword_btn();
     //   soft.assertAll();
        sleep(6000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("change password detail test description")
    public void Change_pass_negative() {
        SoftAssert soft = new SoftAssert();
        step_two changePass = new step_two();
        changePass

                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .prmtrs()
                .Profile_navigation()
                .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .Ol_pass(some_password) // old password შეყავს დანარჩენ ველებს ტოვებს ცარიელს და აკლიკებს
                .scroll_scroll(true)
                .UpdatePassword_btn()
                .New_pass()
                .Fill_Repeatpass()
                .Fill_pass() // pleas fill the pass field
                .Profile_navigation(); //
        soft.assertAll();
        sleep(9000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("change password detail test description")
    public void Short_pass() {
        SoftAssert soft = new SoftAssert();
        step_two shortpass = new step_two();
        shortpass

                .Cookies() // სცენარი მოკლე პაროლით
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .prmtrs()
                //    .Profile_navigation()
                .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .Ol_pass(short_pass) // old password შეყავს
                .scroll_scroll(true)
                .Enter_pass(short_pass)
                .UpdatePassword_btn()
                .Profile_navigation()
                .Pass_length();
        soft.assertAll();
        sleep(6000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Negative case password change detail test description")
    public void Emptypassowrd_fileds() {
        SoftAssert soft = new SoftAssert();
        step_two emptyfields = new step_two();
        emptyfields
            /*    .Cookies() // პაროლის აღდგენა ცარიელი ველებით
                .TermsofUse()
                .Accept() */
                .login_steps()
                .My_veli()
                .prmtrs()
                //    .Profile_navigation()
                .Hello()
                .parameters()
                .Private_info()
                .Security()
                .Security_title()
                .Security_password()
                .Change_password()
                .scroll_scroll(true)
                .UpdatePassword_btn()
                .Fill_pass();
        soft.assertAll();
        sleep(9000);

    }

}
