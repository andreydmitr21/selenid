package common;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseData {

    @BeforeAll
    static void setCommonData() {
        Configuration.baseUrl = " https://github.com";
        Configuration.browserSize = "1920x1080";
    }
}
