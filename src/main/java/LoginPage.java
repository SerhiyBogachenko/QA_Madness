import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    final String ligInPageUrl = "https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%92%D1%85%D0%BE%D0%B4&returnto=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F%3A%D0%94%D0%BE%D0%BC%D0%B0%D1%88%D0%BD%D1%8F%D1%8F+%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0&returntoquery=source%3Dspecialwelcomesurvey";
    final String name = "Serhiitest";
    final String password = "bss0964124714";

    private final SelenideElement accountNameField = $("#wpName1");
    private final SelenideElement passwordField = $("#wpPassword1");
    private final SelenideElement enterButton = $("#wpLoginAttempt");
    private final SelenideElement accountName = $("#pt-userpage");

    public LoginPage enterName() {
        accountNameField.setValue(name);
        return this;
    }

    public LoginPage enterPassword() {
        passwordField.setValue(password);
        return this;
    }

    public LoginPage accountLogin() {
        enterButton.click();
        return this;
    }

    public SelenideElement getAccountName() {
        return accountName;
    }
}
