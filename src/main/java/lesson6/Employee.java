package lesson6;

public class Employee {
    private String name;
    private String surname;
    private String family;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFamily() {
        return family;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

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
        System.out.println("Имя: " + employee.getName());
        System.out.println("Фамилия: " + employee.getSurname());
        System.out.println("Отчество: " + employee.getFamily());
        System.out.println("Должность: " + employee.getPosition());
        System.out.println("E-mail: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Зарплата: " + employee.getSalary() + " руб.");
        System.out.println("Возраст: " + employee.getAge());
    }



}
