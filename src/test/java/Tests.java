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

    @Test(priority = 0)
    public void checkNameField() {
        loginPage.enterName();
        Assert.assertTrue(loginPage.enterName() != null);
    }

    @Test(priority = 1)
    public void checkPasswordField() {
        loginPage.enterPassword();
        Assert.assertTrue(loginPage.enterPassword() != null);
    }

    @Test(priority = 2)
    public void accountLoginVerification() {
        loginPage.accountLogin();
        Assert.assertEquals(loginPage.accountName.getText(), loginPage.name);
    }
}
