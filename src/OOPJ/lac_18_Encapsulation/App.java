package OOPJ.lac_18_Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {
//        System.out.println("hello world");
        // Default ctor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 18;
//        A.name = "tichkule";
//        A.nos = 5;
//
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();
        // by parameterized constructor
        Student A = new Student(1,14,"sachin",144, "tina");
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.nos);
//        A.bunk();
//        A.sleep();
//        A.study();

        // copy constructor
        Student B = new Student(A);
//        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setAge(67);
        System.out.println(A.getAge());
//        System.out.println(A.name);
//        System.out.println(A.nos);




    }
}