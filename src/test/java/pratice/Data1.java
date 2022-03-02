package pratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data1 {
	public static void main(String[] args) {
		
	}
	@Test(dataProvider="getData")
	public void reatTheDataFromDataProvider(String mobileName,int qty) {
		System.out.println("==Mobile Name==>>"+mobileName+"==Quantity==>>"+qty);
	}		
	@DataProvider
	public Object[][] getData() {
		Object[][] objayy=new Object[3][2];
		
		objayy[0][0]="Iphone";
		objayy[0][1]=10;
		
		objayy[1][0]="Samsung";
		objayy[1][1]=20;
		
		objayy[2][0]="Vivo";
		objayy[2][1]=30;
		
		return objayy;		
	}	

}
