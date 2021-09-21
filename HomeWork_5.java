public class HomeWork_5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("James Smith", "Director",
                        "JSmith@mail.com", "+1999555333", 300000, 50),
                new Employee("Robert Johnson", "Accountant",
                        "robbibi@mail.com", "+1999555222", 200000, 49),
                new Employee("Michael Williams", "Manager",
                        "mihaha@mail.com", "+1999555111", 60000, 33),
                new Employee("Thomas Moore", "Secretary",
                        "myrzik@mail.com", "+1999555000", 40000, 25),
                new Employee("Scott Sanchez", "Security",
                        "ssanya123@mail.com", "+19995553666", 30000, 40)
        };
        for (Employee employee : employees)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}
class Employee {
    private String name;
    private String post;
    String email;
    String phone;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getPost() {
        return post;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return name + ", " + post + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}
