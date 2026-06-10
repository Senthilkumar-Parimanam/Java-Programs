package Collection;

class Employee {

    private String empName;
    private int empNumber;
    private String desig;
    private int salary;

    public Employee(){

    }

    public Employee(String empName, int empNumber, String desig, int salary) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.desig = desig;
        this.salary = salary;
    }




    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}