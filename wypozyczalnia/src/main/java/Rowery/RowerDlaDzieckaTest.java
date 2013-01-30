package Rowery;

import static org.junit.Assert.*;

import org.junit.Test;

public class RowerDlaDzieckaTest {

	RowerDlaDziecka r = new RowerDlaDziecka();
	
	@Test
	public void testKoszt() {
		assertEquals("B³êdny koszt dla Roweru dla dziecka",70.00, r.koszt(), 0);
	}

}
