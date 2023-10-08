package desafiodio;
public class MySingletonBean {

    private static MySingletonBean instance;

    private MySingletonBean() {
        // Construtor privado para evitar a criação de instâncias diretas
    }

    public static MySingletonBean getInstance() {
        if (instance == null) {
            instance = new MySingletonBean();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Esta é uma instância Singleton de MySingletonBean.");
    }
}
