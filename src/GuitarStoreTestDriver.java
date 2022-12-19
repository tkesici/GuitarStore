public class GuitarStoreTestDriver {

    public static void main(String[] args) {

        GuitarStore store = new IstanbulGuitarStore();
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
