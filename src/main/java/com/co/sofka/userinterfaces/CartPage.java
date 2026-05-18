package com.co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target MENU_OPTION_CART = Target.the("option for cart page")
            .locatedBy("//a[text() = 'Cart']");
    public static final Target BUTTON_PLACE_ORDER = Target.the("button for place order")
            .locatedBy("//button[text()='Place Order']");
    public static final Target TXT_NAME = Target.the("textbox for name")
            .locatedBy("//input[@id='name']");
    public static final Target TXT_CREDIT_CARD = Target.the("textbox for credit card")
            .locatedBy("//input[@id='card']");
    public static final Target BUTTON_PURCHASE = Target.the("Option for finish purchase")
            .locatedBy("//button[text()='Purchase']");
    public static final Target TXT_MESSAGE = Target.the("Message for successful purchase")
            .locatedBy("//h2[text()='Thank you for your purchase!']");
}
