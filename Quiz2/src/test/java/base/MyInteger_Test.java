package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertTrue(1==1);
		
		assertTrue((Tuition.calculationOne(12520, .01)) == 101672.44);
		assertTrue((Tuition.calculationOne(12520, .02)) == 103205.06);
		
		assertTrue((Tuition.calculationTwo(6, 48, 101672.44) == 2149.28));
		assertTrue((Tuition.calculationTwo(5, 48, 101672.44) == 1852.59));

		
		
		
	}


}
