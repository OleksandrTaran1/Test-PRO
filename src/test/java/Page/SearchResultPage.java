package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends BasePage{


    public SearchResultPage(WebDriver driver) {
            super(driver);
        }
    public List<WebElement> searchResult(){

        return getListElementByXpath("//*[contains(text(), 'Бензопила')]");
    }
    public WebElement categoryName (){
        return getElementByXpath("//*[contains(text(), 'Бензопили ')] [@class='nc']");
    }
    public WebElement getChainsawCategory () {
        return getElementByXpathClickable("//a[@href='/ua/shop/benzopily-i-elektropily/fs/klass-bytovye/'] [@class='shop-categories__item-title nc']");
    }

}
