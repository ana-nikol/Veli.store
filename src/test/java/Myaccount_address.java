import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;


// მისამართის სეთველიუთი შეყვანა და შენახვა აგდებს ერორ ტექსტს

//ყველა მისამართის წაშლის სცენარი


public class Myaccount_address extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("check the change of my account")
    public void Myaccount_address() {
        SoftAssert soft = new SoftAssert();
        step_two address = new step_two();
        address
             /*Cookies()
                .TermsofUse()
                .Accept() */
                .login_steps()
                .My_veli()
                .Click_addresses()
                .Profile_navigation()
            //    .Hello()
                 .addresses();
               /* .First_address()
                .Second_address()
                .SCROLlL(true)
                .AddAddress()
                .Edit_address()
                .Change_address()
                .ChangeAddress_title(); */
        soft.assertAll();
        //     .Enteraddress_text();
        sleep(8000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Delet_address() {
        SoftAssert soft = new SoftAssert();
        step_two primary_address = new step_two();
        primary_address
    /*        .Cookies() // მისამართებში
                                    // შლის არჩეულ მისამართს
                .TermsofUse()
                .Accept()  */
                .login_steps()
                .My_veli()
                .Click_addresses()
   //     .Profile_navigation()
            //    .Hello()
                .addresses()
                .First_address()
                .SCROLlL(true) //
             .Second_address()
                .Edit_address()
                .DeletBTN();
        soft.assertAll();
        sleep(8000);

    }

  @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Delet_alladdress() {
      SoftAssert soft = new SoftAssert();
        step_two deletalladdress = new step_two();
  deletalladdress
                .Cookies() //  ბოლო მისამართის წაშლის სცენარი
                .TermsofUse() //// Sad davado asertebi gasavlelia sopostan
                .Accept()
                .login_steps()
                .My_veli()
                .Click_addresses();
      soft.assertAll();
        sleep(8000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Noaddress() {
        SoftAssert soft = new SoftAssert();
        step_two emptyaddres = new step_two();
        emptyaddres
                .Cookies() // წაშლილია ყველა მისამართი და უყურებს ჩანს თუ არა h2 მისამართების სია ცარიელია და
             // აკლიკებს  მისამართის დამატებას
                .TermsofUse()  // Sad davado asertebi gasavlelia sopostan
                .Accept()
                .login_steps()
                .My_veli()
                .Click_addresses()
          //    .Profile_navigation()
                .Hello()
               .addresses()
       //         .Profile_navigation()
                .Empty_address()
                .Click_AddresBtn();
        soft.assertAll();
        sleep(8000);

    }








    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void SelectMain_Address() {
        SoftAssert soft = new SoftAssert();
        step_two main_address = new step_two();
        main_address
            /*    .Cookies() // მისამართებში ირჩევს ძირითად მისამართს და უყურებს ჩანს თუ არა ახალი მისამართის დამატების ღილაკი
                .TermsofUse()
                .Accept() */
                .login_steps()
                .My_veli()
                .Click_addresses()
                .Profile_navigation()
                .Hello()
                //     .addresses()
                .First_address()
                .SCROLlL(true)
                .Second_address()
                .Edit_address()
                .AddAddress()
                .Main_address();
        soft.assertAll();
        sleep(8000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Click_saveaddress() {
        SoftAssert soft = new SoftAssert();
        step_two saveaddress = new step_two();
        saveaddress

                .Cookies() //  ველები ცარიელია და აკლიკებს მისამართის შენახვას
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .Click_addresses()
                .Profile_navigation()
                .Hello()
                //     .addresses() es komentarit iyo
                .First_address()
                .SCROLlL(true)
                .Second_address()
                .AddAddress()
                .Click_AddresBtn()
                .Scroli(true)
                //      .Profile_navigation()
                .Clicksave_address();
        soft.assertAll();
        sleep(8000);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Setaddress() {
        SoftAssert soft = new SoftAssert();
        step_two setaddress = new step_two();
        setaddress

             /*   .Cookies() //  მისამართის სეთველიუთი შეყვანა და შენახვა აგდებს ერორ ტექსტს
                .TermsofUse()
                .Accept() */
                .login_steps()
                .My_veli()
                .Click_addresses()
                //   .Profile_navigation()
                .addresses()
                .SCROLlL(true)
                .Click_AddresBtn()
                .AddAddress()
                .NameandlastName_input("მარჯანიშვილის 61")
                .Some_input("თბილისი")
                //    .Profile_navigation()
                .SCROLlL(true)
                .Clicksave_address();
        soft.assertAll();
        // .Scroli(true)
        //      .Profile_navigation()
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete Address detail test description")
    public void Cancel_address() {
        SoftAssert soft = new SoftAssert();
        step_two canceladdress = new step_two();
        canceladdress
              /*  .Cookies() // მისამართის შეყვანაში აკლიკებს დაუქმების ღილაკს
                .TermsofUse()
                .Accept() */
                .login_steps()
                .My_veli()
                .Click_addresses()
                .Profile_navigation()
                .Hello()
                //     .addresses() es komentarit iyo
                .First_address()
                .SCROLlL(true)
                .Second_address()
                .AddAddress()
                .Click_AddresBtn()
                .Scroli(true)
                //  .Profile_navigation() es xan mushaobs xan ara chatvirtva uchirs
                .SaveAddres_btn()
                .Canceladdress_btn();
        soft.assertAll();
        sleep(8000);

    }

}
