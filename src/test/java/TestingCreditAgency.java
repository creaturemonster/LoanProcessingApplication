
public class TestingCreditAgency implements CreditAgency {
	
	int creditScore = 0;
	
	public void setCreditScore(int score) {
		creditScore = score;
	}

	public int getCreditScore(int ssn) {
		
		return creditScore;
	}
}
