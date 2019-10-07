package co.com.certificacion.automationpractice.questions;

import co.com.certificacion.automationpractice.userinterface.BuyClothesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ClothingInTheCart implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String resultado = Text.of(BuyClothesPage.SUCCESS).viewedBy(actor).asString();
        return resultado;
    }

    public static ClothingInTheCart added() {

        return new ClothingInTheCart();
    }
}
