package Backend.Classes;

import com.google.gson.*;

import java.util.ArrayList;
public class Customer {
    private int cId;
    private String cName;
    private String address;
    private String birthDate;
    private String driversLicence;
    private String cardId;
    private int age;
    public ArrayList<Vehicle> vehicles = new ArrayList<>();

    // 1) Eggrafh neoy pelath
    public Customer addCustomer(String Json){
        Customer c = new Customer();
        JsonObject json = Customer.json.getJson(Json);
        c.setCId(json.get());
        return c;
    }

    // Useful functions
    public int getCId() {
        return this.cId;
    }

    public void setCId(int cId) {
        this.cId = cId;
    }

    public String getCName() {
        return this.cName;
    }

    public void setCName(String cname) {
        this.cName = cName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDriversLicence() {
        return this.driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    public String getCardId() {
        return this.cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
