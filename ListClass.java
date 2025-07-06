import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
            // Создаем список контактов
            ContactList contactList = new ContactList();

            // Добавляем несколько контактов
            contactList.addContact("Иван Петров", "+7-999-123-45-67");
            contactList.addContact("Анна Сидорова", "+7-999-765-43-21");
            contactList.addContact("Петр Иванов", "+7-999-111-22-33");

            // Выводим все контакты
            System.out.println("Все контакты:");
            for (Contact contact : contactList.getAllContacts()) {
                System.out.println(contact);
            }

            // Поиск по имени
            System.out.println("\nПоиск по имени 'Иван':");
            for (Contact contact : contactList.findByName("Иван")) {
                System.out.println(contact);
            }

            // Поиск по номеру
            System.out.println("\nПоиск по номеру '111':");
            for (Contact contact : contactList.findByPhone("111")) {
                System.out.println(contact);
            }
        }
    }
}
