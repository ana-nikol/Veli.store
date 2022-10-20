package Veli.Store.StepObject;

import Veli.Store.PageObject.veliavtorization;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static Veli.Store.DataObject.veliData.some_mail;
import static Veli.Store.DataObject.veliData.some_password;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class step extends veliavtorization {
    @Step("Click Login/Register button")
    public step GotocreatAccount() {
        creataccount.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Cookie")
    public step Cookies() {
        cookie.waitUntil(Condition.visible, 250000);
        return this;
    }


    @Step("Terms of use")
    public step TermsofUse() {
        use.waitUntil(Condition.visible, 20000);
        return this;
    }

    @Step("accept")
    public step Accept() {
        accept.waitUntil(Condition.visible, 200000).click();
        return this;
    }

    @Step("Check the first registry input visibility")
    public step Checklogintitle() {
        checktitle.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Check avtorization visibility")
    public step CheckVisibility() {
        avtorization_title.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("Check registration visibility")
    public step RegTitle() {
        registration_title.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("fill email with correct data")
    public step Email(String Some_email) {
        email.waitUntil(Condition.visible, 1500).setValue(Some_email);
        return this;
    }

    @Step("fill password with correct data")
    public step Pass(String Some_pass) {
        password.waitUntil(Condition.visible, 1500).setValue(Some_pass);
        return this;
    }

    @Step("check forget password visibility")
    public step Forget_pass() {
        forget_password.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("click login button")
    public step loginBtn() {
        login.waitUntil(Condition.visible, 20000).click();
        return this;
    }

    @Step("check the email error message")
    public step Text_error() {
        errortitle.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("check the password error message")
    public step PassError() {
        errormes.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("check error message")
    public step errortext() {
        valmessage.waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("check password length")
    public step Pass_length() {
        length.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("google log in")
    public step Google_account() {
        sleep(3000);
        google.click();
        return this;
    }

    @Step(" google ")
    public step ID() {
        sleep(3000);
        Selenide.open("https://accounts.google.com/o/oauth2/auth/identifier?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fveli.store%3Fid%3Dauth783511&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=1096281413165-ip9bksrgmpn8sb1k1sk0uqjdhsm1ab1i.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fveli.store&prompt&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow");
        return this;
    }

    @Step("google")
    public step Some_path() {
        xpath.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("reg title")
    public step Title() {
        title.waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Step("heading element ")
    public step Head_element() {
        heading.waitUntil(Condition.visible, 3000);
        return this;
    }

    @Step("fill registr field with email ")
    public step Reg_email(String reg_email) {
        Rmail.waitUntil(Condition.visible, 1500).setValue(reg_email);
        return this;
    }

    @Step("fill name/last name field")
    public step Username(String some_name) {
        username.waitUntil(Condition.visible, 3000).setValue(some_name);
        return this;
    }

    @Step("fill password field")
    public step Singup_pass(String some_password) {
        signup.waitUntil(Condition.visible, 3000).setValue(some_password);
        return this;
    }

    @Step("fill repeat password field")
    public step Repeat_pass(String repeat_password) {
        password2.waitUntil(Condition.visible, 3000).setValue(repeat_password);
        return this;
    }

    @Step("click creat account button")
    public step Creat_account() {
        enter.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("error text")
    public step Error_message() {
        text.waitUntil(Condition.visible, 4000);
        return this;
    }


    @Step("error message")
    public step Error_sms() {
        Text.waitUntil(Condition.visible, 3000);
        return this;
    }

    @Step("error message about name and last name ")
    public step Name_error() {
        name.waitUntil(Condition.visible, 4000);
        return this;
    }

    @Step("Check and click registration title")
    public step Clickregistr() {
        registration_title.click();
        return this;
    }

    @Step("check repeat password visibility")
    public step Repeat_password() {
        repeat_password.shouldBe(Condition.visible);
        return this;
    }

    @Step("check password visibility")
    public step Passwrd() {
        pas.shouldBe(Condition.visible);
        return this;
    }

    @Step("click forget password ")
    public step click_recoverpass() {
        forget_password.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("text of recover password")
    public step recover_pass() {
        recover_pass.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("text of recover password")
    public step recover_title() {
        recovering.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("text of recover password")
    public step recovertext_required() {
        mandatory_text.waitUntil(Condition.visible, 1500);
        return this;
    }


    @Step("enter registered email")
    public step recover_mail(String some_mail) {
        pass.waitUntil(Condition.visible, 1500).setValue(some_mail);
        return this;
    }

    @Step("click send button")
    public step Send() {
        send.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("The password recovery link is emailed to you")
    public step Recovery_link() {
        link.waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("Mail did not come?")
    public step Rerovery_email() {
        checkmail.waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("Send the email again")
    public step Send_emailagain() {
        sendagain.waitUntil(Condition.visible, 2000).click();
        return this;
    }

    @Step("Send the email again")
    public step Send_email_isvisible() {
        sendagain.waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("Mail mail does not exist")
    public step Mail_error() {
        err.waitUntil(Condition.visible, 4000);
        return this;
    }

    @Step("Login by Facebook")
    public step Facebook() {
        sleep(3000);
        facebook.click();
        return this;
    }

    @Step("Facebook email / number input")
    public step Fb_input() {
        sleep(3000);
        //  Selenide.open("https://www.facebook.com/v2.3/dialog/oauth?app_id=1065040574329042&auth_type=&cbt=1644240189433&channel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df3440cd32fb5a84%26domain%3Dveli.store%26is_canvas%3Dfalse%26origin%3Dhttps%253A%252F%252Fveli.store%252Ff1c1e384fa03f4c%26relation%3Dopener&client_id=1065040574329042&display=popup&domain=veli.store&e2e=%7B%7D&fallback_redirect_uri=https%3A%2F%2Fveli.store%2F&locale=en_US&logger_id=f3d34dfadd43e38&origin=1&redirect_uri=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df2f38cfe903f8b4%26domain%3Dveli.store%26is_canvas%3Dfalse%26origin%3Dhttps%253A%252F%252Fveli.store%252Ff1c1e384fa03f4c%26relation%3Dopener%26frame%3Df23e8d4fe90d55&response_type=token%2Csigned_request%2Cgraph_domain&return_scopes=false&scope=name%2Cemail&sdk=joey&version=v2.3");
        return this;
    }


    @Step("Click fiction literature")
    public step Fiction_literature() {
        fiction.waitUntil(Condition.visible, 15000).click();
        return this;
    }

    @Step("Scroll")
    public step ScroLL(boolean top) {
        scroling.scrollIntoView(top).waitUntil(Condition.visible, 5000);
        return this;
    }


    @Step("Register Phone Number")
    public step Register_phone_number(String Some_number) {
        registr_number.waitUntil(Condition.visible, 5000).setValue(Some_number);
        return this;
    }


    @Step("login")
    public step log_in() {
        GotocreatAccount();
        Checklogintitle();
        CheckVisibility();
        RegTitle();
        Email(some_mail);
        Pass(some_password);
        Forget_pass();
        loginBtn();
        return this;
    }

    @Step("Popap close icone")
    public step Close() {
        sleep(5000);
        close.click();
        return this;
    }


    @Step("Close icone")
    public step Close_icone() {
        close_icone.waitUntil(Condition.visible, 8000).click();
        return this;
    }


    @Step("Check cart")
    public step Check_cart() {
        cart.waitUntil(Condition.visible, 3000).click();
        return this;
    }

    @Step("Search")
    public step Search(String some_thing) {
        search.waitUntil(Condition.visible, 12000).setValue(some_thing).pressEnter();
        return this;
    }

    @Step("Check Deliber visibility")
    public step Deliver_title() {
        deliver.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Check Return title")
    public step Return() {
        returntitle.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Check title of contact and click")
    public step Contact() {
        contact.waitUntil(Condition.visible, 20000); // aq sheidzleba davumato click
        return this;
    }

    @Step("Check title of contact and click")
    public step Contact_click() {
        second_contact.waitUntil(Condition.visible, 60000).click();
        return this;
    }

    @Step("Click chat")
    public step Chat() {
        chat_icone.waitUntil(Condition.visible, 60000).click();
        return this;
    }


    @Step("Check support number")
    public step Support_number() {
        velinumber.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Start chat title")
    public step CHat_title() {
        chat_title.waitUntil(Condition.enabled, 50000); // es sanaxavia
        return this;
    }
    @Step("Start chat title")
    public step StartChat_Title() {
        startchat.waitUntil(Condition.enabled, 8000);
        return this;
    }

    @Step("Start chat title")
    public step Chat_Logo() {
        logo.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Title my cart")
    public step Mycart_title() {
        mycart.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Close support Chat")
    public step Close_chat() {
        close_chat.waitUntil(Condition.visible, 60000).click();
        return this;
    }

    @Step("Product not found")
    public step Not_found() {
        product.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("All categories are  visible")
    public step All_Categories() {
        all_categories.waitUntil(Condition.visible, 15000);
        return this;
    }

    @Step("All categories are  visible")
    public step Categories_menu() {
        all_categories.waitUntil(Condition.visible, 9000).click();
        return this;
    }


    @Step("All categories are  visible")
    public step All_Categories_title() {
        head.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("First category div")
    public step First_category() {
        first_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Second category div")
    public step Second_category() {
        Second_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Third category div")
    public step Third_category() {
        third_category.waitUntil(Condition.visible, 11000);
        return this;
    }

    @Step("Click Third category div")
    public step Third_categoryCLick() {
        sleep(8000);
        third_category.click();
        return this;
    }

    @Step("Fourth category div")
    public step Fourth_category() {
        forth_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("CLick fourth category div")
    public step Fourth_categoryclick() {
        forth_category.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Fifth category div")
    public step Fifth_category() {
        fifth_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Click Fifth category div")
    public step Fifth_category_click() {
        fifth_category.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Sixth category div")
    public step Sixth_category() {
        sixth_category.waitUntil(Condition.visible, 9000);
        return this;
    }


    @Step("Seventh category div")
    public step Seventh_category() {
        seventh_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Click seventh category div")
    public step Seventh_category_click() {
        seventh_category.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Eigth category div")
    public step Eighth_category() {
        eighth_category.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Book category")
    public step Book_category() {
        books_category.waitUntil(Condition.visible, 11000).click();
        return this;
    }

    @Step("Books for children and teenagers")
    public step ForChildren_teen() {
        b_category.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Books for 3 and 5 years old category")
    public step ThreeFIve_category() {
        some_category.waitUntil(Condition.visible, 15000).click();
        return this;
    }


    @Step("Category title")
    public step Category_title() {
        category_title.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Check title")
    public step Categorytitle() {
        categoriestitle.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Eat is visible")
    public step Eat_title() {
        eat.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Accessories is visible")
    public step Care_title() {
        accessories.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Electrical device is visible")
    public step Electrical_device() {
        Electrical_device.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Mother is visible ")
    public step Mother() {
        mother.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Technics catories visability")
    public step Categories() {
        technic_categories.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Click computer category")
    public step Computer_devices() {
        comp_devices.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Click leptops category")
    public step Leptops() {
        leptops.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Click Bathroom category")
    public step Bathroom() {
        bathroom.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Click Clouds, Gloves & Parks")
    public step Clouds_gloves_parks() {
        clouds_gloves_parks.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Click Gloves")
    public step Click_gloves() {
        gloves.waitUntil(Condition.visible, 10000).click();
        return this;
    }


}