package desafiodio;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileContactStorage implements ContactStorageStrategy {

    private String filePath;
    private Map<String, String> contacts = new HashMap<>();

    public FileContactStorage(String filePath) {
        this.filePath = filePath;
        loadContactsFromFile();
    }

    private void loadContactsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    contacts.put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        saveContactsToFile();
    }

    @Override
    public String getPhoneNumber(String name) {
        return contacts.get(name);
    }

    private void saveContactsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
