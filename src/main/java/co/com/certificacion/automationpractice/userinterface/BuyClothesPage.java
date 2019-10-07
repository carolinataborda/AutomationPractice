package co.com.certificacion.automationpractice.userinterface;


import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyClothesPage {

    public static final Target SEARCH = Target.the("Search").located(By.xpath("//*[@id='search_query_top']"));
    public static Target LIST_PRICES = Target.the("List Prices").locatedBy("//*[@id='center_column']/ul/li/div/div[2]/div[1]/span[1]");
    public static Target ADD_CART = Target.the("Add to cart").locatedBy("//p[@id='add_to_cart']/button");
    public static Target MIN_PRICE = Target.the("Min Prices").locatedBy("//*[@id='center_column']/ul/li[{0}]/div//img");
    public static Target SUCCESS = Target.the("SUCESS").locatedBy("//*[@id='layer_cart']/div[1]/div[1]/h2/text()");
    public static IFrame FRAME_ADD_CAR = IFrame.withPath(By.xpath("//*[@class='fancybox-overlay fancybox-overlay-fixed']//iframe"));




}

