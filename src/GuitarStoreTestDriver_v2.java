public class GuitarStoreTestDriver_v2 {

    public static void main(String[] args) {

        GuitarStore store = new IzmirGuitarStore();
        Guitar guitar = store.playGuitar("ESP");
        System.out.println(guitar.getDescription() + " " + guitar.cost()+"$");
        guitar = new Hardcase(guitar);
        System.out.println(guitar.getDescription() + " " + guitar.cost()+"$");

    }
}
