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

public class Myaccount extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the delete icon test description")

    public void MyAccountWishes() {
        SoftAssert soft = new SoftAssert();
        step_two deletewishes = new step_two();
        deletewishes
               .Cookies() // სურვილების სიიდან იშლება ნივთი სურვილის იკონკაზე დაჭერის დროს
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
              .Write_us()
                .Wishes()
           //   .Profile_navigation()
       .Wishes_title();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        deletewishes.Remove_btn();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        deletewishes.Remove_btn();
              //  .Delet_message(); */
        soft.assertAll();
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the add to cart btn detail test description")
    public void WishAddTocart() {
        SoftAssert soft = new SoftAssert();
        step_two wishaddcart = new step_two();
        wishaddcart
                .Cookies() // სურვილების სიიდან ნივთი ემატება კალათაში
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .Write_us()
                .Wishes()
               // .Profile_navigation()
                .Wishes_title();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        wishaddcart.Addcartbtn();
        wishaddcart.Check_cart();
         //  .Add_message();
        soft.assertAll();
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check the cart detail test description")
    public void CartCheckup() {
        SoftAssert soft = new SoftAssert();
        step_two checkup = new step_two();
        checkup
                .Cookies() // სურვილების სიიდან ნივთი ემატება კალათაში
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
            .Write_us()
            .Wishes()
               .Wishes_title();
            //    .Profile_navigation()
             //   .Hello()
        /*        .Wishes_title();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        checkup    .Addcartbtn();
            //   .Add_message()
               .Seecart_message(); // ეს აკლიკებს კალათის ნახვას */
        // ორშაბათს გასაკეთებელი
        sleep(5000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("my veli test detail detail test description ")
    public void MyVeli() {
        SoftAssert soft = new SoftAssert();
        step_two myveli = new step_two();
        myveli
                .Cookies() //გადის ავტორიზაციას და ჩემ ველს რო დააჭერ და გაიხსენება ფანჯარა
                .TermsofUse()   // უყურებს ჩანს თუ არა პროფილის ნავიგაცია და აკლიკებს გამოსვლას
                .Accept()
                .login_steps();
      //  soft.assertEquals("" , $(".name").getText());
        myveli .My_veli() ;                      // nav-item 6
        soft.assertEquals(  "შეკვეთები"
        ,$(".nav-item",5).getText());
        soft.assertEquals(  "სურვილები"
                ,$(".nav-item",6).getText());
        soft.assertEquals(  "ჩემი ბარათები"
                ,$(".nav-item",7).getText());
        soft.assertEquals(  "მისამართები"
                ,$(".nav-item",8).getText());
        soft.assertEquals(  "პარამეტრები"
                ,$(".nav-item",9).getText());
        myveli.Profile_navigation()
                .Click_Logout();
        soft.assertAll();
        sleep(10000);

    }


}
