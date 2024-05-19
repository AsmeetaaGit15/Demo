package test;

public class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        System.out.println("This is the default constructor");
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
        //System.out.println("This is the parameterized constructor");
    }

    public static void main(String args[]) {

        Student defaultStudent = new Student();
        //

       // System.out.println("\nDefault Constructor values:");
       // System.out.println("Student id:" + defaultStudent.id);
        //System.out.println("Student name:" + defaultStudent.name);

        Student parameterizedStudent = new Student(10, "David");

        System.out.println("\nParameterized Constructor values:");
        System.out.println("Student id:" + parameterizedStudent.id);
        System.out.println("Student name:" + parameterizedStudent.name);
    }
}
