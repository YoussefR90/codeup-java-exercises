import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.print("Enjoy your conversation with Bob!");
        String string1="";
        while (!string1.equals("exit")){
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("exit")){
                string1=string1+response;
            } else if(response.indexOf("?")!=-1){
//                System.out.println(response.charAt(response.length() - 1));
                System.out.println("sure");
            } else if(response.indexOf("!")!=-1){
                System.out.println("Whoah, chill out!");
            } else if(response.length()==0){
                System.out.println("FIne. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        }


    }
}
//do {
//        String userInput = scanner.nextLine();
//        if (userInput.endsWith("?")) {
//        System.out.println("Sure.");
//        } else if (userInput.endsWith("!")){
//        System.out.println("Whoa, chill out!");
//        } else if (userInput.equals("")) {
//        System.out.println("Be that way!");
//        } else {
//        System.out.println("Whatever.");
//        }
//        System.out.println("Would you like to continue to text Bob? (y or n)?");
//        String userResponse = scanner.nextLine();
//        if (!userResponse.equals("y")) {
//        toContinue = false;
//        System.out.println("Good-Bye!");
//        } else {
//        System.out.println("Text to talk to Bob: ");
//        }
//        } while (toContinue);

