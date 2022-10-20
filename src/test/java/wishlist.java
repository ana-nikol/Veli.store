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

public class wishlist extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("add to wishlist without Authorization detail test description")
    public void AddToWishList() {
        SoftAssert soft = new SoftAssert();
        step_two addtowishlist = new step_two();
        addtowishlist
                .Cookies() // სურვილების სიაში დამატება სურვილების იკონკით
                .TermsofUse()
                .Accept()
                .Search(earphone)
                .add_wishlist()
                .login_title();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        addtowishlist.login_title();
        soft.assertAll();
        sleep(5000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add to wishlist with wishlist button")
    public void WishListBtn() {
        SoftAssert soft = new SoftAssert();
        step_two wishlistbtn = new step_two();
        wishlistbtn
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(earphone)
                .Someproduct()
                .WishlistBtn()
                .login_title();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading").getText());
        wishlistbtn.login_title();
        soft.assertAll();
        sleep(5000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("add to wishlist with Authorization detail test description")
    public void AddToWish() {
        SoftAssert soft = new SoftAssert();
        step_two addwishlist = new step_two();
        addwishlist
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(earphone)
                .add_wishlist()
                .login_title()
                .login_email(some_mail)
                .Enter_pass(some_password)
                .Enter_btn()
                .My_veli()
                .Wishes();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        addwishlist.WishesTitle();
        soft.assertAll();
        sleep(5000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("add to wishlist with Authorization detail test description")
    public void WishList() {
        SoftAssert soft = new SoftAssert();
        step_two wishlist = new step_two();
        wishlist
                .Cookies()
                .TermsofUse()
                .Accept()
                .login_steps()
                .Search(earphone)
                .add_wishlist();
            /*    .Wish()
           .Wish_message() */
        ;
        soft.assertAll();
        sleep(8000);
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("add to wishlist with Authorization detail test description")
    public void DeleteFromWishList() {
        SoftAssert soft = new SoftAssert();
        step_two deletewishlist = new step_two();
        deletewishlist
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(earphone)
                .add_wishlist()
                .login_title()
                .login_email(some_mail)
                .Enter_pass(some_password)
                .Enter_btn()
                .My_veli()
                .Wishes();
        soft.assertEquals("\u1CA1ურვილები", $(".hovlJv").getText());
        deletewishlist.WishesTitle();

        soft.assertAll();
        sleep(5000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add to cart detail test description")
    public void Wishlist() {
        SoftAssert soft = new SoftAssert();
        step_two wishlist = new step_two();
        wishlist
                .Cookies()
                .TermsofUse()
                .Accept()
                .Search(papia)
                .Add()
                .Seecart_message()
                .Delet_icone();
        soft.assertEquals("\u1C99ალათიდან \u1CACაშლა\n"
                + "ნამდვილად გსურს პროდუქტის კალათიდან წაშლა?\n"
                + "სურვილების სიაში გადატანა\n"
                + "წაშლა", $(".dropdown").getText());
        wishlist.Remove_txt()
                .Moveto_Wishlist();
        soft.assertEquals("\u1C92აიარე \u1C90ვტორიზაცია", $(".heading", 0).getText());
        wishlist.login_title();
        soft.assertAll();
        sleep(10000);
        /* ძებნის პროდუქტს ამატებს კალათში ხსნის კალათას და აკლიკებს წაშლას
        შემდეგ გამოდის შეტყობინება ნამდვილად გსრურს თუ არა წაშლა ორი ღილაკით სურვილების სიაში გადატანა და წაშლა
        აკლიკებს სურვილების სიაში გადატნის ღილაკს და ამომწებს ხსნის თუ არა ავტორიზაციის ფანჯარას რადგან არაავატორიზირებულ
        მომხმარებელი ვერ ამატებს სურვილების სიაში ნივთს
         */
    }
}
