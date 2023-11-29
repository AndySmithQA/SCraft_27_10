package Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCar {
	Car car;
	
	@BeforeEach
	public void setUp() {
		car = new Car("Ford");
	}
	
//	@AfterEach
//	public void tearDown() {
//		car = null;
//	}
	
	@Test
	void testCarAccelerate() {
		System.out.println("@test");
		car.accelerate(10);
		assertEquals(50, car.getSpeed());
	}

	@Test
	void testCarAccelerateAgain() {
		System.out.println("@test");
		car.accelerate(20);
		assertEquals(60, car.getSpeed());
	}
}
