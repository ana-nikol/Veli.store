import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.*;

import static Veli.Store.DataObject.veliData.some_password;
import static com.codeborne.selenide.Selenide.sleep;

public class Myaccount_parameters extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check parameters detail test description")
    public void Change_Name_Number() {
        SoftAssert soft = new SoftAssert();
        step_two parameterss = new step_two();
        parameterss

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
                .Myaccount_email()
                .Name_lastname()
                .Change_info()
                .SetName(name)
                .SCROLlL(true)
                .UpdatePassword_btn()
                .Message_success() // ამას უნდა დავუწერო რომ ორი იყოს რადგან ორჯერ გამოდის ეს შეტყობინება
                .Mob_numb()
                .Change_numb()
                .Phone_number(newphoneNumber)
                .UpdatePassword_btn();
        soft.assertAll();
        sleep(9000);
    }

}