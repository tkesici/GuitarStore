public class Softcase extends AccessoriesDecorator {

    Guitar guitar;

    public Softcase(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + ", Softcase";
    }

    @Override
    public double cost() {
        return guitar.cost() + 100.0;
    }
}
