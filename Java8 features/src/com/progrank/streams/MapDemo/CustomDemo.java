package src.com.progrank.streams.MapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String empName;
    int salary;

    Employee(int id, String name, int sal) {
        this.empId = id;
        this.empName = name;
        this.salary = sal;
    }
}

public class CustomDemo {
    public static void main(String[] args) {
        List<Employee> emplst = Arrays.asList(
                new Employee(101, "Atul", 100000),
                new Employee(102, "Arun", 500000),
                new Employee(103, "Naveen", 8000000));

        List<Integer> taxToPay = new ArrayList<Integer>();

        taxToPay = emplst.stream().filter(e -> e.salary > 100000).map(e -> (e.salary / 100) * 5)
                .collect(Collectors.toList());
        System.out.println(taxToPay);

    }
}
