import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.earphone;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Search extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Search detail test description")
    public void Search_positive() {
        step_two search = new step_two();
        search
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(earphone);
        sleep(8000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void Search_inEnglish() {
        step_two search = new step_two();
        SoftAssert soft = new SoftAssert();
        search
               /* .Cookies()
                .TermsofUse()
                .Accept() */
                .Search("motorent")
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        soft.assertAll();
        sleep(10000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void Search_Negative() {
        SoftAssert soft = new SoftAssert();
        step_two negativesearch = new step_two();
        negativesearch
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search("პეტუნია");
        soft.assertEquals("პროდუქტები არ მოიძებნა", $(".kWyjKg").getText());
        negativesearch.Product_Notfound();
        soft.assertAll();
        sleep(8000);


    }

}
