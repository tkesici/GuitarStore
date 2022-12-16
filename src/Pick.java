public class Pick extends AccessoriesDecorator {

    Guitar guitar;
    int quantity;

    public Pick(Guitar guitar, int piece) {
        this.guitar = guitar;
        this.quantity = piece;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + ", " + quantity + " Picks";
    }

    @Override
    public double cost() {
        return guitar.cost() + (quantity *1.0);
    }
}
