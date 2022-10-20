import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.notebooks;
import static Veli.Store.DataObject.veliData.papia;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Sort extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort price detail test description")
    public void SortPrice() {
        SoftAssert soft = new SoftAssert();
        step_two price = new step_two();
        price
             /*   .Cookies() // ამოწმებს რომ ჩანდეს დალადება ფასის სახელის და ფასდაკლების მიხედვით და ფასის მიხედვით
                .TermsofUse() // ალაგებს ჯერ კლებადობით მერე ზრდადობით
                .Accept() */
                .Search("პაპია")
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        price.Sort_by_price();
        soft.assertEquals("\u1CA4ასი", $(".euvFpc").getText()); // aqac sheicvala klasebi
        price.Sort_by_price();
        soft.assertAll();
        sleep(5000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort name detail test description")
    public void SortName() {
        SoftAssert soft = new SoftAssert();
        step_two name = new step_two();
        name
              .Cookies()
                .TermsofUse()
                .Accept()
                .Search(notebooks)
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        name.Sort_by_name();
        soft.assertEquals("Სახელი", $(".euvFpc").getText());
        name.Sort_by_name();
        soft.assertAll();
        sleep(5000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort by name and price detail test description")
    public void SortNamePrice() {
        SoftAssert soft = new SoftAssert();
        step_two price = new step_two();
        price
           .Cookies()
                .TermsofUse()
                .Accept()
                .Search(notebooks)
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        price.Sort_by_price();
        soft.assertEquals("\u1CA4ასი", $(".euvFpc").getText());
        price.Sort_by_name();
        soft.assertAll();
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort sale detail test description")
    public void Sort_Sale() {
        SoftAssert soft = new SoftAssert();
        step_two sale = new step_two();
        sale
             .Cookies()
                .TermsofUse()
                .Accept()
                .Search(notebooks)
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        sale.SortSale();
        sleep(5000);
        soft.assertAll();

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Sort sale detail test description")
    public void SortPriceNameSale() {
        SoftAssert soft = new SoftAssert();
        step_two sale = new step_two();
        sale
           .Cookies()
                .TermsofUse()
                .Accept()
                .Search(notebooks)
                .Sort_title();
        soft.assertEquals("\u1CA4ასი\n"
                        + "Სახელი\n"
                        + "Ფასდაკლება",
                $(".sort-btns").getText());
        sale.
                Sort_by_price();
        soft.assertEquals("\u1CA4ასი", $(".euvFpc").getText());
        sale.SortSale();
        sleep(10000);
        soft.assertAll();
    }

}

