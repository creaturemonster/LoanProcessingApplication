import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoanStepDefinitions {
	
	LoanAgent agent;
	
	@Before
	public void setUp()  {
		agent = new LoanAgent();
	}
	
	@Given("^the user has successfully logged on$")
	public void the_user_hass_successfully_logged_on() throws Throwable {
	    
	}

	@When("^they have a credit score of (\\d+)$")
	public void they_have_a_credit_score_of(int score) throws Throwable {
		agent.setScore(score);
	    
	}

	@When("^they have ([-+]?[0-9]*\\.?[0-9]+) years of continuous employment$")
	public void they_have_years_of_continuous_employment(double years) throws Throwable {
		agent.setYears(years);
	    
	}

	@Then("^their loan status is \"([^\"]*)\"$")
	public void their_loan_status_is(String status) throws Throwable {
		String result = agent.processLoan();
		Assert.assertTrue(result.equals(status));
	    
	}

}
