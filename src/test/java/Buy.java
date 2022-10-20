import Veli.Store.StepObject.step;
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

public class
Buy extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void BuyProduct() {
        SoftAssert soft = new SoftAssert();
        step_two buyproduct = new step_two();
        buyproduct
              .Cookies()
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Someproduct();
        soft.assertEquals("ყიდვა", $(".dark-hover", 1).getText());
        buyproduct.BuyButton()
                .Cart_content()
                .Contact_information();
        soft.assertEquals("\u1C9Bეილი*", $(".iYiZgr", 0).getText());
        buyproduct.Email_input("testfour@veli.store")
                .NameandlastName_input(some_name)
                .Phone_number(phoneNumber);
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში \u1C9Bარტივად\n" +
                "შეიყვანე პაროლი და ანგარიში შეკვეთის დასრულებისთანავე შეიქმნება", $(".texts").getText());
        buyproduct.Creat_account();
        soft.assertAll();
        sleep(7000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy existing email detail test description")
    public void BuyExistingEmail() {
        SoftAssert soft = new SoftAssert();
        step_two buyproduct = new step_two();
        buyproduct
                .Cookies() // ყიდულობს ნივთს უკვე არსებული მეილით არ შეყავს პაროლი
                  .TermsofUse() // და ამოწმებს გამოდის თუ არა შეტყობინება
                  .Accept()
                .Search(papia)
                .Someproduct();
        soft.assertEquals("ყიდვა", $(".dark-hover", 1).getText());
        buyproduct.BuyButton()
                .Cart_content()
                .Contact_information();
        soft.assertEquals("\u1C9Bეილი*", $(".iYiZgr", 0).getText());
        buyproduct.Email_input(new_email)
                .Press_btn();
        soft.assertEquals("ინფორმაცია არავალიდურია\n" + "გთხოვ, შეავსო პაროლის ველი"
            , $(".hQCfBs").getText());
        sleep(7000);
        soft.assertAll();
    }
}


