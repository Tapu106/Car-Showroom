import java.util.Scanner;

public class Showroom {
    public static Scanner scan = new Scanner(System.in);
    public static VehicleList al = new VehicleList();

    public static void main(String[] args) {

        boolean inputLoop = true;
        int inputType = 0;
        init();
        // take input in loop
        while (inputLoop) {
            System.out.println("========================================================");
            System.out.println("Enter 0 to add Vehicle in showroom");
            System.out.println("Enter 1 to remove Vehicle in showroom");
            System.out.println("Enter 2 to show Vehicle List with details in showroom");
            System.out.println("Enter 3 to exit");
            System.out.println("========================================================");
            inputType = scan.nextInt();
            scan.nextLine();

            switch (inputType) { // action based on input type
                case 0: // add vehicle
                    int addType;
                    String model_number = "", engine_type = "", engine_power = "", tire_size = "", turbo = "",
                            weight = "";
                    boolean hasTurbo = false;
                    System.out.println("================================================");
                    System.out.println("Enter 0 to add normal vehicle");
                    System.out.println("Enter 1 to add sports vehicle");
                    System.out.println("Enter 2 to add heavy vehicle");
                    System.out.println("================================================");
                    addType = scan.nextInt();
                    scan.nextLine();

                    switch (addType) {
                        case 0: // normal vehicle
                            System.out.println("================================================");
                            System.out.println("Enter the model number");
                            model_number = scan.nextLine();
                            System.out.println("Enter the engine type [oil/gas/diesel]");
                            engine_type = scan.nextLine();
                            System.out.println("Enter the engine power");
                            engine_power = scan.nextLine();
                            System.out.println("Enter the tire size");
                            tire_size = scan.nextLine();
                            Vehicle norm = new NormalVehicle(model_number, engine_type, engine_power, tire_size);
                            al.addVehicles(norm, "normal");
                            System.out.println("Normal Vehicle Added");
                            System.out.println("================================================");
                            break;
                        case 1: // sports vehicle
                            System.out.println("================================================");
                            System.out.println("Enter the model number");
                            model_number = scan.nextLine();
                            System.out.println("Enter the engine power");
                            engine_power = scan.nextLine();
                            System.out.println("Enter the tire size");
                            tire_size = scan.nextLine();
                            System.out.println("Does it have turbo? y/n");
                            turbo = scan.nextLine();
                            hasTurbo = turbo.equalsIgnoreCase("y") ? true : false;
                            Vehicle sports = new SportsVehicle(model_number, engine_power, tire_size, hasTurbo);
                            al.addVehicles(sports, "sports");
                            System.out.println("sports Vehicle Added");
                            System.out.println("================================================");
                            break;
                        case 2: // heavy vehicle
                            System.out.println("================================================");
                            System.out.println("Enter the model number");
                            model_number = scan.nextLine();
                            System.out.println("Enter the engine power");
                            engine_power = scan.nextLine();
                            System.out.println("Enter the tire size");
                            tire_size = scan.nextLine();
                            System.out.println("Enter the weight of vehicle");
                            weight = scan.nextLine();
                            Vehicle heavy = new HeavyVehicle(model_number, engine_power, tire_size, weight);
                            al.addVehicles(heavy, "heavy");
                            System.out.println("heavy Vehicle Added");
                            System.out.println("================================================");
                            break;
                        default:
                            break;
                    }
                    break;
                case 1: // remove vehicle
                    String modelNumber;
                    System.out.println("================================================");
                    System.out.println("Enter the model number of car to remove");
                    modelNumber = scan.nextLine();
                    al.removeVehicles(modelNumber);
                    System.out.println("================================================");

                    break;
                case 2: // show vehicle list
                    al.printVehicles();
                    break;
                case 3: // exit taking input
                    scan.close();
                    inputLoop = false;
                    break;

            }
        }
    }

    public static void init() { // adds dummy data to the arraylist
        Vehicle v1 = new NormalVehicle("M12", "oil", "1200", "650");
        Vehicle v2 = new SportsVehicle("A201", "1500", "550", true);
        Vehicle v3 = new HeavyVehicle("TATA12", "1300", "1000", "150");
        al.addVehicles(v1, "normal");
        al.addVehicles(v2, "sports");
        al.addVehicles(v3, "heavy");
    }

}