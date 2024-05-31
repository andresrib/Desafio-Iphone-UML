package celular;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
   
    @Override
    public String ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }
    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }
    @Override
    public String exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }
    @Override
    public String adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }
    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }
    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }
    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }
}
