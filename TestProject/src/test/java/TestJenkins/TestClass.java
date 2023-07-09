package TestJenkins;
import org.testng.annotations.*;

public class TestClass {

	@BeforeMethod
	public void test1(){
		System.out.println("test-1");
	}
	
	@AfterMethod
	public void test3(){
		System.out.println("test-3");
	}
	
	@Test
	public void test2(){
		System.out.println("test-2");
	}

}
