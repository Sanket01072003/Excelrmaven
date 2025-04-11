package TestNG;

import org.testng.annotations.Test;

public class groupingTESTNG {

	@Test(groups= {"Apple"})
	public void apple1(){
	System.out.println("apple1");
	}
	@Test(groups= {"Apple"})
	public void apple2(){
	System.out.println("apple2");
	}
	@Test(groups= {"moto"})
	public void moto1(){
		System.out.println("moto1");
	}
	@Test(groups= {"moto"})
	public void moto2(){
		System.out.println("moto2");
	}
	@Test(groups= {"vivo"})
	public void vivo1(){
		System.out.println("vivo1");
	}
	@Test(groups= {"vivo"})
	public void vivo2(){
		System.out.println("vivo2");
	}
	@Test(groups= {"lenovo"})
	public void lenovo1(){
		System.out.println("lenovo1");
	}
	@Test(groups= {"lenovo"})
	public void lenovo2(){
	System.out.println("lenovo2");
	}


}
