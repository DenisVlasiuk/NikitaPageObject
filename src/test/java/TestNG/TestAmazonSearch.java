package TestNG;

import PageObjects.AmazonHomePageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

public class TestAmazonSearch extends TestInit {

    @Test
    public void amazon(){
        AmazonHomePageHelper amazonPageHelper = new AmazonHomePageHelper(driver);
        amazonPageHelper.goToHomePage();
        amazonPageHelper.searchItem("lego");

        amazonPageHelper.goToHomePage();


}
}
