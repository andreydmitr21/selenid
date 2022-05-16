package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import common.BaseData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo extends BaseData {


    @Test
    void shouldFindSelenideInGithub() {
        // open
        open("/");
        // enter 'selenide' in search field and run search
//        $("input.form-control.input-sm.header-search-input.jump-to-field.js-site-search-focus").
//                setValue("selenide").pressEnter();

        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // find and click on selenide repo
        $$(".repo-list li").first().$("a").click();
        //$$(".v-align-middle").findBy(text("selenide/selenide")).click();
        // check if real selenide repo url
        $("[rel=author]").shouldHave(text("selenide"));
        $("[itemprop=name]").shouldHave(text("selenide"));
        //$("h1").shouldHave(text("selenide / selenide"));
    }
}
