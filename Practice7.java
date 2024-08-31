/*
 * 
Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.
 */

 class Student{
    private int studentId;
    private String studentName;
    private String grade;

    public Student(){
        this(0,"Unkown","Unknown");
    }

    public Student(String studentName,String grade){
            this(0,studentName,grade);
    }

    public Student(int studentId,String studentName,String grade){
    this.studentId = studentId;
    this.studentName = studentName;
    this.grade = grade;
    }

    public int getId(){
        return studentId;
    }
    public String getName(){
        return studentName;
    }
    public String getGrade(){
        return grade;
    }
 }

 public class Practice7{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Grade: " + s1.getGrade());

        Student s2 = new Student("Alice", "A");
        System.out.println("\nStudent 2:");
        System.out.println("ID: " + s2.getId());
        System.out.println("Name: " + s2.getName());
        System.out.println("Grade: " + s2.getGrade());

        Student s3 = new Student(123, "Bob", "B");
        System.out.println("\nStudent 3:");
        System.out.println("ID: " + s3.getId());
        System.out.println("Name: " + s3.getName());
        System.out.println("Grade: " + s3.getGrade());
    }
 }