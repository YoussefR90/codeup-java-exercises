import java.util.Scanner;

//problem 1
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);
        //Exercise 2 problem 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInterger = input.nextInt();
//            //can only enter interger or you'll get an exception in thread main error
//        //you can enter more than three words, but the system will only print 3 unless prompted otherwise
        // problem 2
        System.out.println("Enter 3 words: ");
        String userInput1 = input.next();
        String userInput2 = input.next();
        String userInput3 = input.next();
        System.out.println("You entered: -->\"" + userInterger + "\"<--");
        System.out.println("You entered: -->\"" + userInput1 + "\"<--");
        System.out.println("You entered: -->\"" + userInput2 + "\"<--");
        System.out.println("You entered: -->\"" + userInput3 + "\"<--");
        //Problem 3
        System.out.println("Enter a sentence: ");
        String userInput4 = input.next();
        System.out.println("Your sentence is : -->\"" + userInput4 + "\"<--");
        //only captured the first word
        //problem 4
        System.out.println("Enter another sentence: ");
        String userInput5 = input.nextLine();
        System.out.println("Your sentence is : -->\"" + userInput5 + "\"<--");
        //Exercise 3 problem 1

        System.out.println("Enter the length and width of your classroom ");
        String width = input.next();
        String length = input.next();

        float a = Float.parseFloat(width);
        float b = Float.parseFloat(length);
        float area = a * b;
        float perimeter = a * a + b * b;
        System.out.println("This is your area: " + area);
        System.out.println("This is your perimeter: " + perimeter);
    }
}