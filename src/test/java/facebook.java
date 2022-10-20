import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;
import static Veli.Store.DataObject.veliData.*;

public class facebook extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login by facebook")
    public void Fb_Login() {
        SoftAssert soft = new SoftAssert();
        step fblogin = new step();
        fblogin
                .Cookies()
                .TermsofUse()
                .Accept()    // Sad davado asertebi gasavlelia sopostan
                .GotocreatAccount()
                .Checklogintitle()
                .Facebook()
         .Fb_input();
        soft.assertAll();
        sleep(8000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registrstion by faceebok")
    public void Fb_registration() {
        SoftAssert soft = new SoftAssert();
        step fbregistration = new step();
        fbregistration
                .Cookies()
                .TermsofUse()  // Sad davado asertebi gasavlelia sopostan
                .Accept()
                .GotocreatAccount()
                .Checklogintitle()
                .RegTitle()
        .Clickregistr()
                .Facebook()
                .Fb_input();
        soft.assertAll();
        sleep(4000);
    }
}
