import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Tests {
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void enterLoginPage(){
        Configuration.startMaximized = true;
        open(loginPage.ligInPageUrl);
    }

    @Test
    public void checkNameField(){
        loginPage.enterName(loginPage.name);
        Assert.assertTrue(loginPage.accountNameField != null);
        element(loginPage.accountNameField).clear();
    }

    @Test
    public void checkPasswordField(){
        loginPage.enterPassword(loginPage.password);
        Assert.assertTrue(loginPage.passwordField != null);
        element(loginPage.passwordField).clear();
    }

    @Test
    public void accountLoginVerification(){
        loginPage.accountLogin(loginPage.name, loginPage.password);
        Assert.assertEquals(loginPage.accountName.getText(), "Serhiitest");
    }
}
