import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static Veli.Store.DataObject.veliData.*;

public class login extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void PostiveLog() {
        SoftAssert soft = new SoftAssert();
        step authorization = new step();
        authorization
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        authorization.Checklogintitle(); //es
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        authorization.CheckVisibility()
                .RegTitle() //ess
                .Email("testnine@veli.store")
                .Pass(some_password);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        authorization.Forget_pass();
    soft.assertEquals("შესვლა", $(".dCwCil").getText());
     authorization .loginBtn() ;//  აქ მოწმდება ყველა title
        soft.assertAll();
        sleep(7000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void EmptyValues() {
        SoftAssert soft = new SoftAssert();
        step emptyfields = new step();
        emptyfields
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        emptyfields.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        emptyfields.CheckVisibility()
              .Email("")
                  .Pass("");
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        emptyfields.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText());
        emptyfields.loginBtn();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო მეილის ველი\n" +
                "გთხოვ, შეავსო პაროლის ველი", $(".hQCfBs").getText()); //.hQCfBs
        emptyfields.Text_error()
                .PassError();
        sleep(5000); // იჩექება ყველა error sms / titlebi
        soft.assertAll();

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void Emptypassword() {
        SoftAssert soft = new SoftAssert();
        step emptypass = new step();
        emptypass
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        emptypass.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        emptypass.CheckVisibility()
                .Email("testone@veli.store")
                .Pass("");
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        emptypass.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText());
        emptypass.loginBtn();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო პაროლის ველი", $(".hQCfBs").getText()); // iyo es .gkjtVd sheicvala amit .hQCfBs
        emptypass.errortext()
                .PassError(); // ise rogorc empty veliuebit
        soft.assertAll();
        sleep(6000);
        soft.assertAll();
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login detailed test description")
    public void NoEmail() {
        SoftAssert soft = new SoftAssert();
        step no_email = new step(); //
        no_email
                .Cookies()
                .TermsofUse()
                .Accept()
                .GotocreatAccount();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        no_email.Checklogintitle();
        soft.assertEquals("ავტორიზაცია", $(".active").getText());
        no_email.CheckVisibility()
                .Email("")
                .Pass(some_password);
        soft.assertEquals("დაგავიწყდა პაროლი?", $(".update-password").getText());
        no_email.Forget_pass();
        soft.assertEquals("შესვლა", $(".dCwCil").getText()); //.dCwCil gDlMmL
        no_email.loginBtn();
        soft.assertEquals("შევსებული ინფორმაცია არავალიდურია:\n" +
                "გთხოვ, შეავსო მეილის ველი", $(".hQCfBs").getText());
        no_email.errortext();
        soft.assertAll();
        sleep(5000);

    }

}
