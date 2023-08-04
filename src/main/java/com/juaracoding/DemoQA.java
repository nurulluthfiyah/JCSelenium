package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        System.out.println("Open Browser, Open URL");

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0,500)"); //scroll vertikal 500px
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("submit")).click();
        System.out.println("Input data otomatis");

        try {
            Thread.sleep(3000); //delay 3 detik sebelum quit
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}
