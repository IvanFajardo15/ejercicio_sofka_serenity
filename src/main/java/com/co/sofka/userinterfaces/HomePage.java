package com.co.sofka.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LINK_FIRST_ARTICLE = Target.the("Link for first article")
            .locatedBy("//a[text ()='Samsung galaxy s6']");
    public static final Target LINK_SECOND_ARTICLE = Target.the("Link for second article")
            .locatedBy("//a[text ()='Sony xperia z5']");
    public static final Target BUTTON_ADDTOCART = Target.the("Button for add to cart")
            .locatedBy("//a[text ()='Add to cart']");
}
