public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre){
        super(registrationNumber, make, model, numberOfDoors, "Gasoline", kmPerLitre);
    }

    @Override
    public int getRegistrationFee(){
        int registrationFee = 0;
        int kmPerLiter = kmPerLitre();

        if (kmPerLiter >= 20 && kmPerLiter <= 50){
            registrationFee += 330;
        }else if(kmPerLiter >= 15 && kmPerLiter < 20){
            registrationFee += 1050;
        }else if(kmPerLiter >= 10 && kmPerLiter < 15){
            registrationFee += 2340;
        }else if(kmPerLiter >= 5 && kmPerLiter < 10){
            registrationFee += 5500;
        }else{
            registrationFee += 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString(){
        return "Make: " + getMake() + ", Model: " + getModel() + ", Registration Number: " + getRegistrationNumber() + ", Number of Doors: " + getNumberOfDoors() + ", Fuel Type: Gasoline";
    }

}