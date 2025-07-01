package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {//TestNG class
  @Test
  public void sample() {
	  Reporter.log("Sample test case executed",true);
  }
	  
  @Test
  public void demo() {//Test Case
	  Reporter.log("demo test case executed",true);//Test step
  }
  
}
