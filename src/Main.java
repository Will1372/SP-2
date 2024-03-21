public class Main {

    public static void main(String[] args){

        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(new GasolineCar("HE77000", "Audi", "R8", 2, 7));
        fleet.addCar(new DieselCar("WH47500", "Mercedes", "S-Class", 4, 12, true));
        fleet.addCar(new ElectricCar("UP00000", "Tesla", "Performance Model Y", 4, 81, 488));

        for (Car car : fleet.getCarFleet()){
            System.out.println(car);
        }
        System.out.println("Total registration fee for the whole fleet of vehicles: " + fleet.getTotalRegistrationFeeForFleet() + ",- DKK");
    }

}