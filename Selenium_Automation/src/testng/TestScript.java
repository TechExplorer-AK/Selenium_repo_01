package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TestScript {
@Test
public void login() {
	Reporter.log("Open browser and enter url",true);
	Reporter.log("click on login link",true);
	Reporter.log("enter email",true);
	Reporter.log("enter password",true);
	Reporter.log("enter on login button",true);
	Assert.assertEquals(true, true);
}
}
