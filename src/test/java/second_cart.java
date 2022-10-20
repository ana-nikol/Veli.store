import Veli.Store.StepObject.step_two;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Veli.Store.DataObject.veliData.*;
import static com.codeborne.selenide.Selenide.sleep;


public class second_cart extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add cart and buy detail test description")
    public void AddCart() {
        SoftAssert soft = new SoftAssert();
        step_two addcart = new step_two();
        addcart
                .Search(test)
                .Add()
                .Add_message()
                .Check_cart()
                .Title_mycart()
                .Sum_title()
                .Buy()
                .Contact_information()
                .Mail_input();
        soft.assertAll();
        sleep(5000);
    }

}
