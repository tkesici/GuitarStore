public abstract class GuitarStore {

    public Guitar playGuitar(String type) throws RuntimeException {

        Guitar guitar;
        guitar = chooseGuitar(type);
        guitar.play();
        return guitar;

    }

    protected abstract Guitar chooseGuitar(String type);

    public String getName() {
        return "GuitarStore";
    }
}