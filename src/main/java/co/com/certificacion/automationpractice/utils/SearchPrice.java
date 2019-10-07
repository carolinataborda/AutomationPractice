package co.com.certificacion.automationpractice.utils;

import co.com.certificacion.automationpractice.userinterface.BuyClothesPage;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class SearchPrice {

    public static String menor(List<WebElementFacade> listaPrecios) {
        int precioMenor = 999999;
        int indice = 0;

        for (int i = 0; i < listaPrecios.size(); i++) {
            int precio = Integer.parseInt(listaPrecios.get(i).getText().replace("$", "").replace(".", "").trim());
            System.out.println("Price" +  precio);
            if (precioMenor>precio){
                System.out.println("Precio" + precio);
                precioMenor= precio;

                System.out.println("Precio Menor" + precioMenor);
                indice= i;
            }

        }

        System.out.println("Ver hotel"+ listaPrecios.get(indice).getText());
    return String.valueOf(indice+1);
    }
}
