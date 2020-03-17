package demo.Sample;

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testNG {
    @BeforeTest
	public void testNG0() {
	System.out.println("Hello");
}
    @Test
    public void testNG1() {
    	System.out.println("Hi");
    }
    
    @AfterTest
    public void testNG2() {
    	System.out.println("Hey");
    }
	
}
