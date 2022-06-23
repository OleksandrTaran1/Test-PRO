package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChosenProduct extends BasePage {

    public ChosenProduct(WebDriver driver) {
        super(driver);
    }

    public WebElement buyProduct() {
        return getElementByXpathClickable("//div[@data-is='ProductBuy'] //button[@class='p-buy__btn btn btn--yellow']");
    }

   public WebElement getProductQuantity (){
       return getElementByXpathClickable("//button[@data-delta='1']");
    }


}

