

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{


    @Override
    public void exibirPagina() {
        System.out.println("Exibir uma Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar uma Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atulaizar Página");
    }
    @Override
    public void ligar(){

        System.out.println("Fazer uma ligação");
    }

    @Override
    public void atender(){

        System.out.println("Atender uma ligação");
    }

    @Override
    public void iniciarCorreioVoz(){
        
        System.out.println("Iniciar Correio de Voz");
    }


    @Override
    public void pausar() {
        System.out.println("Pause");
        
    }

    @Override
    public void selecionarMusical() {
        System.out.println("Selecionar Musica");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocar Música");        
    }


}