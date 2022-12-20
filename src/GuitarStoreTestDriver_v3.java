import java.util.Scanner;

public class GuitarStoreTestDriver_v3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        GuitarStore store = null;
        String chooseStore = in.nextLine();

        if (chooseStore.equals("IstanbulGuitarStore")) {
            store = new IstanbulGuitarStore();
        } else if (chooseStore.equals("IzmirGuitarStore")) {
            store = new IzmirGuitarStore();
        } else if (store == null) {
            System.exit(0);
        }

        AIEmployee aiEmployee = AIEmployee.getEmployee();

        Guitar guitar = new NullGuitar();
        boolean dislike = true;

        aiEmployee.greeting();

        while (dislike) {
            guitar = store.playGuitar(aiEmployee.choice());
            dislike = aiEmployee.decision(guitar);
        }

        aiEmployee.decorate(guitar);
    }
}
