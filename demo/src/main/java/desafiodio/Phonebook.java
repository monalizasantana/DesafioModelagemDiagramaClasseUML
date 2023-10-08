package desafiodio;

import org.springframework.stereotype.Component;

@Component
public class Phonebook {
    private ContactStorageStrategy storageStrategy;

    public Phonebook(ContactStorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public void addContact(String name, String phoneNumber) {
        storageStrategy.addContact(name, phoneNumber);
    }

    public String getPhoneNumber(String name) {
        return storageStrategy.getPhoneNumber(name);
    }
}
