import java.util.Scanner;

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
        System.out.println("If you have made the choice, please tell me:");
        String choice = in.nextLine();
        return choice;
    }

    public boolean decision() {
        Scanner in = new Scanner(System.in);
        System.out.print("AI Employee: Well, did you like it?");
        String decision = in.nextLine();
        if (decision.charAt(0) == 'n' || decision.charAt(0) == 'N') {
            return true;
        }
        return false;
    }

}
