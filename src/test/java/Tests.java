import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Tests {

    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void enterLoginPage() {
        Configuration.startMaximized = true;
        open(loginPage.ligInPageUrl);
    }

    @Test(priority = 1)
    public void checkNameField() {
        loginPage.enterName();
        Assert.assertNotNull(loginPage.enterName());
    }

    @Test(priority = 2)
    public void checkPasswordField() {
        loginPage.enterPassword();
        Assert.assertNotNull(loginPage.enterPassword());
    }

    @Test(priority = 3)
    public void accountLoginVerification() {
        loginPage.accountLogin();
        Assert.assertEquals(loginPage.getAccountName().getText(), loginPage.name);
    }
}
