public class Hardcase extends AccessoriesDecorator {

    Guitar guitar;

    public Hardcase(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + ", Hardcase";
    }

    @Override
    public double cost() {
        return guitar.cost() + 200.0;
    }
}
