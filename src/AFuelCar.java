public abstract class AFuelCar extends ACar {
    private final String fuelType;
    private final int kmPerLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPerLitre){
        super(registrationNumber, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPerLitre = kmPerLitre;
    }

    public String getFuelType(){
        return fuelType;
    }

    public int kmPerLitre(){
        return kmPerLitre;
    }

}