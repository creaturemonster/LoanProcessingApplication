import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class LoanAgentTester {
	
	LoanAgent agent;
	
	@Before
	public void setUp()  {
		agent = new LoanAgent();
	}
	
	@After
	public void teardown()  {
		agent = null;
	}
	
	@Test
	public void testWithLowCredit() {
		agent.setScore(719);
		agent.setYears(2.0);
		Assert.assertTrue(agent.processLoan().equals("Rejected"));	
	}
}
