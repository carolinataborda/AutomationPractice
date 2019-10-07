package co.com.certificacion.automationpractice.interactions;

import co.com.certificacion.automationpractice.task.BuyClothes;
import co.com.certificacion.automationpractice.userinterface.BuyClothesPage;
import co.com.certificacion.automationpractice.utils.SearchPrice;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;


import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectPrice implements Interaction {

    private WebDriver suNavegador;
    private WebElement frameId;

    @Override
        public <T extends Actor> void performAs(T actor) {
            String indice= SearchPrice.menor(BuyClothesPage.LIST_PRICES.resolveAllFor(actor));
            System.out.println(BuyClothesPage.ADD_CART.getCssOrXPathSelector());
            actor.attemptsTo(
                    Scroll.to(BuyClothesPage.MIN_PRICE.of(indice)).andAlignToBottom(),
                    Click.on(BuyClothesPage.MIN_PRICE.of(indice)),
                    Switch.toFrame(0));

           actor.attemptsTo(
                 WaitUntil.the(BuyClothesPage.ADD_CART, isEnabled()),
                  Click.on(BuyClothesPage.ADD_CART));
        }


        public static SelectPrice menor(){

            return Tasks.instrumented(SelectPrice.class);
        }
    }


