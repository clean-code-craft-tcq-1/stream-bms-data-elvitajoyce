package sender;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import sender.SenderDataImpl;

public class SenderDataImplTest {
	
	SenderDataImpl senderDataImpl = new SenderDataImpl();

	// Test to check the data size for a given user input n
	@Test
	public void getBMSDataTest() {
		List<String> data = senderDataImpl.getBMSData(10);
		Assert.assertEquals(10, data.size());
	}
	
	// Test to check the data size for a given user input 0
	@Test
	public void getBMSDataTest_Variant1() {
		Assert.assertNull(senderDataImpl.getBMSData(0));
	}
	
	//Test to check the data size for a given negative user input
	@Test
	public void getBMSDataTest_Variant2() {
		Assert.assertNull(senderDataImpl.getBMSData(-5));
		
	}
}
