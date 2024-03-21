import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> carFleet;

    public FleetOfCars(){
        carFleet = new ArrayList<>();
    }

    public void addCar(Car car){
        carFleet.add(car);
    }

    public ArrayList<Car> getCarFleet(){
        return new ArrayList<>(carFleet);
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fleet of Cars:\n");
        for (Car car : carFleet) {
            stringBuilder.append(car).append("\n");
        }
        return stringBuilder.toString();
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFee = 0;
        for (Car car : carFleet){
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

}