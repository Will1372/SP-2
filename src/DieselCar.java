public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;
    private int kmPerLiter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLiter, boolean hasParticleFilter){
        super(registrationNumber, make, model, numberOfDoors, "Diesel", kmPerLiter); // Adjust the constructor call
        this.kmPerLiter = kmPerLiter;
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public int getRegistrationFee(){
        int registrationFee = 0;
        if (kmPerLiter >= 20 && kmPerLiter <= 50){
            registrationFee += 330;
        }else if (kmPerLiter >= 15 && kmPerLiter < 20){
            registrationFee += 1050;
        }else if (kmPerLiter >= 10 && kmPerLiter < 15){
            registrationFee += 1850;
        }else if (kmPerLiter >= 5 && kmPerLiter < 10){
            registrationFee += 2770;
        }else{
            registrationFee += 15260;
        }

        if (!hasParticleFilter){
            registrationFee += 1000;
        }

        return registrationFee;
    }

    @Override
    public String toString(){
        return "Make: " + getMake() + ", Model: " + getModel() + ", Registration Number: " + getRegistrationNumber() + ", Number of Doors: " + getNumberOfDoors() + ", Fuel Type: Diesel, Has Particle Filter: " + hasParticleFilter;
    }

    public int getKmPerLiter() {
        return kmPerLiter;
    }

}