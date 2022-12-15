import java.util.Scanner;

public class GuitarStoreTestDriver {

    public static void main(String[] args) {

        Guitar guitar;
        GuitarStore store = new IstanbulGuitarStore();
        Scanner in = new Scanner(System.in);
        String greeting = "AI Employee: Welcome to our store! Please take your time, pick one of " +
                "our guitars and try it. You can ask for help when you are done.";

        System.out.println(greeting);
        System.out.print("Customer: My choice is ");
        guitar = store.playGuitar(in.nextLine());

        System.out.println(">>> Customer is trying a " + guitar.getName() +
                " guitar in " + store.getName() + " store.");
        System.out.print("AI Employee: What do you say? Are you going to buy it? ");
        String bought = in.next();
        if (bought.charAt(0) == 'n' || bought.charAt(0) == 'N') {
            System.out.print("AI Employee: Thank you, have a good one!");
            System.exit(0);
        }
        System.out.print("AI Employee: Great! Would you like to have a hardcase(200$) " +
                "or softcase(100$) for your guitar? ");
        String guitarcase = in.next();
        switch (guitarcase.charAt(0)) {
            case ('h'):
                System.out.println("+200$");
            case ('s'):
                System.out.println("+100$");
            default:
                System.out.println("+0$");

        }
    }

}
