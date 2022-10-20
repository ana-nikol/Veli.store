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

public class BywithLogin extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void BuySomeProducts() {
        // რაღაცეებია შეცვლილი რო ვუშვებ ვარდება
        SoftAssert soft = new SoftAssert();
        step_two buysomething = new step_two();
        buysomething
          .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .Search(papia)
                .Someproduct()
                .Price()
                .BuyButton()
                //    .Add_message()
    //    soft.assertEquals("\u1CA1აკონტაქტო \u1C98ნფორმაცია", $("h2").getText());
                .Name_input()
                .Email_input()
                .Number_input()
                .Cart_content()
                .Press_btn()
      //  soft.assertEquals("\u1C9Bიტანა", $("h2").getText());
                .Free_delivery()
                //        .Add_message()
                .Cart_content()
                .Click_address()
                // .Address();
                .Cart_content()
                .Select_address();
   soft.assertEquals("აირჩიე მიტანის დრო", $("h3").getText());
        buysomething
                .SelecTime_title()
            .TimeSlotBox()
          //   .SelectDate()
            .SCROLL(false)
                .Leave_order()
                .Dont_ring()
                .Next_btn()
           .Pay()
                .Recepient()
                .Deliver_title();
    //    soft.assertEquals("პროდუქტები კალათაში",$("h2").getText());
        buysomething .Products_incart()
            .Card_Pay()
     .Pay_title()
       //.Add_Card("2345678991555555");// eseni ar mushaobs
    .Click_pay();
        soft.assertAll();
           /*     .Show_detail()
                .Cart_title()
                .Total_cost()

                .Close_btn(); */
        //   .Add_new_adressbtn();
        sleep(15000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void ShowCardDetail() {
        // რაღაცეებია შეცვლილი რო ვუშვებ ვარდება
        SoftAssert soft = new SoftAssert();
        step_two buysomething = new step_two();
        buysomething
                /*     .Cookies()
                     .TermsofUse()
                     .Accept() */
                .login_steps()
                .Search(papia)
                .Someproduct()
                .Price()
                .Press_btn();
        // .BuyButton();
        //    .Add_message()
        //    .Name_input()
        //    .Email_input()
        //      .Number_input()
           /*     .Cart_content()
                //        .Add_message()
                .Press_btn()
                // .SCROLL(false)
                .Cart_content()
                .Free_delivery()
                .Click_address()
                .Address()
                .Select_address()
                .SelecTime_title()
                .SelectDate()
                .Leave_order()
                .Dont_ring()
                .Next_btn()
                .Pay()
                .Recepient()
                .Deliver_title()
                .Products_incart()
                .Show_detail()
          //      .ShowCard_Detail()
                .Total_cost()
                .CloseCart_btn();
        soft.assertAll();
           /*     .Show_detail()
                .Cart_title()
                .Total_cost()

                .Close_btn(); */
        //   .Add_new_adressbtn();
        sleep(10000);


    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("buy detail test description")
    public void buy_product() {
        SoftAssert soft = new SoftAssert();
        step_two buy = new step_two();
        buy

                /*   .Cookies()
                   .TermsofUse()
                   .Accept() */
                .login_steps()
                //    .Vaucher_Popap()
                .Search(test)
                .Someproduct()
                .Price()
                .Addcard_button()
                .BuyButton()
                /*    .Some_Scroll(true)
                    .Second_sroll(true)
                    .Scroller(true);  */
                //   .Buy_button()

                .Contact_info();
        //   .Cart_content();
        //      .Back_icone()
        //      .MailInput_visible()
        //  .Numberinput_visebility()
        //     .NameInput_visebility()
        //    .Name_input()
        //  .Email_input()
        //  .Number_input()
       /*         .Press_btn()
                .Scroller(true)
                .Second_sroll(true);
             /*   .Free_delivery()
                .Click_address()
                .Address()
                .Select_address()
                .SelecTime_title()
                .SelectDate()
                .Leave_order()
                .Dont_ring()
                .Next_btn()
                .Pay()
                .Recepient(); */
        soft.assertAll();
        sleep(10000);

    }
}




