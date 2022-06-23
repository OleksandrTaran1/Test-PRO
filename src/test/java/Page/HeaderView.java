package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderView extends BasePage{
    public HeaderView(WebDriver driver) {
        super(driver);
    }
    public WebElement getCart(){
        return getElementByXpathClickable("//div[@class = 'header__cart-button header__cart-button--not-empty']");
    }
}
