package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class tses {

	@Test
	public void test() {
		test tt=new test();
	int x=tt.square(2);
		assertEquals(4,x);
	}

}
