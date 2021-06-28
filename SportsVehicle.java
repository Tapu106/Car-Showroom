public class SportsVehicle extends Vehicle {

    private boolean hasTurbo;

    public SportsVehicle(String model_number, String engine_power, String tire_size, boolean hasTurbo) {
        super(model_number, "oil-only", engine_power, tire_size);
        this.hasTurbo = hasTurbo;
    }

    public Boolean getTurbo() {
        return hasTurbo;
    }

    @Override
    public void printDetails() {

        System.out.format("%-18s%-15s%-15s%-15s%-15s%-15s\n", "Sports", super.getModelNumber(), super.getEngineType(),
                super.getEnginePower(), super.getTireSize(), this.getTurbo());

    }

}
