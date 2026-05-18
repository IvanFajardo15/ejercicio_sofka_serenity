package com.co.sofka.stepdefinitios;

import com.co.sofka.questions.ValidateTheFinalMessage;
import com.co.sofka.tasks.AddArticleToCart;
import com.co.sofka.tasks.FinishPurchase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.sofka.userinterfaces.CartPage.TXT_MESSAGE;
import static com.co.sofka.utils.Constants.ACTOR;
import static com.co.sofka.utils.Constants.URL;
import static org.hamcrest.Matchers.containsString;

public class PurchaseOnSiteStepDefinitions {
    @Given("As a demoblaze user i was on the website")
    public void asADemoblazeUserIWasOnTheWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(URL)
        );
    }

    @When("i add products to the cart")
    public void iAddProductsToTheKart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddArticleToCart.on()
        );
    }

    @And("i complete the purchase form")
    public void iCompleteThePurchaseForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinishPurchase.on()
        );
    }

    @Then("^i can see the (.*) on screen$")
    public void iCanFinishThePurchase(String message) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheFinalMessage.on(TXT_MESSAGE), containsString(message))
        );
    }

}
