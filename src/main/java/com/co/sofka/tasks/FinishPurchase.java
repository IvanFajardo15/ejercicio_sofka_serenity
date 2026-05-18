package com.co.sofka.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.sofka.userinterfaces.CartPage.BUTTON_PLACE_ORDER;
import static com.co.sofka.userinterfaces.CartPage.BUTTON_PURCHASE;
import static com.co.sofka.userinterfaces.CartPage.MENU_OPTION_CART;
import static com.co.sofka.userinterfaces.CartPage.TXT_CREDIT_CARD;
import static com.co.sofka.userinterfaces.CartPage.TXT_NAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinishPurchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_OPTION_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MENU_OPTION_CART),
                WaitUntil.the(BUTTON_PLACE_ORDER, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_PLACE_ORDER),
                WaitUntil.the(TXT_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("Ivan").into(TXT_NAME),
                Enter.theValue("123").into(TXT_CREDIT_CARD),
                Click.on(BUTTON_PURCHASE)
        );
    }

    public static FinishPurchase on() {
        return Instrumented.instanceOf(FinishPurchase.class).withProperties();
    }
}
