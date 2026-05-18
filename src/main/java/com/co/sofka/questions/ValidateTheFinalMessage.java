package com.co.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateTheFinalMessage implements Question<String> {

    protected Target element;

    public ValidateTheFinalMessage(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String> on(Target element) {
        return new ValidateTheFinalMessage(element);
    }
}
