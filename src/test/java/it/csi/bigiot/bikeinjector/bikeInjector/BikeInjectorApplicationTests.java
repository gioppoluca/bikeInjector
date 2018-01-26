package it.csi.bigiot.bikeinjector.bikeInjector;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BikeInjectorApplicationTests {

	static {
		System.setProperty("jasypt.encryptor.password", "bigiot");
}
	
	@Test
	public void contextLoads() {
	}
	

}
