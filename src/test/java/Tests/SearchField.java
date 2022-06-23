package Tests;

import Page.HomePage;
import Page.SearchResultPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchField extends TestInit {

    @Test
    public void searchEpic() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateEpicentrk();
        homePage.searchField().sendKeys("бензопила\n");
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.searchResult().size() > 10);
        Assert.assertTrue(searchResultPage.categoryName().isDisplayed());

    }
}
