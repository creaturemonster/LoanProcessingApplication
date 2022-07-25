
public class LoanAgent {

	CreditAgency agency;
	int score = 0;
	double years = 0.0;
	
	public String processLoan(int ssn, double years)  {
		score = agency.getCreditScore(ssn);
		this.years = years;
		return this.processLoan();
}
	
	public void setAgency(CreditAgency agency) {
		this.agency = agency;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setYears(double years) {
		this.years = years;
		
	}

	public String processLoan() {
		String status = "Rejected";
		
		if(score >= 720 && years >= 1.0)
			status = "Approved";
		return status;
	}

}
