
import lesson6.Employee;

public class Main {
    public static void main(String[] args) {
        MethodsLesson4 methodsLesson4 = new MethodsLesson4();
        methodsLesson4.printThreeWords();
        methodsLesson4.checkSumSign();
        methodsLesson4.printColor();
        methodsLesson4.compareNumbers();
        System.out.println(methodsLesson4.isSumInRange(5, 64));
        methodsLesson4.checkNumber(-9);
        System.out.println(methodsLesson4.isNegative(10));
        methodsLesson4.printStringMultipleTimes("Строка", 5);
        System.out.println(methodsLesson4.getLeapYear(2134));
        methodsLesson4.replaceNumbers();
        methodsLesson4.setArray();
        methodsLesson4.setArray2();
        methodsLesson4.squareArray();
        methodsLesson4.changedArray(10, "пыщь");
        Employee employee = new Employee("Анна", "Иванова", "Олеговна", "Юрист", "aaaaa@ya.ru", "+79999999999", 100000, 23);
        employee.printEmployee(employee);

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Анна", "Иванова", "Олеговна", "Юрист", "aaaaa@ya.ru", "+79999999990", 100000, 30);
        empArray[1] = new Employee("Ольга", "Петрова", "Ивановна", "Инженер", "qqqqq@ya.ru", "+79999999991", 50000, 23);
        empArray[2] = new Employee("Соня", "Сидорова", "Денисовна", "Директор", "wwwww@ya.ru", "+79999999992", 200000, 50);
        empArray[3] = new Employee("Ирина", "Попова", "Игоревна", "Секретарь", "rrrrr@ya.ru", "+79999999993", 10000, 30);
        empArray[4] = new Employee("Карина", "Вавилова", "Дмитриевна", "Логист", "ggggg@ya.ru", "+79999999994", 80000, 47);

    }


}


























