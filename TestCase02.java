package testCase02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase02 extends TestBase {
            /*
            Test Case 2: Login User with correct email and password
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click on 'Signup / Login' button
        5. Verify 'Login to your account' is visible
        6. Enter correct email address and password
        7. Click 'login' button
        8. Verify that 'Logged in as username' is visible
        9. Click 'Delete Account' button
        10. Verify that 'ACCOUNT DELETED!' is visible
             */
    @Test
    public void test02(){
    //        1. Launch browser
    //        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

    //        3. Verify that home page is visible successfully
        WebElement home =driver.findElement(By.xpath("//a/i[@class='fa fa-home']"));
        Assert.assertTrue(home.isDisplayed());
    //        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a/i[@class='fa fa-lock']")).click();
    //        5. Verify 'Login to your account' is visible
        WebElement giris = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']"));
        Assert.assertTrue(giris.isDisplayed());
        bekle(2);
    //        6. Enter correct email address and password
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("eraksoy@gmail.com");
        bekle(1);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        bekle(1);

    //        7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    //        8. Verify that 'Logged in as username' is visible
        WebElement kullaniciadi = driver.findElement(By.xpath("//b[text()='Bilal ERAKSOY']"));
        Assert.assertTrue(kullaniciadi.isDisplayed());
    //        9. Click 'Delete Account' button
        driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
        driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
    //        10. Verify that 'ACCOUNT DELETED!' is visible
    }
}
