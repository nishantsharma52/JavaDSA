package OOPJ.lac_20_poly;


public class Main {
    static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3, 5));
//
//        Circle c = new Circle();
//        doDrawingStuff(c);
//
//        Rect r = new Rect();
//        doDrawingStuff(r);
        // DOWN CASTING:
        Circle c = new Circle();
        doDrawingStuff(c);
        // BUT D-C WILL CAUSE ERROR:
        Rect r = new Rect();
        doDrawingStuff(r);
        // throws : Exception in thread "main" java.lang.ClassCastException: class OOPS.lec_20PolyM.Rect cannot be cast to class OOPS.lec_20PolyM.Circle (OOPS.lec_20PolyM.Rect and OOPS.lec_20PolyM.Circle are in unnamed module of loader 'app')
        //	at OOPS.lec_20PolyM.Main.doDrawingStuff(Main.java:24)
        //	at OOPS.lec_20PolyM.Main.main(Main.java:19)
    }
    //Dynamic Method Dispatch (Runtime Polymorphism)
    public static void doDrawingStuff(Shape s) {
        s.draw();
        Circle c = (Circle)s; // down-casting
        c.draw();
    }
}