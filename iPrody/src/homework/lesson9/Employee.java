package homework.lesson9;

public class Employee {
    private final String name;
    private final String surname;
    private int age;
    private String position;
    private int salary;
    private int phone;
    private String email;

    public Employee(String name, String surname, int age, String position, int salary, int phone, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                ", email='" + email;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jak", "Kron", 35, "Boss", 2100, 131451, "121@123.com");
        employees[1] = new Employee("Mon", "Fron", 55, "Line", 1500, 131452, "122@123.com");
        employees[2] = new Employee("Luk", "Dron", 65, "Line", 1500, 131453, "123@123.com");
        employees[3] = new Employee("Not", "Mron", 15, "Line", 1500, 131454, "124@123.com");
        employees[4] = new Employee("Don", "Qron", 25, "Line", 1500, 131455, "125@123.com");

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
