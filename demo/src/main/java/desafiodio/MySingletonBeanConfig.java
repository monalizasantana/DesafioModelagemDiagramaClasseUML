package desafiodio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySingletonBeanConfig {

    @Bean
    public MySingletonBean mySingletonBean() {
        return MySingletonBean.getInstance();
    }
}
