public class Student {
    private String studentID;
    private String name;

    public Student(){
        new Student("000000", "未知");
    }

    public Student(String studentID){
        new Student(studentID, "未知");
    }

    public Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getName(){
        return name;
    }

    //public void setStudentID(String studentID){
    //    this.studentID = studentID;
    //}
    //若不會更改，則不用打set

    public void setname(String name){
        this.name = name;
    }

    public void printData(){
        System.out.printf("%s %s", studentID, name);
    }
}
