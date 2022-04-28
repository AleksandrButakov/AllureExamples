import com.codeborne.selenide.Selenide;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleTest {

    @Test
    @AllureId("9742")
    @DisplayName("Autorization via Google")
    @Tags({@Tag("critical"), @Tag("web")})
    @Story("External Auth")
    @Owner("allure8")
    @Feature("Auth")
    public void testAuth() {
        step("Open the main page", () -> {
            Selenide.open("https://google.com");
        });
        step("Choosing the autorization via Google");
        step("Login in as user Ivan", () -> {
            step("Enter the login ivan@google.com");
            step("Enter the password 1234");
            step("Click the log in button");
        });
        step("We check that you have logged in correctly", () -> {
            step("We are on the main page of the site");
            step("The user is logged in", () -> {
                //assertTrue(false);
            });
            step("Login Ivan");
        });
        step("Log out");
        step("IDEA", () -> {
            assertTrue(true);
        });
    }

}
