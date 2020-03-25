package meer.tddjunit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class deleteAatFirstTwoPlacesTest {
	
	/*
	 * FirstA ---  "ABCD"=>"BCD"
	 * SecondA --- "BACD"=>"BCD"
	 * TwoA    --- "AACD"=>"CD"
	 * NoA     --- "BBAA"=>"BBAA"
	 * Mixed   --- "AABAA"=>"BAA"
	 */

	@Test
	void testFirstA() {
		 
		assertEquals("BCD",deleteFirst2A.fun("ABCD"));
	}
	@Test
	void testSecondA() {
		 
		assertEquals("BCD",deleteFirst2A.fun("BACD"));
	}
	@Test
	void testTwoA() {
		 
		assertEquals("CD",deleteFirst2A.fun("AACD"));
	}
	@Test
	void testNoA() {
		 
		assertEquals("BBAA",deleteFirst2A.fun("BBAA"));
	}
	@Test
	void testMixedA() {
		 
		assertEquals("BAA",deleteFirst2A.fun("AABAA"));
	}

}
