import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class LoanAgentTesterWithStubObject {
	
	LoanAgent agent;
	TestingCreditAgency agency;
	
	@Before
	public void setUp()  {
		agent  = new LoanAgent();
		agency = new TestingCreditAgency();
		}

	@Test
	public void testWithLowCreditScore() {
		int creditScore = 719;
		double years = 1.1;
		int ssn = 123456789;

		agency.setCreditScore(creditScore);
		
		agent.setAgency(agency);
		
		Assert.assertTrue(agent.processLoan(ssn, years).equals("Rejected"));	
	}
}
