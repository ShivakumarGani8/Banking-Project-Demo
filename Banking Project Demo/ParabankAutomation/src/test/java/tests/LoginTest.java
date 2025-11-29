package tests;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {


    @Test(description="Verify valid login")
    public void testValidLogin(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("john","demo");
        
        Assert.assertTrue(loginPage.isLogoutVisible(),"Logout link is not visible,login might have failed");
    }

}
