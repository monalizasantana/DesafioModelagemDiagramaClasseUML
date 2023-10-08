package desafiodio.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import desafiodio.ContactStorageStrategy;
import desafiodio.FileContactStorage;
import desafiodio.InMemoryContactStorage;
import desafiodio.Phonebook;

@SpringBootApplication
public class DesafioDioDesignPaternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioDesignPaternsApplication.class, args);

		 ContactStorageStrategy inMemoryStrategy = new InMemoryContactStorage();
        Phonebook phonebook1 = new Phonebook(inMemoryStrategy);

        // Usando a estratégia de armazenamento em arquivo
        ContactStorageStrategy fileStrategy = new FileContactStorage("contacts.txt");
        Phonebook phonebook2 = new Phonebook(fileStrategy);


		 // Adicione e recupere contatos
		 phonebook1.addContact("Alice", "123-456-7890");
		 phonebook2.addContact("Bob", "987-654-3210");
		 phonebook1.addContact("Ana", "1234-567-7890");
 
		 System.out.println("Alice's phone number: " + phonebook1.getPhoneNumber("Alice"));
		 System.out.println("Bob's phone number: " + phonebook2.getPhoneNumber("Bob"));
		 System.out.println("Ana's phone number: " + phonebook1.getPhoneNumber("Ana"));
 
	}

}

