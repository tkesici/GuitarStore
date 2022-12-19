public class NullGuitar extends Guitar {

    public NullGuitar() {
        super.setName("Null", "Guitar");
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
