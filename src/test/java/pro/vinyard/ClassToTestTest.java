package pro.vinyard;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassToTestTest {
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void getValue() {
		ClassToTest ctt = new ClassToTest();
		assertEquals(ctt.getValue(), 0);
	}
	
	@Test
	public void setValue() {
		ClassToTest ctt = new ClassToTest();
		//ctt.setValue(-1);
		assertEquals(ctt.getValue(), 0);
		ctt.setValue(8);
		assertEquals(ctt.getValue(), 8);
	}
}