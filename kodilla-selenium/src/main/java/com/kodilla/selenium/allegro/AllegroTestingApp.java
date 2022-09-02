package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        //uzycie wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > form > div > input")));
        WebElement category = driver.findElement(By.xpath("//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);
        WebElement drone = driver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        drone.sendKeys("Mavic mini");
        drone.submit();
        //lista
        List<WebElement> articles = driver.findElements(By.cssSelector("section>article"));
        //iterowanie po liscie
        for( WebElement article:articles){
           article.getText();
        }
    }
}
