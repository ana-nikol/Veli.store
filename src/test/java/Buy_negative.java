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

public class Buy_negative extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void ShortPass() {
        SoftAssert soft = new SoftAssert();
        step_two buyproduct = new step_two();
        buyproduct
                .Cookies()                  // დასრულებულია
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Someproduct();
        soft.assertEquals("ყიდვა", $(".dark-hover", 1).getText());
        buyproduct.BuyButton();
        soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $("h2").getText());
        buyproduct.Contact_information();
        soft.assertEquals("\u1C9Bეილი*", $(".iYiZgr", 0).getText());
        buyproduct.Email_input("testsix@veli.store")
                .NameandlastName_input(some_name);
        soft.assertEquals("Მობილურის Ნომერი", $(".iYiZgr", 2).getText());
        buyproduct
                .Phone_number(phoneNumber);
        soft.assertEquals("\u1CA8ექმენი \u1C90ნგარიში \u1C9Bარტივად\n" +
                "შეიყვანე პაროლი და ანგარიში შეკვეთის დასრულებისთანავე შეიქმნება", $(".texts").getText());
        buyproduct
                .Creat_account()
                .title()
                .Enter_pass(short_pass)
                .Repeat_pass(short_pass)
                .Press_btn();
        soft.assertEquals("ინფორმაცია არავალიდურია\n" +
                "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს\n" +
                "პაროლი უნდა შეიცავდეს მინიმუმ 8 სიმბოლოს", $(".hQCfBs").getText());
        //    buyproduct.SCROLL(false)
        buyproduct.Cart_content();
        soft.assertAll();
        sleep(7000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void BuyEmptyInputs() {
        SoftAssert soft = new SoftAssert();
        step_two negativecase = new step_two();
        negativecase
                .Cookies()             // დასრულებულია
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Someproduct();
        soft.assertEquals("ყიდვა", $(".dark-hover", 1).getText());
        negativecase.BuyButton();
        //   .Add_message()
        soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $("h2").getText());
        negativecase.Contact_information();
        soft.assertEquals("Მეილი*", $(".iYiZgr", 0).getText());
        negativecase.Email_input("");
        negativecase.NameandlastName_input("");
        soft.assertEquals("\u1C9Bობილურის \u1C9Cომერი", $(".iYiZgr", 2).getText());
        negativecase.Phone_number("")
                .Creat_account()
                .title();
        soft.assertEquals("\u1C9Eაროლი*", $(".iYiZgr", 3).getText());
        negativecase.Enter_pass("");
        soft.assertEquals("\u1C92აიმეორე \u1C9Eაროლი*", $(".iYiZgr", 4).getText());
        negativecase.Repeat_pass("")
                .Press_btn();
        soft.assertEquals("ინფორმაცია არავალიდურია\n" +
                        "გთხოვ, შეავსო მეილის ველი\n" +
                        "გთხოვ, შეავსო სახელი და გვარი\n" +
                        "გთხოვ, ჩაწერო მობილურის ნომერი\n" +
                        "გთხოვ, შეავსო პაროლის ველი\n" + "გაიმეორე პაროლი"
                , $(".hQCfBs").getText());
        negativecase.SCROLL(false);
        negativecase.Cart_content();
        soft.assertAll();
        sleep(8000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy without name lastname and phone number detail test description")
    public void BuyWithoutNameNumber() {
        SoftAssert soft = new SoftAssert();
        step_two buynegative = new step_two();
        buynegative
                .Cookies()                    // დასრულებულია
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Someproduct()
                .BuyButton();
        soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $("h2").getText());
        buynegative.Contact_information()
                .Cart_content()
                //    .Add_message()
                .Email_input("testsixs@veli.store")
                .NameandlastName_input("")
                .Phone_number("")
                .Creat_account()
                .title()
                .Enter_pass(some_password)
                .Repeat_pass(some_password)
                .Press_btn();
        soft.assertEquals("ინფორმაცია არავალიდურია\n" +
                        "გთხოვ, შეავსო სახელი და გვარი\n" +
                        "გთხოვ, ჩაწერო მობილურის ნომერი"
                , $(".hQCfBs").getText());
        buynegative.Cart_content()
                .SCROLL(false);
        soft.assertAll();
        sleep(7000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy without name lastname , phone number and passwords detail test description")
    public void BuyNegative() {
        SoftAssert soft = new SoftAssert();
        step_two buyneg = new step_two();
        buyneg
                .Cookies()                   // დასრულებულია
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Someproduct()
                .BuyButton();
        soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $("h2").getText());
        buyneg.Contact_information()
                //     .Add_message()
                .Email_input("Testsix@veli.store")
                .NameandlastName_input("")
                .Phone_number("")
                .Creat_account()
                .title()
                .Enter_pass("");
        buyneg.Press_btn();
        soft.assertEquals("ინფორმაცია არავალიდურია\n" +
                        "გთხოვ, შეავსო სახელი და გვარი\n" +
                        "გთხოვ, ჩაწერო მობილურის ნომერი\n" +
                        "გთხოვ, შეავსო პაროლის ველი\n" + "გაიმეორე პაროლი"
                , $(".hQCfBs").getText());
        buyneg.Cart_content()
                .SCROLL(false);
        soft.assertAll();
        sleep(7000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void ExistingMail() {
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
                .Contact_information()
                .Email_input("testfour@veli.store")
                .Press_btn()
                .Cart_content()
                .Enter_pass(some_password)
                .Press_btn();
           soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $(".ldUzhm").getText());
        buyproduct .Cart_content()
                .Press_btn()
                .Click_address()
                .Select_address();
        soft.assertEquals("აირჩიე მიტანის დრო", $("h3").getText());
        buyproduct.SelecTime_title()
                .TimeSlotBox()
                .SCROLL(false)
                .Leave_order()
                .Dont_ring()
                .Next_btn();
        soft.assertEquals("მიმღები", $(".text", 12).getText());
        buyproduct.Recepient();
        soft.assertEquals("მიწოდება", $("h2").getText());
        buyproduct.Deliver_title()
                .Pay()
                .Click_pay();
        //  buyproduct .Products_incart();
        //    buyproduct.SCROLL(false)
        soft.assertAll();
        sleep(10000);

    }

}


