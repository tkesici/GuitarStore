public abstract class Guitar {

    private String brand = "Unknown Brand";
    private String model = "Unknown Model";

    public String getName() {
        return brand + " " + model;
    }

    public void setName(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract double cost();

    public void play() {
        if(!isNull()){
            System.out.println(brand + "'s " + model + " is played by the customer.");
        }
    }

    public String getDescription() {
        return brand + " " + model;
    }

    public boolean isNull(){
        return false;
    }

}
