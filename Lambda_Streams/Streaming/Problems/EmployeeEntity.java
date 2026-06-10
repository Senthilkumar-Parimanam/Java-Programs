package Lambda_Streams.Streaming.Problems;

public class EmployeeEntity {
    private int empNumber;
    private String empName;
    private String designation;
    private int salary;


    public EmployeeEntity() {
    }

    public EmployeeEntity(int empNumber, String empName, String designation, int salary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }


    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }


}
