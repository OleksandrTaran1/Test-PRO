package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateEpicentrk() {
        driver.get("https://epicentrk.ua/");
    }

    public WebElement searchField(){
       return getElementByXpath("//input[@class='_JcImSJ']");
    }


}
