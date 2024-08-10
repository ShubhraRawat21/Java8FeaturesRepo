package src.com.progrank.CollectionSort;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        List<Employee> lst = new ArrayList<Employee>();
        lst.addAll(Arrays.asList(
                new Employee("Dhruv", 101),
                new Employee("Yash", 102),
                new Employee("Shubhra", 103)));
        System.out.println(lst);
        // 1.
        // Comparator<Employee> comp = new Comparator<Employee>() {
        // @Override
        // public int compare(Employee e1, Employee e2) {
        // return e1.getEmpName().compareTo(e2.getEmpName());
        // }
        // };
        // Collections.sort(lst, comp)

        // 2. Lembda implementation, directly defining the method inside parameter)
        // Collections.sort(lst, (Employee e1, Employee e2) ->
        // (e1.getEmpName().compareTo(e2.getEmpName())));

        // 3.Method Referencing
        // Syntax - Class_name(this is the class where method is defined) ::
        // Method_name(the method that contains definition)
        Collections.sort(lst, Comparator.comparing(Employee::getEmpName));

        System.out.println(lst);
    }
}
