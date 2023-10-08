package desafiodio;

import org.springframework.stereotype.Component;

@Component
public interface ContactStorageStrategy {
    void addContact(String name, String phoneNumber);
    String getPhoneNumber(String name);
}


