package lesson6;

public class Employee {
    public String name;
    public String surname;
    public String family;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;



    public Employee(String name, String surname, String family, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.family = family;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printEmployee(Employee employee) {
        System.out.println("Имя: " + employee.name);
        System.out.println("Фамилия: " + employee.surname);
        System.out.println("Отчество: " + employee.family);
        System.out.println("Должность: " + employee.position);
        System.out.println("E-mail: " + employee.email);
        System.out.println("Телефон: " + employee.phone);
        System.out.println("Зарплата: " + employee.salary + " руб.");
        System.out.println("Возраст: " + employee.age);
    }



}
