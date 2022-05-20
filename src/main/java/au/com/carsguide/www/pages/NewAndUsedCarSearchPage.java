package au.com.carsguide.www.pages;

import au.com.carsguide.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
        @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement verifyMessage;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectAnyMake;
    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement selectAddress;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement selectPrice;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCar;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement verifyText;


    public String verifyPageMessage(){
        log.info("Verify message"+verifyMessage.toString());
       return getTextFromElement(verifyMessage);
    }
    public void selectAnyMake(String make){
        log.info("Select any Make"+selectAnyMake.toString());
        selectByVisibleTextFromDropDown(selectAnyMake,make);
    }
    public void selectModel(String model){
        log.info("Select model"+selectModel.toString());
        waitForElementWithFluentWait(By.xpath("//h1[contains(text(),'New & Used Car Search - carsguide')]"),10,5);
        selectByVisibleTextFromDropDown(selectModel,model);
    }
    public void selectAddress(String address){
        log.info("Select address"+selectAddress.toString());
        selectByVisibleTextFromDropDown(selectAddress,address);
    }
    public void selectPrice(String price){
        log.info("Select price"+selectPrice.toString());
        selectByVisibleTextFromDropDown(selectPrice,price);
    }
    public void clickOnFindMyNextCar(){
        log.info("Click on find my next car"+findMyNextCar.toString());
      clickOnElement(findMyNextCar);
    }
    public String verifyMessage(){
        log.info("Verify text"+verifyText.toString().toString());
        return getTextFromElement(verifyText);

    }

}
