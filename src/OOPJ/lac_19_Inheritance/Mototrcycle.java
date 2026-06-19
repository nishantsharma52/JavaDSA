package OOPJ.lac_19_Inheritance;

public class Mototrcycle extends  Vehicle {
    public String handleBar;
    public String   suspensionType;

    Mototrcycle(String name, String model, int noOfTyres, String handleBar, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBar = handleBar;
        this.suspensionType = suspensionType;

    }
    public void wheelie(){
        System.out.println(name + " is doing wheeelie");
    }

}