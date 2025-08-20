package w2_DAY5.Vehicle_Rental_System;

public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500.0; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance [Policy: " + getMaskedPolicyNumber() + "] - ₹" + calculateInsurance();
    }
}
