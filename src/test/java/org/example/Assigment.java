package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Assigment {
    static void main() throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("randomname");
        driver.findElement(By.cssSelector(("input[name='email']"))).sendKeys("mail@mail.com");
        driver.findElement(By.cssSelector(("input[id='exampleInputPassword1']"))).sendKeys("password");
        driver.findElement(By.cssSelector(("input[id='exampleCheck1']"))).click();
        WebElement checkbox = driver.findElement(By.cssSelector(("input[id='exampleCheck1']")));
        Assert.assertTrue(checkbox.isSelected());
        driver.findElement(By.cssSelector(("select[id='exampleFormControlSelect1']"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//select[@id='exampleFormControlSelect1']/option[contains(text(),'Female')]"))).click();
        driver.findElement(By.cssSelector(("input[value='option1']"))).click();
        WebElement radioButton = driver.findElement(By.cssSelector(("input[value='option1']")));
        Assert.assertTrue(radioButton.isSelected());
        driver.findElement(By.xpath((("//label[contains(text(),'Date of Birth')]/../input")))).sendKeys("11111111");
        driver.findElement(By.cssSelector(("input[type='submit']"))).click();

    }
}
