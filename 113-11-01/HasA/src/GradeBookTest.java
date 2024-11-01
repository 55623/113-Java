public class GradeBookTest {
    public static void main(String[] args){
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("A1112221009", "吳奇隆");
        students[1] = new Student("A1112221010", "陳宏明");
        students[2] = new Student("A1112221011", "林志霖");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();

    }
}
