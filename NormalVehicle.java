public class NormalVehicle extends Vehicle {

    public NormalVehicle(String model_number, String engine_type, String engine_power, String tire_size) {
        super(model_number, engine_type, engine_power, tire_size);

    }

    @Override
    public void printDetails() {
        System.out.format("%-18s%-15s%-15s%-15s%-15s\n","Normal", super.getModelNumber(), super.getEngineType(),
                super.getEnginePower(), super.getTireSize());

    }

}
