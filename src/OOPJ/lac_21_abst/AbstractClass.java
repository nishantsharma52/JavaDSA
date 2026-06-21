package OOPJ.lac_21_abst;

//abstract  class Bird { // uppr uppr se Concept bna diya
//    abstract void fly();
//    abstract void eat();
//
//   private void sleep() {
//        System.out.println("Bird is Sleeping");
////        same for all
//    }
//}
//
//class sparrow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow Flying faster");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//class Crow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Crow Flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating slower");
//    }
//}
//
//public class AbstractClass {
//    static void doBirdStuff(Bird b) {
//        // does not care about implementation
//        b.eat();
//        b.fly();
//        b.sleep();
//    }
//    static void main(String[] args) {
//        doBirdStuff(new sparrow());
//        doBirdStuff(new Crow());
//        }
//    }