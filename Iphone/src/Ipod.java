public class Ipod implements ReprodutorMusical{

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