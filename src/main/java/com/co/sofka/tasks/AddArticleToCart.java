package com.co.sofka.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.sofka.userinterfaces.HomePage.BUTTON_ADDTOCART;
import static com.co.sofka.userinterfaces.HomePage.LINK_FIRST_ARTICLE;
import static com.co.sofka.userinterfaces.HomePage.LINK_SECOND_ARTICLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddArticleToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LINK_FIRST_ARTICLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINK_FIRST_ARTICLE),
                Click.on(BUTTON_ADDTOCART),
                Browser.navigateBack(),
                Browser.navigateBack(),
                WaitUntil.the(LINK_SECOND_ARTICLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINK_SECOND_ARTICLE),
                Click.on(BUTTON_ADDTOCART),
                Browser.navigateBack(),
                Browser.navigateBack()
        );
    }

    public static AddArticleToCart on() {
        return Instrumented.instanceOf(AddArticleToCart.class).withProperties();
    }
}

