package co.com.certificacion.automationpractice.stepdefinitions;

import co.com.certificacion.automationpractice.questions.ClothingInTheCart;
import co.com.certificacion.automationpractice.task.BuyClothes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.certificacion.automationpractice.model.Clothing;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.certificacion.automationpractice.utils.ConstantsValues.PageURL;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationStepDefinitions {

    @Before
    public void configuracionInicialURL() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(suNavegador)));
        theActorCalled("Carolina");
    }

    @Managed
    private WebDriver suNavegador;

    @Given("^the user opens a ecommerce site$")
    public void theUserOpensAEcommerceSite() {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(PageURL));
    }
    @When("^the user is selecting the (.*)$")
    public void theUserIsSelectingA(Clothing clothing) {
    theActorInTheSpotlight().attemptsTo(
            BuyClothes.inThePage(clothing)
    );
    }

    @Then("^he can select the clothing with lowest priced$")
    public void heCanSelectTheClothingWithLowestPriced() {
    theActorInTheSpotlight().should(seeThat("Product successfully added to your shopping cart", ClothingInTheCart.added()));
    }
}
