package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart extends BasePage{

    public Cart(WebDriver driver) {
        super(driver);
    }
    public WebElement closeTheCart (){
        return getElementByXpathClickable("//button[@type='button'] [@class='fancybox-button fancybox-close-small']");
    }

    public WebElement getToOrder(){
        return getElementByXpath("//button[@class='purchase-btn btn btn--1 btn--blue ']");
    }
    public List<WebElement> goodsInTheCart(){
        return getListElementByXpath("//div[@class='basket-product']");
    }
}
