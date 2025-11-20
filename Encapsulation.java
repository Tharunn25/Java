
class Student{

    private String name;
    private int age;


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name; 
    }
    public void setAge(int age){
        this.age = age;
    }

    void display(){
        System.out.println("The name is " + name);
        System.out.println("The age is : " + age);
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("leo das");
        s1.setAge(22);
        s2.setName("harold das");
        s2.setAge(40);
        s1.display();
        s2.display();

        
    }
}
