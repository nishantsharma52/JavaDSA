public class Variables {
    static  void main(){
        // define or initialize:
        int totalmarks = 100;
        System.out.println(totalmarks);

        //Case sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println("weight" + weight);
        System.out.println("WEIGHT" + WEIGHT);

        //starting letters
        int marks = 100;
        int MARKS = 90;
        int _marks = 70;
        int $marks = 60;

        // no reserved keywords
        //int class = 50;
        int main = 50; // main is not reserved keyword

        // KEEP CONSTANTS VALUES IN CAPS
        int DAYS_IN_YEAR = 365;


    }
}