package com.ncl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NclTestPage {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ncl.com");
        driver.findElement(By.xpath("/html/body/main/section[7]/div/div/div[2]/ul/li[2]/ul/li[2]/article/div/div[2]/aside/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class=\"col-sm-4 search-column\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Alaska Cruises']")).click();
        driver.findElement(By.xpath("//button[text()='FIND EXCURSIONS']")).click();
        driver.findElement(By.linkText("Port")).click();



    }

}
