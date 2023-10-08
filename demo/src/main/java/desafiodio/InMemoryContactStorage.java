package desafiodio;
import java.util.HashMap;
import java.util.Map;

public class InMemoryContactStorage implements ContactStorageStrategy {

    private Map<String, String> contacts = new HashMap<>();

    @Override
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    @Override
    public String getPhoneNumber(String name) {
        return contacts.get(name);
    }
}
