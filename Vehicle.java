

import java.util.Vector;

public abstract class Vehicle {
    private String model_number;
    private String engine_type;
    private String engine_power;
    private String tire_size;
    public static int visitorCount = 30;

    public Vehicle(String model_number, String engine_type, String engine_power, String tire_size) {
        this.model_number = model_number;
        this.engine_type = engine_type;
        this.engine_power = engine_power;
        this.tire_size = tire_size;
    }

    public String getModelNumber() {
        return this.model_number;
    }

    public String getEngineType() {
        return this.engine_type;
    }

    public String getEnginePower() {
        return this.engine_power;
    }

    public String getTireSize() {
        return this.tire_size;
    }

    public abstract void printDetails();

}