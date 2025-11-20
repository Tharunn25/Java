
class Student{
    String name;
    int age;

    void display(){
        System.out.println("The name is : " + name);
        System.out.println("The age is : " + age);
    }
}
public class nameClass {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Leo Das";
        s.age = 22;
        s.display();
    

        
    }
    
}
