package ru.parhomych.netcracker.hw1_oop.employee;

public class EmploteeTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("************************* Employee *************************");
        System.out.println("************************************************************");
        System.out.println();

        Employee employee1 = new Employee(1, "John", "Lennon", 100_000);
        Employee employee2 = new Employee(2, "Paul", "McCartney", 80_000);
        Employee employee3 = new Employee(3, "George", "Harrison", 65_000);
        Employee employee4 = new Employee(4, "Ringo", "Starr", 50_000);

        System.out.println("Before changes:");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

        System.out.println();
        System.out.println("After changes:");

        employee1.setSalary(120_000);
        System.out.println("До повышения ЗП Ринго Старру: " + employee4.getSalary()
                + ", после: " + employee4.raiseSalary(80));

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
