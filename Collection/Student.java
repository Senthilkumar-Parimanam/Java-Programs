package Collection;

class Student {

    private String studentName;
    private int studentNumber;
    private int total;

    public Student(){

    }

    public Student(String studentName, int studentNumber, int total) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.total = total;
     }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode(){
        return studentNumber;
    }

    @Override
    public boolean equals(Object ob){
        Student st = (Student) ob;
        if(this.studentName.equals(st.studentName)){
            return true;
        }else {
            return false;
        }
    }

}