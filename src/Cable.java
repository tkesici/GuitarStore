public class Cable extends AccessoriesDecorator {

    Guitar guitar;

    public Cable(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + ", Cable";
    }

    @Override
    public double cost() {
        return guitar.cost() + 50.0;
    }
}
