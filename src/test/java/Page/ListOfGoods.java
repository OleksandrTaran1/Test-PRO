package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfGoods extends BasePage{
    public ListOfGoods(WebDriver driver) {
        super(driver);
    }
    public WebElement getProductSelection(){
        return getElementByXpathClickable("//b[@class = 'nc']");
    }

    }
