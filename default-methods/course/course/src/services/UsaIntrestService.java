package services;

public class UsaIntrestService implements InterestService{

    private double intrestRate;

    public UsaIntrestService(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return intrestRate;
	}

}
