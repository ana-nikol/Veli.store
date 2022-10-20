import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;

// ყველა ორდერის წაშლის სცენარი

public class Myaccount_order extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check orders detail test description")
    public void Myaccount_orders() {
        SoftAssert soft = new SoftAssert();
        step_two orders = new step_two();
        orders
               .Cookies()   // // Sad davado asertebi gasavlelia
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .CLick_Orders()
                .Orders()
                .Detail()
                .Order_detail()
                .Purchase_time()
                .Order_number()
                .Status()
             .Proccessing()
                .On_the_way()
             .Delivered()
         .Payment_method();
        soft.assertAll();
        sleep(10000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check return detail test description")
    public void Myorders_returned() {
        SoftAssert soft = new SoftAssert();
        step_two returnedorder = new step_two();
        returnedorder
                .Cookies()  //// Sad davado asertebi gasavlelia
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .CLick_Orders()
                .Orders()
                .Detail()
                .Status()
            //    .Returned_status()
                .Order_detail()
                .Purchase_time()
                .Order_number()
                .Returned_status()
                .Proccessing()
                .On_the_way()
                .Delivered()
                .Payment_method()
                .Recepient()
                .OrderDetail_address()
                .SScroll(true)
                .Deliver_time()
                .Purchase_time()
                .Purchased_product()
                .Repeat_purchase();
        soft.assertAll();
        sleep(10000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check processing status detail test description")
    public void Myorders_processing() {
        SoftAssert soft = new SoftAssert();
        step_two processing = new step_two();
        processing
                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .CLick_Orders()
                .Orders()
                .Proccessing()
                .Detail()
                .Status()
                .Proccessing()
                .Order_detail()
                .Purchase_time()
                .Order_number()
                .Proccessing()
                .On_the_way()
                .Delivered()
                .Payment_method()
                .Recepient()
                .OrderDetail_address()
                .SScroll(true)
                .Deliver_time()
                .Purchase_time()
                .Purchased_product()
                .Repeat_purchase();
        soft.assertAll();
        sleep(5000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check deliver status detail test description")
    public void Myorders_delivered() {
        SoftAssert soft = new SoftAssert();
        step_two returnedorder = new step_two();
        returnedorder
                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .My_veli()
                .CLick_Orders()
                .Orders()
                .SCROLlL(true)
                .Detail()
                .Status()
                .Delivered()
                .Order_detail()
                .Purchase_time()
                .Order_number()
                .Returned_status()
                .Proccessing()
                .On_the_way()
                .Delivered()
                .Payment_method()
                .Recepient()
                .OrderDetail_address()
                .SScroll(true)
                .Deliver_time()
                .Purchase_time()
                .Purchased_product()
                .Repeat_purchase();
        soft.assertAll();
        sleep(10000);
    }


}
