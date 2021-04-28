package vorlesung.testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UmrechnungTimeZeitTest {

	@Test
	void testConvert1amTo1() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("1:00 am");
		
		// then (verification)
		assertEquals("1:00", zeit, "1:00 am to 1:00 not working");
	}
	
	@Test
	void testConvert2amTo2() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("2:00 am");
		
		// then (verification)
		assertEquals("2:00", zeit, "2:00 am to 2:00 not working");
	}
	
	@Test
	void testConvert9amTo9() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("9:00 am");
		
		// then (verification)
		assertEquals("9:00", zeit);
	}
	
	@Test
	void testConvert10amTo10() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("10:00 am");
		
		// then (verification)
		assertEquals("10:00", zeit);
	}
	
	@Test
	void testConvert1115amTo1115() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("11:15 am");
		
		// then (verification)
		assertEquals("11:15", zeit);
	}
	
	@Test
	void testConvert1pmTo13() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("1:00 pm");
		
		// then (verification)
		assertEquals("13:00", zeit);
	}
	
	@Test
	void testConvert3pmTo15() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("3:00 pm");
		
		// then (verification)
		assertEquals("15:00", zeit);
	}
	
	@Test
	void testConvert545pmTo1745() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("5:45 pm");
		
		// then (verification)
		assertEquals("17:45", zeit);
	}
	
	@Test
	void testConvert11pmTo23() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
		
		// when (execution)
		String zeit = utz.convert("11:00 pm");
		
		// then (verification)
		assertEquals("23:00", zeit);
	}
	
	@Test
	void testGetHoursString11pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		String hour = utz.getHoursString("11:00 pm");
				
		// then (verification)
		assertEquals("11", hour);
	}
	
	@Test
	void testGetHoursString1pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		String hour = utz.getHoursString("1:00 pm");
				
		// then (verification)
		assertEquals("1", hour);
	}
	
	@Test
	void testGetHoursInt1pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		int hour = utz.getHoursInt("1:00 pm");
				
		// then (verification)
		assertEquals(1, hour);
	}
	
	@Test
	void testGetHoursInt11pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		int hour = utz.getHoursInt("11:00 pm");
				
		// then (verification)
		assertEquals(11, hour);
	}
	
	@Test
	void testGetMinutesStr1pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		String minutes = utz.getMinutesString("1:00 pm");
				
		// then (verification)
		assertEquals("00", minutes);
	}
	
	@Test
	void testGetMinutesStr11pm() {
		// given (preperation)
		UmrechnungTimeZeit utz = new UmrechnungTimeZeit();
				
		// when (execution)
		String minutes = utz.getMinutesString("11:00 pm");
				
		// then (verification)
		assertEquals("00", minutes);
	}

}
