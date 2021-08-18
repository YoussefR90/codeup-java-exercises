package practice;

public class AssessmentPractice {
    public static double multiply (int a, int b){
        return a*b;
    }
    public static double multiply (double a, double b){
        return a*b;
    }
    public static void getMallardDetails (Mallard mallard){
        System.out.println("This Mallard lies at " + mallard.getFlightSpeed());
    }
     public static void main (String [] args){
        System.out.println(multiply(2,4));
        System.out.println(multiply(2.0,4.0));

        Mallard one = new Mallard("jim", 25, 100);
        getMallardDetails(one);
     }
}
