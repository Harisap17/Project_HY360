package Backend.Classes;

enum VehicleType {
    CAR, MOTORCYCLE, BICYCLE, SCOOTER
}

public class Vehicle {
    private int vId;
    private String manufacturer;
    private String model;
    private String color;
    private float efficiency;
    VehicleType type;
    /* Types for bicycles and scooters */
    private int uniqueNumber;
    /* Types for cars only*/
    private String licencePlate;
    private String carType;

    // 2) promh8eia newn oxhmatwn apo thn etairia
    public Vehicle addVehicle1(int vId, String manufacturer, String model, String color, float efficiency, VehicleType type, int uniqueNumber) {
        Vehicle v = new Vehicle();
        v.setVId(vId);
        v.setManufacturer(manufacturer);
        v.setModel(model);
        v.setColor(color);
        v.setEfficiency(efficiency);
        v.setVehicleType(type);
        v.setUniqueNumber(uniqueNumber);

        return v;
    }

    public Vehicle addVehicle2(int vId, String manufacturer, String model, String color, float efficiency, VehicleType type, int licencePlate ) {
        Vehicle v = new Vehicle();
        v.setVId(vId);
        v.setManufacturer(manufacturer);
        v.setModel(model);
        v.setColor(color);
        v.setEfficiency(efficiency);
        v.setVehicleType(type);

        return v;
    }

    // Useful functions
    public int getVId() {
        return this.vId;
    }

    public void setVId(int vId) {
        this.vId = vId;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(float efficiency) {
        this.efficiency = efficiency;
    }

    public VehicleType getVehicleType() {
        return this.type;
    }

    public void setVehicleType (VehicleType type) {
        this.type = type;
    }

    public int getUniqueNumber() {
        return this.uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }
    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String  getCarType() {
        return this.carType;
    }

    public void setCarType (String carType) {
        this.carType = carType;
    }
}
