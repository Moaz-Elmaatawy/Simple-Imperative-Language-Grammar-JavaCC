package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	void test_1() {
		Run g=new Run("skip");
		try {
			g.main(null);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(g.check,1);
	}
	
	@Test
	void test_2() {
		Run g=new Run("sskip;skip");
		try {
			g.main(null);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		assertEquals(g.check,0);
	}
	
	

}
