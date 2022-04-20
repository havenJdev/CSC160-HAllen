import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calc;

	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Multiplication test")
	void testMultiply() {
		assertEquals(20, calc.multiply(4, 5),"Multiplication does not work");
	}
	
	@Test
	@DisplayName("Addition test")
	void testAdd() {
		assertEquals(10, calc.add(5, 5),"Addition does not work");
	}
}
