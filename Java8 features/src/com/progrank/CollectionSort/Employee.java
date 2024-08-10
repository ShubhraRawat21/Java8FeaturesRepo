package src.com.progrank.CollectionSort;

public class Employee {
    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        super();
        this.empName = empName;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + empId +
                ", name='" + empName + '\'' +
                '}';
    }

}
