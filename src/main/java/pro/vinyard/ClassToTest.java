package pro.vinyard;

/**
 * @author VinYarD
 * created : 29/01/2019, 13:40
 */


public class ClassToTest {
	
	private long value;
	
	public ClassToTest() {
		this.value = 0;
	}
	
	public long getValue() {
		return this.value;
	}
	
	public void setValue(long value) {
		System.out.println("test1");
		if(value < 0) {
			System.out.println("TESTTEST");
			this.value = 0;
		} else {
			System.out.println("test");
			this.value = value;
		}
		System.out.println("test2");
	}
}
