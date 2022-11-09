package br.com.mercadoLivre.steps;

import br.com.mercadoLivre.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    //instâncias
    HomePage homePage = new HomePage();

    @Test
    public void pesquisarObjetoExistenteNoCampoMercadoLivre(){
        homePage.setEscreverNoMercadoLivre("Smartphone");
        homePage.setLimparCampoMercadoLivre();
        homePage.setEscreverNoMercadoLivre("Televisão");
        homePage.setClicarEmPesquisar();
        Assert.assertEquals ("Televisao", homePage.getValidarPesquisa());
    }

}
