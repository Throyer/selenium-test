package com.github.throyer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String... args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://google.com.br");
        browser.quit();
    }
}
