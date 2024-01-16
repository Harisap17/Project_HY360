package Backend.Classes;

public class Rentals{
    private String rName;
    private String date;
    private int duration;
    private float rentalCost;
    private float insuranceCost;

    // 3) Enoikiash oxhmatos apo pelath

    // Useful functions
    public String getRName() {
        return this.rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getRentalCost() {
        return this.rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public float getInsuranceCost() {
        return this.insuranceCost;
    }

    public void setInsuranceCost(float insuranceCost) {
        this.insuranceCost = insuranceCost;
    }
}
