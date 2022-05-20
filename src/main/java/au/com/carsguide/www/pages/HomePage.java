package au.com.carsguide.www.pages;

import au.com.carsguide.www.utility.Utility;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyAndSell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement used;




    public void mouseHoverOnBuyAndSell() {
        log.info("Mouse Hover On Buy And Sell" + buyAndSell.toString());
        mouseHoverToElement(buyAndSell);

    }

    public void clickOnSearchCars() {
        log.info("Click on Search Cars" + searchCars.toString());
        mouseHoverToElementAndClick(searchCars);
    }
    public void clickOnUsedOption(){
        log.info("Click on used option"+used.toString());
        clickOnElement(used);
    }

}
