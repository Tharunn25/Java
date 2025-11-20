class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("The name is : " + name);
        System.out.println("The age is : " + age);
    }

}

public class constructors {
    public static void main(String[] args) {

        Student s1 = new Student("leo das",21);
        Student s2 = new Student("harold das", 40);
        s1.display();
        s2.display();

        
    }
    
}
