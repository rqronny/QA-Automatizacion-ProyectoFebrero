package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class tarjetaPage extends util {
    @FindBy(xpath = "//*[contains(text(),'Card Number:')]") protected WebElement lblNroTargeta;
    @FindBy(xpath = "//*[contains(text(),'CVV:')]") protected WebElement lblCvvTargeta;
    @FindBy(xpath = "//*[contains(text(),'Exp:')]") protected WebElement lblExpTargeta;

    public tarjetaPage() {
        PageFactory.initElements(driver, this);
    }

    public void obtenerNroTarjeta(){
        wait.until(ExpectedConditions.visibilityOf(lblNroTargeta));
        String texto = lblNroTargeta.getText();
        System.out.println(texto);
    }

    public void obtenerCVV(){
        String texto = lblCvvTargeta.getText();
        System.out.println(texto);
    }

    public void obtenerFecha(){
        String texto = lblExpTargeta.getText();
        System.out.println(texto);
    }
}
