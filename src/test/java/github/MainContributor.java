package github;

import common.BaseData;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MainContributor extends BaseData {

    @Test
    void andreiSolntsevMainContributor() {
        open("/selenide/selenide");
        $(".Layout-sidebar").$(withText("Contributors"))
                .closest(".BorderGrid-row").$("ul li").hover();
        //sleep(10000);
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
