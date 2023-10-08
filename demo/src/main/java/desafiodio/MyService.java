package desafiodio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MySingletonBean mySingletonBean;

    @Autowired
    public MyService(MySingletonBean mySingletonBean) {
        this.mySingletonBean = mySingletonBean;
    }

    public void useSingleton() {
        mySingletonBean.showMessage();
    }
}
