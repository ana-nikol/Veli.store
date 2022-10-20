package Veli.Store.StepObject;

import Veli.Store.PageObject.veliwish;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static Veli.Store.DataObject.veliData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class step_two extends veliwish {
    @Step("Cookie")
    public step_two Cookies() {
        cookie.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Terms of use")
    public step_two TermsofUse() {
        use.waitUntil(Condition.visible, 4000);
        return this;
    }

    @Step("accept")
    public step_two Accept() {
        accept.waitUntil(Condition.visible, 4000).click();
        return this;
    }


    @Step("Search")
    public step_two Search(String some_thing) {
        search.waitUntil(Condition.visible, 8000).setValue(some_thing).pressEnter();
        return this;
    }

    @Step("Scroll")
    public step_two Scroll(boolean top) {
        one.scrollIntoView(top).waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("Product not found")
    public step_two Not_found() {
        product.waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("add to wish list ")
    public step_two add_wishlist() {
        wishlist.waitUntil(Condition.visible, 5000).pressEnter();
        return this;
    }

    @Step("Log in title   ")
    public step_two login_title() {
        title.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("check forget password visibility")
    public step_two Forget_pass() {
        forget_password.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("Check registration visibility")
    public step_two RegTitle() {
        registration_title.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check avtorization visibility")
    public step_two CheckVisibility() {
        avtorization_title.waitUntil(Condition.visible, 1500);
        return this;
    }

    @Step("Log in email")
    public step_two login_email(String Some_mail) {
        sleep(5000);
        email.waitUntil(Condition.visible, 3000).setValue(Some_mail);
        return this;

    }

    @Step("Log in password ")
    public step_two Enter_pass(String Some_pass) {
        password.waitUntil(Condition.visible, 8000).setValue(Some_pass);
        return this;

    }

    @Step("Enter")
    public step_two Enter_btn() {
        login.waitUntil(Condition.visible, 7000).click();
        return this;
    }

    @Step("Enter the account")
    public step_two Account() {
        sleep(8000);
        creataccount.click();
        return this;
    }

    @Step("Click wishlist icone")
    public step_two Wish() {
        //  sleep(4000);
        action.waitUntil(Condition.appear, 10000).click();
        return this;
    }


    @Step("Wishlist text message")
    public step_two Wish_message() {
        text.waitUntil(Condition.visible, 10000);
        return this;

    }

    @Step("Product")
    public step_two Product() {
        papia.waitUntil(Condition.visible, 18000).click();
        return this;
    }

    @Step("Add icone of cart")
    public step_two Add() {
        some_cart.waitUntil(Condition.visible, 9000).click();
        return this;
    }


    @Step("Add to cart button")
    public step_two Addcart_btn() {
        addcart.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Add to cart message")
    public step_two Add_message() {
        sleep(3000);
        texts.waitUntil(Condition.visible, 230000); /// bbbb
        return this;
    }

    @Step("Check cart")
    public step_two Check_cart() {
        cart.waitUntil(Condition.visible, 3000).click();
        return this;
    }

    @Step("Cart")
    public step_two See_cart() {
        see.waitUntil(Condition.visible, 3000).click();
        return this;
    }

    @Step("Click Categories")
    public step_two Click_Categories() {
        categories.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click book Category")
    public step_two Click_book_Category() {
        categories.waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Step("Click book")
    public step_two Click_book() {
        book.waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Step("search clear icon")
    public step_two Clear_icon() {
        clear.waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Step("Click to see cart message")
    public step_two Seecart_message() {
        see_cart.waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Step("Product Increase btn ")
    public step_two Increase_btn() {
        increase.waitUntil(Condition.visible, 25000).click();
        return this;

    }

    @Step("Product decrease btn ")
    public step_two Decrease_btn() {
        sleep(3000);
        decrease.waitUntil(Condition.visible, 3000).click();
        return this;
    }

    @Step("Product decrease btn ")
    public step_two Delet_icone() {
        trash.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Delet icone")
    public step_two DeletIcone() {
        deleteicone.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Product decrease btn ")
    public step_two Remove_btn() {
        sleep(3000);
        remove.waitUntil(Condition.visible, 6000).click();
        return this;
    }

    @Step("Message of empty cart")
    public step_two Cartis_empty() {
        empty_c.waitUntil(Condition.visible, 3000);
        return this;
    }

    @Step("text of removing")
    public step_two Remove_txt() {
        t.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Move to wishList")
    public step_two Moveto_Wishlist() {
        move.waitUntil(Condition.visible, 6000).click();
        return this;
    }

    @Step("title Path ")
    public step_two Title_mycart() {
        path.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step(" all ")
    public step_two Sum_title() {
        all.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step(" buy button  ")
    public step_two Buy() {
        sleep(3000);
        buy.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step(" contact information ")
    public step_two Contact_information() {
        info.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("input field")
    public step_two Mail_input() {
        input1.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("add ")
    public step_two cart_icone() {
        addcart.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click product")
    public step_two Click_product() {
        bagi.waitUntil(Condition.visible, 20000).click();
        // sleep(3000);
        return this;
    }

    @Step("Product title")
    public step_two Product_tit() {
        title.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("")
    public step_two SCroLL(boolean top) {
        div.scrollIntoView(top).waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Product title")
    public step_two check_product_title() {
        check.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Scroll")
    public step_two ScroL(boolean top) {
        scroling.scrollIntoView(top).waitUntil(Condition.visible, 13000);
        return this;
    }

    @Step("click buy button")
    public step_two Clickbuy_btn() {
        bought.waitUntil(Condition.visible, 50000).click();
        sleep(5000);
        return this;
    }

    @Step("Check price visibility")
    public step_two Price() {
        price.waitUntil(Condition.visible, 20000);
        return this;
    }

    @Step("Mail")
    public step_two Email_input(String some_mail) {
        email.waitUntil(Condition.visible, 20000).setValue(some_mail);
        return this;
    }

    @Step("Name input")
    public step_two NameandlastName_input(String some_name) {
        name.waitUntil(Condition.visible, 12000).setValue(some_name);
        return this;
    }

    @Step("Some input")
    public step_two Some_input(String some_input) {
        input_input.waitUntil(Condition.visible, 90000).setValue(some_input);
        return this;
    }


    @Step("Phone")
    public step_two Phone_number(String some_phone) {
        phone.waitUntil(Condition.visible, 16000).setValue(some_phone);
        return this;
    }

    @Step("product")
    public step_two Some_product() {
        pat.waitUntil(Condition.visible, 15000).click();
        return this;
    }

    @Step("click product with link texts")
    public step_two Someproduct() {
        link.waitUntil(Condition.visible, 30000).click();
        return this;
    }

    @Step("Creat your account easily")
    public step_two Creat_account() {
        creat.waitUntil(Condition.visible, 15000).click();
        return this;
    }

    @Step("Enter your pass and accout")
    public step_two title() {
        enter.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Repeat password")
    public step_two Repeat_pass(String Some_passowrd) {
        sleep(9000);
        pass2.setValue(Some_passowrd);
        return this;
    }

    @Step("Click continue button")
    public step_two Press_btn() {
        sleep(8000);
        contin.click();
        return this;
    }
    @Step("Click Enter button")
    public step_two CLickEnter_Btn() {
        go.waitUntil(Condition.visible,10000);
        return this;
    }


    @Step("Click continue button")
    public step_two SCROLL(boolean top) {
        scrol.scrollIntoView(top).waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check password length")
    public step_two Pass_length() {
        length.waitUntil(Condition.visible, 8000);
        return this;
    }
    @Step("Set passwor")
    public step_two PassInput(String Some_pass) {
        passwordfield.waitUntil(Condition.visible, 8000).setValue(Some_pass);
        return this;
    }



    @Step("error text")
    public step_two Error_message() {
        tx.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Please fill in the email field ")
    public step_two Fill_email() {
        fill.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Please fill mobile number ")
    public step_two Fill_MoBileNumber() {
        nmb.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Please fill pass input ")
    public step_two Fill_pass() {
        pass_fill.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Please fill pass input ")
    public step_two Fill_Repeatpass() {
        fill_repeatpass.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Product not found")
    public step_two Product_Notfound() {
        search_txt.waitUntil(Condition.visible, 12000);
        return this;
    }


    @Step("Name and last name  input ")
    public step_two Name_input() {
        name_lastname.waitUntil(Condition.visible, 23000);
        return this;
    }

    @Step("Email input ")
    public step_two Email_input() {
        mail_input.waitUntil(Condition.visible, 25000);
        return this;
    }

    @Step("Number input ")
    public step_two Number_input() {
        number_input.waitUntil(Condition.visible, 20000);
        return this;
    }

    @Step("Cart title visebility")
    public step_two Cart_title_visebility() {
        cart_title.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check cart product visibility")
    public step_two Products() {
        products.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Check cart product visibility")
    public step_two Delivery_fee() {
        delivery_fee.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("total cost")
    public step_two Total_cost() {
        total_cost.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Product Sale")
    public step_two Sale() {
        sale.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Safe methods title")
    public step_two Safe() {
        safe.waitUntil(Condition.visible, 8000);
        return this;
    }


    @Step("Enter Promo Code")
    public step_two Promo_code() {
        promo_code.waitUntil(Condition.visible, 8000);
        return this;
    }


    @Step("Cart Content product  sale, deliver fee , total cost")
    public step_two Cart_content() {
        Cart_title_visebility();
        Promo_code();
        Products();
        Delivery_fee();
        Sale();
        Total_cost();
        Safe();
        return this;
    }


    @Step("login steps")
    public step_two login_steps() {
        Account();
        login_title();
        CheckVisibility();
        RegTitle();
        login_email(some_mail);
        Enter_pass(some_password); //pswrd
        Forget_pass();
        Enter_btn();
        return this;
    }

    @Step("Check free delivery visibility")
    public step_two Free_delivery() {
        free_delivery.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Check address visibility")
    public step_two Address() {
        address.waitUntil(Condition.visible, 12000);//click();
        return this;
    }

    @Step("Add new address")
    public step_two Add_new_adressbtn() {
        add_adress.waitUntil(Condition.visible, 80000).click();
        return this;
    }

    @Step("Click addres") // es sxvagan mchirdeba
    public step_two Click_address() {
        address.waitUntil(Condition.visible, 12000).click();
        return this;
    }


    @Step("Select the  address")
    public step_two Select_address() {
        select.waitUntil(Condition.visible, 5000).click();
        return this;
    }


    @Step("Select delivery time ")
    public step_two SelecTime_title() {
        select_time.waitUntil(Condition.visible, 9000);
        return this;
    }


    @Step("Select delivery time ")
    public step_two TimeSlotBox() {
        timeslot_div.waitUntil(Condition.visible, 9000);
        return this;
    }




    @Step("Select date")
    public step_two SelectDate() {
        input_class.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Leave the order at the door")
    public step_two Leave_order() {
        order.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Dont ring the bell ")
    public step_two Dont_ring() {
        bell.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Enter next btn")
    public step_two Next_btn() {
        next.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Check pay visibility")
    public step_two Pay() {
        pay.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check recepient visibility")
    public step_two Recepient() {
        recipient.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Check Deliber visibility")
    public step_two Deliver_title() {
        deliver.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Checj products in cart visibility")
    public step_two Products_incart() {
        productsincart.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Show me in detail")
    public step_two Show_detail() {
        showdetail.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Check the cart title during the checkout process")
    public step_two Cart_title() {
        cart.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click cart close")
    public step_two Close_btn() {
        button.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Add card and pay")
    public step_two Card_Pay() {
        sleep(8000);
        add_card.click();
        return this;
    }

    @Step("Add card and pay")
    public step_two Pay_title() {
        titleabout_pay.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Add Your Card")
    public step_two Add_Card(String some_card) {
        card_payment.waitUntil(Condition.visible, 18000).setValue(some_card);
        return this;
    }

    @Step("Click pay button ")
    public step_two Click_pay() {
        sleep(4000);
        bankcard.click();
        return this;
    }


    @Step("Add card button")
    public step_two Addcard_button() {
        add_cart.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Some Scrolling")
    public step_two Some_Scroll(boolean top) {
        some_scroll.scrollIntoView(top).waitUntil(Condition.visible, 20000);
        return this;
    }

    @Step("Another Scrolling")
    public step_two Second_sroll(boolean top) {
        another_scroll.scrollIntoView(top).waitUntil(Condition.visible, 15000);
        return this;
    }

    @Step("Scrolling")
    public step_two Scroller(boolean top) {
        third_scroll.scrollIntoView(top).waitUntil(Condition.visible, 15000);
        return this;
    }

    @Step("Click Buy button")
    public step_two Buy_button() {
        btn.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click Buy button")
    public step_two BuyButton() {
        byyy.waitUntil(Condition.visible, 15000).click();
        return this;
    }

    @Step("Check contact infromation visibility")
    public step_two Contact_info() {
        btn.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check contact infromation visibility")
    public step_two Back_icone() {
        back.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Input visibility")
    public step_two NameInput_visebility() {
        name_input.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Input visibility ")
    public step_two Mailinput_visebility() {
        n_input.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Input Number visibility ")
    public step_two Numberinput_visebility() {
        nmb_input.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Vaucher Popap")
    public step_two Vaucher_Popap() {
        Vaucher.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("My veli")
    public step_two My_veli() {
        myveli.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Check title write us")
    public step_two Write_us() {
        write.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Click wishes")
    public step_two Wishes() {
        wish_icone.waitUntil(Condition.visible, 10000).click();
        return this;
    }


    @Step("Check hello title")
    public step_two Hello() {
        hello.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Wishes title")
    public step_two Wishes_title() {
        hello.waitUntil(Condition.visible, 12000);
        return this;
    }

    @Step("Message of product delet")
    public step_two Delet_message() {
        product_delet.waitUntil(Condition.visible, 10000);
        return this;
    }


    @Step("Add card button")
    public step_two Addcartbtn() {
        add_cart.waitUntil(Condition.visible, 7000).click();
        return this;
    }


    /// aqedan

    @Step("Check order visibility")
    public step_two Orders() {
        orders.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Check My Cards visibility")
    public step_two My_cards() {
        mycards.waitUntil(Condition.visible, 18000);
        return this;
    }

    @Step("Check addresses visibility")
    public step_two addresses() {
        addresses.waitUntil(Condition.visible, 14000);
        return this;
    }

    @Step("Check parameters visibility")
    public step_two parameters() {
        paramtrs.waitUntil(Condition.visible, 15000);
        return this;
    }


    @Step("log out visibility")
    public step_two Logout() {
        logout.waitUntil(Condition.visible, 14000);
        return this;
    }

    @Step("check log out visibility and click")
    public step_two Click_Logout() {
        logout.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Profile navigation")
    public step_two Profile_navigation() {
        Orders();
        Wishes_title();
        My_cards();
        addresses();
        parameters();
        Logout();
        return this;

    }

    @Step("Check order visibility and click")
    public step_two CLick_Orders() {
        orders.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Check addresses visibility")
    public step_two Click_addresses() {
        addresses.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Check First addresses visibility")
    public step_two First_address() {
        firstadrs.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check First addresses visibility")
    public step_two Setaddress(String some_addrss) {
        firstadrs.waitUntil(Condition.visible, 9000).setValue(some_addrss);
        return this;
    }

    @Step("Check Second addresses visibility")
    public step_two Second_address() {
        secondadrs.waitUntil(Condition.visible, 8000);
        return this;
    }


    @Step("Adit address")
    public step_two Edit_address() {
        edit.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Change address")
    public step_two Change_address() {
        change_adrs.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Enter address")
    public step_two Enteraddress_text() {
        enter_address.waitUntil(Condition.visible, 9000);
        return this;
    }

    @Step("Enter address")
    public step_two ChangeAddress_title() {
        changeAdres.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Delet button")
    public step_two DeletBTN() {
        dlt_btn.waitUntil(Condition.visible, 7000).click();
        return this;
    }

    @Step("delet first or last address")
    public step_two Deletlast_address() {
        firstadrs.waitUntil(Condition.visible, 7000).click();
        return this;
    }

    @Step("Add Address button")
    public step_two AddAddress() {
        adress.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("SCroll")
    public step_two SCROLlL(boolean top) {
        ScrLL.scrollIntoView(top).waitUntil(Condition.visible, 10000);
        return this;
    }


    @Step("select main address")
    public step_two Main_address() {
        main_addres.waitUntil(Condition.visible, 5000).click();
        return this;

    }

    @Step("Click Add Address button")
    public step_two Click_AddresBtn() {
        adress.waitUntil(Condition.visible, 12000).click();
        return this;
    }

    @Step("Scroll down") // esaaaaa
    public step_two Scroli(boolean top) {
        sqroli.scrollIntoView(top).waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Check parameters visibility and click")
    public step_two prmtrs() {
        paramtrs.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Check private infromation")
    public step_two Private_info() {
        private_info.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check security visibility and click")
    public step_two Security() {
        security.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Check security visibility")
    public step_two Security_title() {
        securiti.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check security visibility")
    public step_two Security_password() {
        passs.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check change password")
    public step_two Change_password() {
        change_password.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Check if email title is visible")
    public step_two Myaccount_email() {
        emmail.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Check name and lst name visibility")
    public step_two Name_lastname() {
        name_and_lastname.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("CLick button of change")
    public step_two Change_info() {
        changeN.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Scroll")
    public step_two scroll_scroll(boolean top) {
        security_scrl.scrollIntoView(top).waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Set Old password")
    public step_two Ol_pass(String passwwrd) {
        password_old.waitUntil(Condition.visible, 7000).setValue(passwwrd);
        return this;
    }


    @Step("Set Old password")
    public step_two UpdatePassword_btn() {
        update_password.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("New password")
    public step_two New_pass() {
        new_pass.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Empty Old password")
    public step_two Empty_pass(String some_password) {
        password_old.waitUntil(Condition.visible, 7000).setValue(some_password);
        return this;
    }

    @Step("Click Cancel button")
    public step_two Cancel_btn() {
        cancel.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Set name value ")
    public step_two SetName(String Some_nname) {
        byname.waitUntil(Condition.visible, 8000).setValue(Some_nname);
        return this;
    }

    @Step("Message of success")
    public step_two Message_success() {
        change_ifromation.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("Mobile Number")
    public step_two Mob_numb() {
        mobile_numb.waitUntil(Condition.visible, 20000);
        return this;
    }

    @Step("Click Change Mobile Number")
    public step_two Change_numb() {
        change_numb.waitUntil(Condition.visible, 12000).click();
        return this;
    }

    @Step("Click Detail ")
    public step_two Detail() {
        detail.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Order detail title visibility ")
    public step_two Order_detail() {
        order_detail.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("purchase time title visibility")
    public step_two Purchase_time() {
        purchase_time.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Order number title visibility")
    public step_two Order_number() {
        order_number.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Status title visibility")
    public step_two Status() {
        status.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Payment method")
    public step_two Payment_method() {
        Payment();
        Products();
        Sale();
        Delivery();
        Total_cost();
        return this;

    }


    @Step("Payment method")
    public step_two Payment() {
        payment.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Delivery visibility")
    public step_two Delivery() {
        deliverYyY.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Address")
    public step_two OrderDetail_address() {
        adrs.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Scroll")
    public step_two SScroll(boolean top) {
        scrollinng.scrollIntoView(top).waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Deliver time")
    public step_two Deliver_time() {
        deliver_time.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("purchased_product")
    public step_two Purchased_product() {
        purchased_product.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("repeat purchase")
    public step_two Repeat_purchase() {
        repeat_purchase.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("proccessing title")
    public step_two Proccessing() {
        processing.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("On the way")
    public step_two On_the_way() {
        way.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Delivered")
    public step_two Delivered() {
        delivered.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Returned status")
    public step_two Returned_status() {
        returned_status.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Save address")
    public step_two SaveAddres_btn() {
        save_address.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Address cancel btn ")
    public step_two Canceladdress_btn() {
        cncelbtn.waitUntil(Condition.visible, 15000).click();
        return this;
    }

    @Step("Click save address btn")
    public step_two Clicksave_address() {
        save_address.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("adrs")
    public step_two Clicklast_address() {
        last_adrs.waitUntil(Condition.visible, 9000).click();
        return this;
    }

    @Step("Empty address list")
    public step_two Empty_address() {
        empty_address.waitUntil(Condition.visible, 7000);
        return this;
    }

    @Step("My card")
    public step_two My_card() {
        mycard.waitUntil(Condition.visible, 7000).click();
        return this;
    }

    @Step("Card title")
    public step_two Card_title() {
        donthave_card.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Card title")
    public step_two Card_title2() {
        cardwill_add.waitUntil(Condition.visible, 10000);
        return this;
    }

    @Step("Name input visibility")
    public step_two NameInput_visible() {
        name_div.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Checkout Number input visibility")
    public step_two NumberInput_visible() {
        numb_div.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step(" Checkout Mail input visiblity")
    public step_two MailInput_visible() {
        mail_div.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Click close of cart icone")
    public step_two CloseCart_btn() {
        close_cart.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("See Cart Products")
    public step_two SeeCartProduct() {
        see.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Sort title")
    public step_two Sort_title() {
        sort.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Sort by price")
    public step_two Sort_by_price() {
        sort_price.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Sort by price")
    public step_two Sort_pricetitle() {
        sort_price.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Sort by name title")
    public step_two Sort_by_name() {
        sort_name.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Sort by name title")
    public step_two Sort_nametitle() {
        sort_name.waitUntil(Condition.visible, 8000);
        return this;
    }

    @Step("Sort by sale")
    public step_two SortSale() {
        ssale.waitUntil(Condition.visible, 4000).click();
        return this;
    }


    @Step("Sort vertical ")
    public step_two Vertical_filter() {
        filter.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("Sort horisontal")
    public step_two Horisontal_filter() {
        filter_two.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("My cart titile")
    public step_two MyCartTitle() {
        carttitle.waitUntil(Condition.visible, 10000).click();
        return this;
    }

    @Step("See cart quantity")
    public step_two SeeCartQuantity() {
        cartquantity.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Wishes Div")
    public step_two WishesTitle() {
        wishdiv.waitUntil(Condition.visible, 5000);
        return this;
    }

    @Step("Click on the napkin")
    public step_two CLickNapkin() {
        napkin.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click price filter")
    public step_two PriceFilter() {
        filterprice.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Fill the min value")
    public step_two FillMinValue(String Some_price) {
        min.waitUntil(Condition.visible, 5000).setValue(Some_price);
        return this;
    }

    @Step("Fill the max value")
    public step_two FillMaxValue(String Some_price) {
        max.waitUntil(Condition.visible, 5000).setValue(Some_price);
        return this;
    }

    @Step("Click search btn")
    public step_two CLickSearchBtn() {
        searchbtn.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click numbers of layers")
    public step_two Clicklayers() {
        numberoflayers.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Select one layers")
    public step_two SelectOneLayers() {
        checkboxsreplace.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Click colour filter")
    public step_two ClickColour() {
        colour.waitUntil(Condition.visible, 8000).click();
        return this;
    }

    @Step("Select white color")
    public step_two SelectWhiteColor() {
        colorwhite.waitUntil(Condition.visible, 5000).click();
        return this;
    }

    @Step("Click wishlist button")
    public step_two WishlistBtn() {
        wishlist_btn.waitUntil(Condition.visible, 5000).click();
        return this;
    }
}





