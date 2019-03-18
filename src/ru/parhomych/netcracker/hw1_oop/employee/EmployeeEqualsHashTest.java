package ru.parhomych.netcracker.hw1_oop.employee;

public class EmployeeEqualsHashTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Micheal", "Jackson", 100_000);
        Employee employee2 = new Employee(1, "Micheal", "Jackson", 100_000);
        Employee employee3 = new Employee(3, "Вася", "Пупкин", 10_000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println();

        System.out.println("employee1.equals(employee2) --> " + employee1.equals(employee2));
        System.out.println("employee1.equals(employee3) --> " + employee1.equals(employee3));

        System.out.println();

        System.out.println("employee1.hashCode() --> " + employee1.hashCode());
        System.out.println("employee2.hashCode() --> " + employee2.hashCode());
        System.out.println("employee3.hashCode() --> " + employee3.hashCode());

    }
}
