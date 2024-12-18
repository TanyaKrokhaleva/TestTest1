package lesson13.PhoneBook;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Крохалева", "89092493546");
        phoneBook.add("Крохалева", "89092493545");
        phoneBook.add("Крупская", "89092493545");

        phoneBook.get("Крупская");
        phoneBook.get("Крохалева");


    }
}
