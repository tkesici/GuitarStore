public abstract class GuitarStore {

    public Guitar playGuitar(String type) throws RuntimeException {

        Guitar nullGuitar = new NullGuitar();
        Guitar guitar;
        guitar = chooseGuitar(type);
        if(guitar==null){
            return nullGuitar;
        }
        guitar.play();
        return guitar;

    }
    protected abstract Guitar chooseGuitar(String type);

    public String getName() {
        return "GuitarStore";
    }
}
