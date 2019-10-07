package co.com.certificacion.automationpractice.task;

import co.com.certificacion.automationpractice.interactions.SelectPrice;
import co.com.certificacion.automationpractice.model.Clothing;
import co.com.certificacion.automationpractice.userinterface.BuyClothesPage;
import co.com.certificacion.automationpractice.utils.ConstantsValues;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.*;

public class BuyClothes implements Task {

    private Clothing clothing;

    public BuyClothes(Clothing clothing) {
        this.clothing = clothing;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(clothing.getClothing()).into(BuyClothesPage.SEARCH).thenHit(Keys.ENTER),
                SelectPrice.menor()
        );

    }

    public static BuyClothes inThePage(Clothing clothing)
    {
        return instrumented(BuyClothes.class, clothing);
    }
}
