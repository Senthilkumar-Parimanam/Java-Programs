package Lambda_Streams.Streaming;

public class Employee {

    int empNo;
    String empName;
    String desig;
    Integer salary;
    String department;

    public Employee() {
    }

    public Employee(int empNo, String empName, String desig, int salary, String department) {
        this.empNo = empNo;
        this.empName = empName;
        this.desig = desig;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
