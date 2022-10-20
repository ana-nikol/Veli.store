import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;


public class google extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login by google")
    public void Google() {
        SoftAssert soft = new SoftAssert();
        step google = new step();
        google
                .Cookies()
                .TermsofUse()   // Sad davado asertebi gasavlelia sopostan
                .Accept()
                .GotocreatAccount()
                .Checklogintitle()
                .CheckVisibility()
                .Google_account()
               .ID();
        soft.assertAll();
 //   .Some_path();
        sleep(5000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Registration by google")
    public void Google_registr() {
        SoftAssert soft = new SoftAssert();
        step googleregistration = new step();
        googleregistration
                .Cookies()
                .TermsofUse()   // Sad davado asertebi gasavlelia sopostan
                .Accept()
                .GotocreatAccount()
                .Checklogintitle()
                .CheckVisibility()
                .Clickregistr()
                .Google_account();
        soft.assertAll();
        sleep(6000);

    }


}
