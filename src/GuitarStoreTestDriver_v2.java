public class GuitarStoreTestDriver_v2 {

    public static void main(String[] args) {

        GuitarStore store = new IstanbulGuitarStore();
        AIEmployee aiEmployee = AIEmployee.getEmployee();

        Guitar guitar = new NullGuitar();
        boolean dislike = true;

        aiEmployee.greeting();

        while (dislike) {
            guitar = store.playGuitar(aiEmployee.choice());
            if (guitar.getDescription().equals("Null Guitar")) {
                aiEmployee.nullGuitar();
            }
            dislike = aiEmployee.decision();
        }

        aiEmployee.decorate(guitar);
    }

}
