public class IstanbulGuitarStore extends GuitarStore {

    @Override
    protected Guitar chooseGuitar(String type) {

        if (type.equals("Gibson")) {
            return new IstanbulGibson();
        } else if (type.equals("Fender")) {
            return new IstanbulFender();
        } else if (type.equals("Jackson")) {
            return new IstanbulJackson();
        } else if (type.equals("ESP")) {
            return new IstanbulESP();
        } else
            return new NullGuitar();
    }

    public String getName() {
        return "Istanbul";
    }

}