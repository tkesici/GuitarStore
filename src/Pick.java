public class Pick extends AccessoriesDecorator {

    Guitar guitar;
    int piece;

    public Pick(Guitar guitar, int piece) {
        this.guitar = guitar;
        this.piece = piece;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + ", " + piece + " Picks";
    }

    @Override
    public double cost() {
        return guitar.cost() + (piece*1.0);
    }
}
