import Veli.Store.StepObject.step;
import Veli.Store.Utils.Chromerunner;
import Veli.Store.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;

public class categories extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Categories")
    public void Book_category() {
        SoftAssert soft = new SoftAssert();
        step category = new step();
        category
                .Cookies()
                .TermsofUse()
                .Accept()
                .Categories_menu() // აკლიკებს კატეგორიის ბურგერს მერე შედის წიგნებში წიგნებში და
                .All_Categories_title() // აკლიკებს საბავშვოს შემდეგ აკლიკებს 3-5 წლამდე კატეგორიას
                .Book_category()
                .ForChildren_teen()
                .ThreeFIve_category()
                .Category_title();
            /*    .Fiction_literature()
                .ScroLL(false); */
        soft.assertAll();
        sleep(8000);
    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Categories")
    public void All_categories() {
        SoftAssert soft = new SoftAssert();
        step Allcategory = new step();
        Allcategory
                .Cookies()
                .TermsofUse()
                .Accept()
                .Categories_menu()
                .All_Categories_title()
                .First_category()
                .Second_category()
                .Third_category()
                .Fourth_category()
                .Fifth_category()
                .Sixth_category()
                .Seventh_category()
                .Close_icone()
                .First_category();
        // აკლიკებს კატეგორიების ბურგერს და უყურებს ჩანს თუ არა ყველა კატეგორია და აკლიკებს დახურვის იკონკას
        sleep(6000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Categories")
    public void Technics_category() {
        step technics = new step();
        technics
                .Cookies()
                     .TermsofUse()
                     .Accept()
                .All_Categories()
                .Fourth_categoryclick()
                .Categorytitle()
                .Categories()
                .Computer_devices()
                .Categories()
                .Leptops()
                .Categorytitle();
                /*შედის ტექნიკაში უყურებს ჩანს თუ არა ტექნიკის დივები
                შემდეგ აკლიკებს კომპ.ტექნიკას და უყურებს ჩანს თუ არა იქაც დივები
                შემდეგ აკლიკებს ლეპტოპებს და ამოწმებს ლეპტოპის h2 ს
                 */
        sleep(9000);

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Categories")
    public void Home_care_category() {
        step homecare = new step();
        homecare
                .Fifth_category_click()
                .Categorytitle()
                .Categories()
                .Bathroom()
                .Categories()
                .Clouds_gloves_parks()
                .Categorytitle()
                .Click_gloves()
                .Categorytitle();
        sleep(6000);
        /* აკლიკებს სახლის მოვლას უყურებს მარცხენა მხარეს h2 და ყველა კატეგორიას შემდეგ აკლიკებს
        სააბაზანოს და უყურენს  h1 საბააზანოს ყველა კატეგორიას იქიდან არჩევს ღრუბელს ხელთათმანებს და პარკებს
        შედის ხელთათმანებში და უყურებს ხელთათმანების თაილთს
         */
    }


}
