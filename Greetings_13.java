import java.util.Scanner;

/**
 * Greetings_13
 */
public class Greetings_13 {
    public static String getGreetingRecipient() {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input13.nextLine();
        input13.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" May the force be with you!");
    }
}