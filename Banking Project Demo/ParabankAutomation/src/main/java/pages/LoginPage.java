package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    WebDriver driver1;
    //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //Locators
    By username= By.name("username");
    By password= By.name("password");
    By loginBtn=By.xpath("//input[@value='Log In']");
    By logoutLink=By.linkText("Log Out");

    //Method to enter username
    public void setUsername(String user){
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
    }

    //Method to enter password
    public void setPassword(String pass){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    //Method to click the login button
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

    //Combined login method
    public void login(String user,String pass){
        setUsername(user);
        setPassword(pass);
        clickLogin();
    }

    //Method to confirm successful login
    public boolean isLogoutVisible(){
        return
                driver.findElement(logoutLink).isDisplayed();
    }

}
