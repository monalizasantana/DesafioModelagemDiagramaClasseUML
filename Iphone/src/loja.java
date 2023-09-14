public class loja {

    public static void main(String[] args) {

        Iphone celular = new Iphone();
        ReprodutorMusical musica = (ReprodutorMusical) celular;
        AparelhoTelefonico aparelho = (AparelhoTelefonico) celular;
        NavegadorInternet internet = (NavegadorInternet) celular;

        System.out.println("Música");
        musica.selecionarMusical();
        musica.tocar();
        musica.pausar();

        System.out.println("");

        System.out.println("Ligação");
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("");

        System.out.println("Internet");
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();

    }

}
