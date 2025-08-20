package w2_DAY5.Vehicle_Rental_System;

public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500.0; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance [Policy: " + getMaskedPolicyNumber() + "] - ₹" + calculateInsurance();
    }
}
