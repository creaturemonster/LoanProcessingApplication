import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class LoanAgentTesterWithMockObject {
	
	LoanAgent agent;
	CreditAgency agency;
	int goodSSN = 234567898;
	
	@Before
	public void setUp()  {
		agent  = new LoanAgent();
		agency = Mockito.mock(CreditAgency.class);
		}

	@Test
	public void testWithGoodCreditandSufficientEmployment() {
		double years = 1.2;
		Mockito.when(agency.getCreditScore(goodSSN)).thenReturn(720);
		agent.setAgency(agency);
		Assert.assertTrue(agent.processLoan(goodSSN, years).equals("Approved"));
	}
}
