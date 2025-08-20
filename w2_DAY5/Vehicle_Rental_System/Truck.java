package w2_DAY5.Vehicle_Rental_System;

public class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 2000;
    }

    @Override
    public double calculateInsurance() {
        return 3000.0; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance [Policy: " + getMaskedPolicyNumber() + "] - ₹" + calculateInsurance();
    }
}
