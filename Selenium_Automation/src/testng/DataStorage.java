package testng;

import org.testng.annotations.DataProvider;

public class DataStorage {
@DataProvider
public String[][] dataSender() {
	String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
	return data;
}
@DataProvider
public String[][] loginData() {
	String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
	return data;
}
@DataProvider
public String[][] registerData() {
	String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
	return data;
}
}
