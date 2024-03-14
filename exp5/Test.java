import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private int age;

    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class SalariedEmployee extends Employee {
    private double empSalary;

    public SalariedEmployee(String name, String id, int age, double empSalary) {
        super(name, id, age);
        setEmpSalary(empSalary);
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double calculateSalary() {
        if (this instanceof PermanentEmployee) {
            return empSalary + 2000;
        } else {
            return empSalary;
        }
    }
}

class PermanentEmployee extends SalariedEmployee {
    public PermanentEmployee(String name, String id, int age, double empSalary) {
        super(name, id, age, empSalary);
    }
}

class ContractEmployee extends SalariedEmployee {
    public ContractEmployee(String name, String id, int age, double empSalary) {
        super(name, id, age, empSalary);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalariedEmployee[] employees = new SalariedEmployee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline character

            System.out.print("Is the employee permanent (yes/no): ");
            String permanent = scanner.nextLine().toLowerCase();

            if (permanent.equals("yes")) {
                employees[i] = new PermanentEmployee(name, id, age, salary);
            } else {
                employees[i] = new ContractEmployee(name, id, age, salary);
            }
        }

        // Find employee with highest salary
        SalariedEmployee highestPaidEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].calculateSalary() > highestPaidEmployee.calculateSalary()) {
                highestPaidEmployee = employees[i];
            }
        }

        System.out.println("\nDetails of the employee with highest salary:");
        System.out.println("Name: " + highestPaidEmployee.getName());
        System.out.println("ID: " + highestPaidEmployee.getId());
        System.out.println("Age: " + highestPaidEmployee.getAge());
        System.out.println("Salary: " + highestPaidEmployee.calculateSalary());
    }
}
