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

public class cart extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add to cart detail test description")
    public void Addto_Cart() {
        SoftAssert soft = new SoftAssert();
        step_two addtocart = new step_two(); // სერჩავს პაპიას ამატებს კალათში შედის უყურებს კალათაში არის თუ არა
        addtocart                             // შემდეგ ანკლიკებს ნახვის ღილაკს და ამოწმებს ჩანს თუ არა რამდენი h2
                .Cookies()                    // "შენს კალათაში რამდენი ნივთია"
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Product()
                .Addcart_btn()
                .Check_cart();
        soft.assertEquals("ჩემი კალათა", $(".header", 0).getText());
        addtocart.MyCartTitle()
                //   .Add_message()
                .See_cart();
        soft.assertEquals("\u1CA8ენს \u1C99ალათაში 1 \u1C9Cივთია", $(".fwFHuY").getText());
        addtocart.SeeCartQuantity();
        soft.assertAll();
        sleep(5000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add to cart detail test description")
    public void Check_cart() {
        SoftAssert soft = new SoftAssert();
        step_two checkaddtocart = new step_two();
        checkaddtocart
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Add()
                .Seecart_message()
                .Increase_btn()
                .Increase_btn()
                .Increase_btn()
                .Increase_btn();
        soft.assertAll();
        //   .See_cart();
        sleep(8000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add to cart detail test description")
    public void Checkcart_btn() {
        SoftAssert soft = new SoftAssert();
        step_two checkaddtocart = new step_two();
        checkaddtocart
            .Cookies()
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Add()
                .Seecart_message()
                .Increase_btn()
                .Increase_btn()
                .Decrease_btn()
                .Decrease_btn()
                .Delet_icone();
        soft.assertEquals("\u1C99ალათიდან \u1CACაშლა\n"
                + "ნამდვილად გსურს პროდუქტის კალათიდან წაშლა?\n"
                + "სურვილების სიაში გადატანა\n"
                + "წაშლა", $(".dropdown").getText());
        checkaddtocart.Remove_txt()
                .Remove_btn()
                .Cartis_empty();
        soft.assertEquals("\u1C99ალათა \u1CAAარიელია", $(".fwFHuY").getText());
        soft.assertAll();
        sleep(8000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Delet products from your cart")
    public void DeletCart() {
        SoftAssert soft = new SoftAssert();
        step_two deletfromcart = new step_two();
        deletfromcart
              .Cookies()
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Add()
                .Check_cart();
        soft.assertEquals("ჩემი კალათა", $(".header", 0).getText());
        deletfromcart.DeletIcone();
        soft.assertEquals("შენი კალათა ცარიელია", $(".items",1).getText()); // გადასახედი სცენარი
        soft.assertAll();
        sleep(8000);

    }
}
