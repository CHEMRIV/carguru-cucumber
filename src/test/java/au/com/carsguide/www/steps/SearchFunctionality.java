package au.com.carsguide.www.steps;

import au.com.carsguide.www.pages.HomePage;
import au.com.carsguide.www.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchFunctionality {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        String expectedMsg = "New & Used Car Search - carsguide";
        Assert.assertEquals("No match Found", expectedMsg, new NewAndUsedCarSearchPage().verifyPageMessage());
    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectAnyMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModel(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String address) {
        new NewAndUsedCarSearchPage().selectAddress(address);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();
    }


    @Then("^I should see the results$")
    public void iShouldSeeTheResults() {

    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedOption();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        String expectedMsg="Used Cars For Sale";
        Assert.assertEquals("Not match found",expectedMsg,new NewAndUsedCarSearchPage().verifyMessage());
    }
}
