import Veli.Store.StepObject.step_two;
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

public class Filters extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Filter by price ")
    public void FilterPrice() {
        SoftAssert soft = new SoftAssert();
        step_two filterprice = new step_two();
        filterprice
            /*    .Cookies()
                .TermsofUse()
                .Accept() */
                .Search(papia)
                .CLickNapkin();
        soft.assertEquals("\u1CAEელსახოცი", $(".dKICOA").getText());
        soft.assertAll();
        filterprice.PriceFilter()
                .FillMinValue("4")
                .FillMaxValue("7")
                .CLickSearchBtn(); // აქ ბაგი iyo
        sleep(8000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Filter by checkboxs")
    public void FilterCheckboxs() {
        SoftAssert soft = new SoftAssert();
        step_two filtercheckboxs = new step_two();
        filtercheckboxs
           /*     .Cookies()
                .TermsofUse()
                .Accept() */
                .Search("selpak")
                .CLickNapkin();
        soft.assertEquals("\u1CAEელსახოცი", $(".dKICOA").getText());
        soft.assertAll();
        filtercheckboxs.Clicklayers()
                .SelectOneLayers();
        soft.assertEquals("ფენების რაოდენობა", $(".tag").getText());
        // აქაც ბაგია .
        sleep(15000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Filter by checkboxs")
    public void SelectColorCheckboxs() {
        SoftAssert soft = new SoftAssert();
        step_two selectcolour = new step_two();
        selectcolour
           /*     .Cookies()
                .TermsofUse()
                .Accept() */
                .Search("papia")
                .CLickNapkin();
        soft.assertEquals("\u1CAEელსახოცი", $(".dKICOA").getText());
        selectcolour .ClickColour()
        .SelectWhiteColor();
        soft.assertAll();
        sleep( 5000);
    }
}



