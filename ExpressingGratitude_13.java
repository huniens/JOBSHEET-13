import java.util.Scanner;

/**
 * ExpressingGratitude_13
 */
public class ExpressingGratitude_13 {
    public static String getGreetingRecipient() {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input13.nextLine();
        input13.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
        sayAdditionalGreetings("Wishing you a wonderful day!");
    }

    public static void sayAdditionalGreetings(String additionalGreeting) {
        System.out.println(additionalGreeting);
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}