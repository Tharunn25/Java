
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("The name of the person is : " + name);
        System.out.println("The age of the person is : " + age);
    }
}

class Student extends Person {
    String course;
    int marks;

    void displayStudent() {
        System.out.println("The course of the student is : " + course);
        System.out.println("The marks of the student is : " + marks);
    }
}

public class Runtime {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.course = "selling";
        s1.marks = 92;
        s1.name = "leo das";
        s1.age = 22;

        s1.displayStudent();
        s1.displayPerson();

    }
}