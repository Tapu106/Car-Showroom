
import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    // adds vehicles in list
    public void addVehicles(Vehicle v, String vehicleType) {
        vehicles.add(v);
        if (vehicleType.equalsIgnoreCase("sports")) {
            Vehicle.visitorCount += 20;
        }
    }

    // removes vehicle from list using model number
    public void removeVehicles(String modelNumber) {
        Vehicle found = this.searchVehicle(modelNumber);
        if (found == null) {
            System.out.println("No Vehicle as " + modelNumber);
        }
        for (Vehicle v : vehicles) {
            if (v.getModelNumber().equals(modelNumber)) {
                vehicles.remove(v);
                break;
            }
        }
        System.out.println(modelNumber + " removed");

    }

    // prints vehicles list
    public void printVehicles() {
        System.out.println(
                "====================================================================================================");
        System.out.printf("%-18s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Vehicle Type", "Model Number", "Engine Type",
                "Engine Power", "Tire Size", "Has Turbo", "Weight");
        for (Vehicle v : vehicles) {
            v.printDetails();

        }
        System.out.println(
                "====================================================================================================");
        System.out.println("Expected Visitor Count: " + Vehicle.visitorCount);
        System.out.println();
    }

    // find certain vehicle
    public Vehicle searchVehicle(String modelNumber) {
        for (Vehicle v : vehicles) {
            if (v.getModelNumber().equals(modelNumber)) {
                return v;
            }
        }
        return null;
    }
}
