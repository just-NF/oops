public class Main {
     
public static void main(String [] args){
    //OOP => using classes to create objects
    //object => an instance of a class
    //class => a blueprint for creating objects

    Student student1 = new Student();
    Student student2 = new Student();
    //set value
    student1.name = "spongebob";
    student1.age = 10;

    System.out.println(student1.name);
    student1.read();
    student2.read();

}


}