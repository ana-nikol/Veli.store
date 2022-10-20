import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class
Myaccount_card extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("check the change of my account")
    public void WithoutCard() {
        SoftAssert soft = new SoftAssert();
        step_two withoutcard = new step_two();
        withoutcard
            .Cookies() // ბარათი არ არის დამატებული ამოწმებს ჩანს თუ არა წარწერას "შენ არ გაქვს ჯერ ბარათი დამატებული"
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .My_card()
                .My_cards();
        soft.assertEquals("\u1CA8ენ \u1C90რ \u1C92აქვს \u1CAFერ \u1C91არათი \u1C93ამატებული\n" + "ბარათი დაემატება შენს პროფილს, როგორც კი პროდუქტს შეიძენ.", $(".lfvxrJ").getText());
        withoutcard.Card_title();
        withoutcard.Card_title2();
        soft.assertAll();
        sleep(10000);

    }
}
