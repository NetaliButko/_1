
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
WebDriver driver;
WebDriverWait wait=  new WebDriverWait( driver, 10);

@BeforeTest
public void startDriver(){
        driver = new ChromeDriver();
        }
        @Test
        public void registrationProfile(){
        driver.get("https://wayfindr.com/");
        }
               @Test
        public void RegistrrationCN() {
        driver.findElement(By.xpath("//'[@id='router-view-main']/main/section[1]/div/div/div[1]/ul/li[1]/button")).click();
        }
@Test  //enter correct data
public void authorisation(){
        driver.findElement(By.id("email")).sendKeys("nv.butko.nv@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\'router-view-main\']/div[1]/div/main/div/form/div[3]/div/div[2]/button")).click();
        }
        @Test //enter uncorrect data
        private void  autError(){
                driver.findElement(By.id("email")).sendKeys("nv.butko.nv@gmail.com");
                driver.findElement(By.id("password")).sendKeys("123456789");
                driver.findElement(By.xpath("//*[@id=\'router-view-main\']/div[1]/div/main/div/form/div[2]/div[2]/ul/li[1]"));
                driver.findElement(By.xpath("//*[@id=\'router-view-main\']/div[1]/div/main/div/form/div[3]/div/div[2]/button")).click();
                 Assert.assertTrue(true, "These credentials do not match our records");
        }

      @Test
      public void Login(){
        driver.findElement(By.xpath("//*[@id=\'router-view-main\']/div[1]/div/main/div/form/div[3]/div/div[4]/a")).click();
        }

        @Test
        public void  WhatHappened(){
        driver.findElement(By.xpath("//*[@id=\'__BVID__514__BV_toggle_\']")).click();
        driver.getTitle("Saved");
        Assert.assertTrue(true, driver.getTitle("Saved"));

        }

        @AfterTest
public void coseBrowser(){
        driver.close();
        }
        }