

public class HeavyVehicle extends Vehicle {

    private String weight;

    public HeavyVehicle(String model_number, String engine_power, String tire_size, String weight) {
        super(model_number, "diesel-only", engine_power, tire_size);
        this.weight = weight;

    }

    public String getWeight() {
        return weight;
    }

    @Override
    public void printDetails() {
        System.out.format("%-18s%-15s%-15s%-15s%-30s%-15s\n", "Heavy", super.getModelNumber(), super.getEngineType(),
                super.getEnginePower(), super.getTireSize(), this.getWeight());

    }

}
