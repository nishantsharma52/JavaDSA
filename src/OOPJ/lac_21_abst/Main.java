package OOPJ.lac_21_abst;

// INTERFACE
interface Bird { // uppr uppr se Concept bna diya

    void fly();
    void eat();
    default void sleep(){
        System.out.println("Sleeping");
    }
}
interface Walk { // uppr uppr se Concept bna diya

    void walking();
}
// multiple inh.
class sparrow implements Bird, Walk {

    @Override
    public void fly() {
        System.out.println("Sparrow Flying faster");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    public void walking() {
        System.out.println("Sparrow walking");
    }
}
class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating slower");
    }
}

public class Main {
    static void doBirdStuff(Bird b) {
        // does not care about implementation
        b.eat();
        b.fly();
        b.sleep();
    }
    static void main(String[] args) {
        doBirdStuff(new sparrow());
        doBirdStuff(new Crow());
    }
}