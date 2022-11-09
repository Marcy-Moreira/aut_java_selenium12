package br.com.mercadoLivre.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void browserUp(String url){

        String caminhoChromeDriver = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);

        driver = new ChromeDriver();  // Instancia e cria um browser
        wait = new WebDriverWait(driver, 40); // Delay
        driver.get(url);
        driver.manage().window().maximize();  // Maximizar a janela do brownser
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS); // Definir um tempo para iniciar

    }

    public void browserDown(){
        driver.manage().timeouts().implicitlyWait(6000000, TimeUnit.SECONDS);
        driver.quit();
    }



}
