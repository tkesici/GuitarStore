public class IzmirGuitarStore extends GuitarStore {


    @Override
    protected Guitar chooseGuitar(String type) {

        if (type.equals("Gibson")) {
            return new IzmirGibson();
        } else if (type.equals("Fender")) {
            return new IzmirFender();
        } else if (type.equals("Jackson")) {
            return new IzmirJackson();
        } else if (type.equals("ESP")) {
            return new IzmirESP();
        } else return null;

    }

    public String getName() {
        return "Izmir";
    }
}
