package com.co.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra.feature",
        glue = "com.co.sofka.stepdefinitios",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class PurchaseOnSiteRunner {

}
