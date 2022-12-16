import java.util.Scanner;

import static java.lang.System.exit;

public class AIEmployee {
    private static AIEmployee employee;

    public AIEmployee() {

    }

    public static synchronized AIEmployee getEmployee() {
        if (employee == null) {
            employee = new AIEmployee();
        }
        return employee;
    }

    public void greeting() {
        System.out.println("AI Employee: Welcome to our store! Please take your time," +
                " pick one of our guitars and try it. You can ask for help when you are done.");
    }

    public String choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please let me know if there is any guitar you would like to try:");
        String choice = in.nextLine();
        return choice;
    }

    public boolean decision() {
        Scanner in = new Scanner(System.in);
        System.out.print("AI Employee: Well, did you like it? ");
        String decision = in.nextLine();
        if (decision.charAt(0) == 'n' || decision.charAt(0) == 'N') {
            return true;
        }
        return false;
    }

    public void accessories(Guitar guitar) {

    }

    public void decorate(Guitar guitar) {
        Scanner in = new Scanner(System.in);
        System.out.print("AI Employee: " + guitar.getName() + "? Good taste!");
        System.out.println("\nWould you like to buy some accessories with your brand new guitar? ");
        String decision = in.nextLine();
        if (decision.charAt(0) == 'n' || decision.charAt(0) == 'N') {
            System.out.println("AI Employee: As you please!" + bill(guitar));
            return;
        }
        System.out.println("AI Employee: Feel free to share with me: ");
        String decorate = in.nextLine();
        if (decorate.equals("Hardcase")) {
            guitar = new Hardcase(guitar);
            System.out.println(bill(guitar));
        } else if (decorate.equals("Softcase")) {
            guitar = new Softcase(guitar);
            System.out.println(bill(guitar));
        } else if (decorate.equals("Cable")) {
            guitar = new Cable(guitar);
            System.out.println(bill(guitar));
        } else if (decorate.equals("Pick")) {
            System.out.println("AI Employee: How many is enough? ");
            guitar = new Pick(guitar, in.nextInt());
            System.out.println(bill(guitar));
        } else {
            System.out.println("AI Employee: Sorry, we don't currently have this product."
                    + bill(guitar));
        }
    }

    public void nullGuitar() {
        System.out.println("AI Employee: Sorry, we don't currently have this product.");
        exit(0);
    }

    public String bill(Guitar guitar) {
        return "\n--------------[BILL]--------------\n" +
                "-----------------------------------\n" +
                "-----------------------------------\n" +
                guitar.getDescription() + "\n" +
                "-----------------------------------\n" +
                "-----------------------------------\n" +
                guitar.cost() + "$\n" +
                "-----------------------------------\n";
    }

}
