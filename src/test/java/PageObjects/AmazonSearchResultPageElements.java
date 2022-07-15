package PageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultPageElements extends DriverHolder {

    public AmazonSearchResultPageElements(WebDriver driver){
        super(driver);

    }

    private String firstSearchResult = "//span[contains(text(), '75252')]";
    public WebDriver getFirstSearchResult(){
        return getElementByXpath(firstSearchResult);

    }

}
