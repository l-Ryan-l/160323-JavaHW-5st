import java.util.HashMap;
import java.util.List;


// Task 1:
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
public class Task1_PhonebookMap {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addEmployee();
        printEmployee("Petrov");
    }
    public static void addEmployee() {
        phoneBook.put("Ivanov", List.of("79998887766", "78889996655"));
        phoneBook.put("Petrov", List.of("79998885544"));
        phoneBook.put("Vasiliev", List.of("79998884433"));
    }
    public static void printEmployee(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
