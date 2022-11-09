package br.com.mercadoLivre.util;

import br.com.mercadoLivre.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends BaseSteps {

    // Método para pegar um elemento
    public static WebElement element(By by){
        return driver.findElement(by);
    }

    // Metodo para esperar um elemento
    public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
