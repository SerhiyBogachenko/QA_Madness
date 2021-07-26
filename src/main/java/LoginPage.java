import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage {

    String ligInPageUrl = "http://surl.li/aaqvx";
    String name = "Serhiitest";
    String password = "bss0964124714";

    WebElement accountNameField = $("#wpName1");
    WebElement passwordField = $("#wpPassword1");
    WebElement enterButton = $("#wpLoginAttempt");
    WebElement accountName = $("#pt-userpage");


    public void enterName(String name){
        accountNameField.sendKeys(name);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void accountLogin(String name, String password){
        enterName(name);
        enterPassword(password);
        enterButton.click();
    }
}
