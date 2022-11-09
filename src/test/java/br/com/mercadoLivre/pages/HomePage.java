package br.com.mercadoLivre.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private static final By campoMercadoLivre =
            new By.ByCssSelector("[class=\"nav-search-input\"]");
    private static final By limparCampoMercadoLivre =
            new By.ByCssSelector("[class=\"nav-search-input\"]");
    private static final By clicarEmPesquisar =
            new By.ByCssSelector("[class=\"nav-search-btn\"]");
    private static final By validarPesquisa =
            new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops-custom-" + "" + "primary-font\"]");


    public void setEscreverNoMercadoLivre(String pesquisar){
        sendKeys(campoMercadoLivre, pesquisar);}
    public void setLimparCampoMercadoLivre() {
        limparCampo (limparCampoMercadoLivre);}

    public void setClicarEmPesquisar() {
        click(clicarEmPesquisar);}

    public String getValidarPesquisa(){
        return lerText(validarPesquisa);}

}
