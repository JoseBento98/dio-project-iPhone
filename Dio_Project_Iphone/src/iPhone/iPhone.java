package iPhone;

import iPhone.AparelhoTelefonico.AparelhoTelefonico;
import iPhone.NavegadorInternet.NavegadorNaInternet;
import iPhone.ReprodutorMusical.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        iPhone dispositivo = new iPhone();
        
        // Testando funcionalidades do ReprodutorMusical
        dispositivo.tocar();
        dispositivo.pausar();
        dispositivo.selecionarMusica("Misfits - Dust to Dust");

        // Testando funcionalidades do AparelhoTelefonico
        dispositivo.ligar("123456789");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorNaInternet
        dispositivo.exibirPagina("https://www.dio.me/");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}

