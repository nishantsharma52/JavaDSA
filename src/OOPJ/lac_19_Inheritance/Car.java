package OOPJ.lac_19_Inheritance;

public class Car extends Vehicle{
    public String transmissionType;
    public int noOfDoors;

    Car(String name, String model,  int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres); // super should be the first statement
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
//        super.starEng(); can call a method of immediate class
    }

    public void startAc() {
        System.out.println("AC started of : " + name);

    }
}