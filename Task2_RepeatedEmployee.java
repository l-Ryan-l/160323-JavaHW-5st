import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Task 2:
// Пусть дан список сотрудников: Иван Иванов,Светлана Петрова, Кристина Белова, Анна Мусина,
// Анна Крутова,Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников,
// Петр Петин, Иван Ежов.
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
public class Task2_RepeatedEmployee {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";


        String[] listWorker = employees.split(" ");
        for (int i = 0; i < listWorker.length; i += 2) {
            if (employeeMap.containsKey(listWorker[i])) {
                employeeMap.replace(listWorker[i], employeeMap.get(listWorker[i]) + 1);
            } else {
                employeeMap.put(listWorker[i], 1);
            }
        }

        Map<String, Integer> sortedEmployeeMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : employeeMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
                String key = entry.getKey();
                if (employeeMap.get(key) == i) {
                    sortedEmployeeMap.put(key, employeeMap.get(key));
                }
            }
        }
        System.out.println(sortedEmployeeMap);
    }
}

