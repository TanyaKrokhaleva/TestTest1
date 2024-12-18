package lesson13.PhoneBook;

import java.util.*;

public class PhoneBook {

    private final Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(number);
            System.out.println("К контакту " + surname + " добавлен новый номер ");
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(surname, numbers);
            System.out.println("Контакт " + surname + " добавлен в телефонную книгу");
        }
    }
    public void get(String partialSurname) {
        System.out.println("\nНайденные контакты:");
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(partialSurname)) {
                String phoneNumbers = String.join(", ", entry.getValue());
                System.out.println(entry.getKey() + ": " + phoneNumbers);
            }
        }
    }
}
