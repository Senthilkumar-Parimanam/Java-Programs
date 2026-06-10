package A_Basics.LanguageStructure.UserDefinedDataType.Enum;

public class SingletonEnum {

    enum EnumSingleton {
        INSTANCE;
        private int empNumber;
        private String empName;
        private String desig;
        private int salary;

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


        public static void main(String[] args) {
            EnumSingleton singleton = EnumSingleton.INSTANCE;

            System.out.println("getEmpNumber"+singleton.getEmpNumber());
            System.out.println("getEmpName"+singleton.getEmpName());
            System.out.println("getDesig"+singleton.getDesig());
            System.out.println("getSalary"+singleton.getSalary());


        }



}
