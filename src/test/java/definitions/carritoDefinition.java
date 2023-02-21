package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.menuPage;
import pageobjects.tarjetaPage;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;
    public carritoDefinition() {
        menu = new menuPage();
        tarjeta = new tarjetaPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("http://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("se genera el numero de tarjeta")
    public void seGeneraElNumeroDeTarjeta() {
        menu.clickGenerarTargeta();
        menu.ventanaActiva();
        tarjeta.obtenerNroTarjeta();
        tarjeta.obtenerCVV();
        tarjeta.obtenerFecha();
        tarjeta.ventanaInicial();
    }
}
