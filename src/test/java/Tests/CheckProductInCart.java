package Tests;

import Page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckProductInCart extends TestInit {

    @Test
    public void CheckCart() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateEpicentrk();
        homePage.searchField().sendKeys("Бензопила\n");

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.getChainsawCategory().click();

        ListOfGoods listOfGoods = new ListOfGoods(driver);
        listOfGoods.getProductSelection().click();

        ChosenProduct chosenProduct = new ChosenProduct(driver);
        chosenProduct.buyProduct().click();
        chosenProduct.getQuantity(2, chosenProduct.getProductQuantity());

        Cart cart = new Cart(driver);
        cart.closeTheCart().click();

        HeaderView headerView = new HeaderView(driver);
        headerView.getCart().click();

        Assert.assertTrue(cart.getToOrder().isDisplayed());
        Assert.assertTrue(cart.goodsInTheCart().size() > 0);
    }


}
