package services;

import java.security.InvalidParameterException;

public class BrazilIntrestService {

    private double intrestRate;

    public double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater then zero");
        }
        return amount * Math.pow(1.0 + intrestRate / 100.0, months);
    }

    public BrazilIntrestService(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

}
