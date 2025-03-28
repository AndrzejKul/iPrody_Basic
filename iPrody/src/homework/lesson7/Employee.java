package homework.lesson7;

public class Employee {

    private String name;
    private String surname;
    private String position;
    private String email;
    private int phone;
    private int age;

    public Employee(int age, String email, String name, int phone, String position, String surname) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public Employee() {
        this.name = "default";
        this.surname = "default";
        this.position = "default";
        this.phone = -1;
        this.email = "default";
        this.age = -1;
    }
}
