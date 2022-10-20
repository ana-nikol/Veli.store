import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homepage extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Homepage header titles and open chat")
    public void HomePage() {
        SoftAssert soft = new SoftAssert();
        step homepage = new step();
        homepage
                .Cookies()
                .TermsofUse()
                .Accept();
         soft.assertEquals("მიწოდება", $(By.linkText("/info/return-policy/")).getText());
        homepage.Deliver_title()
                .Return()
                .Contact()
                .Support_number()
                .All_Categories()
                .First_category()
                .Second_category()
                .Third_category()
                .Fourth_category()
                .Fifth_category()
                .Sixth_category()
                .Chat();
        soft.assertEquals("ჩათის დაწყება", $(".txtelips siq-chat-attender-name").getText());
        homepage.StartChat_Title();
     //   homepage .CHat_title(); //  eseni vnaxot ro achqarebeba tu imushaves tu arada caishleba
        //  .Chat_Logo();
        //  .Contact_click();
        // .Close_chat();
        // .StartCHat_title();
        soft.assertAll();
        sleep(10000); // es xval sanaxavia


    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Homepage cart login search")
    public void Homepage_cart_login_search() {
        SoftAssert soft = new SoftAssert();
        step homepage = new step();
        homepage
                .Cookies()
                .TermsofUse()
                .Accept()
                .Deliver_title()
                .Return()
                .Support_number()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading", 0).getText());
        homepage.Checklogintitle()
                .RegTitle()
                .Close()
                .Check_cart();
        soft.assertEquals("ჩემი კალათა", $(".header", 0).getText());
        homepage
                .Close()
                .Search("სიგარა");
        soft.assertEquals("პროდუქტები არ მოიძებნა", $(".kWyjKg").getText());
        homepage.Not_found();
        /* შემოდის ნახულობს მიწონდებას , დაბრუნებას , საკონქატო ნომერს და ტელეფონის ნომერს შემდეგ აჭერს
        შესვლის ღილაკს და ამოწმებს გახსნა თუ არა ავტ/რეგისტრაციის ფანჯარა ხურავს და ამოწმებს კალათს შემდეგ სერჩავს
        არარსებულ პროდუქტს და ამოწმენს შედეგს
         */

        soft.assertAll();

    }


}

