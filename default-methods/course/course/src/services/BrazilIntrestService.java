package services;

public class BrazilIntrestService implements InterestService {

    private double intrestRate;

    public BrazilIntrestService(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

	@Override
	public double getInterestRate() {
		return intrestRate;
	}

}
