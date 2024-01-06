package TestListener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Assmt150_listener.class)
public class Assmt150 extends Assmt150_listener{

	
	    @Test
		public void click() {
	    	
	    driver.findElement(By.linkText("Mobiles")).click();
	    }
	    
	         @Test
	 		public void location() {
	        	
	    	 driver.findElement(By.linkText("glow-ingress-line2")).click();
	 		
	 	    }
	    
	    @Test
	 		public void click3() {
	    	
	    	 driver.findElement(By.linkText("123")).click();
	 	    }
	    @Test
	 		public void click4() {
	    
	    	 driver.findElement(By.linkText("par")).click();
	 	    }
	    @Test
	 		public void menuClick() {
	    	
	    	 driver.findElement(By.linkText("nav-hamburger-menu")).click();
	 	    }
	    
}
