public class ElectricCar extends ACar {
    private final double batteryCapacityKWh;
    private final double maxRangeKm;
    private final double whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacityKWh, double maxRangeKm){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm = batteryCapacityKWh / maxRangeKm;
    }

    public double getBatteryCapacityKWh(){
        return batteryCapacityKWh;
    }

    public double getMaxRangeKm(){
        return maxRangeKm;
    }

    public double getWhPrKm(){
        return whPrKm;
    }

    @Override
    public int getRegistrationFee(){
        double litersPer100Km = whPrKm / 91.25;
        double kmPerLiter = 100 / litersPer100Km;

        int registrationFee;

        if (kmPerLiter >= 20) {
            registrationFee = 330;
        } else if (kmPerLiter >= 15) {
            registrationFee = 1050;
        } else if (kmPerLiter >= 10) {
            registrationFee = 2340;
        } else if (kmPerLiter >= 5) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString(){
        return "Make: " + getMake() + ", Model: " + getModel() + ", Registration Number: " + getRegistrationNumber() + ", Number of Doors: " + getNumberOfDoors() + ", Battery Capacity: " + getBatteryCapacityKWh() + " kWh, Max Range: " + getMaxRangeKm() + " km";
    }
}