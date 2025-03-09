public class Student {

    String firstname;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;

    public static void main(String [] args) {
        Student myStudent = new Student();
        myStudent.firstname = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Buisness";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        System.out.println(myStudent.gpa);
    }
}
