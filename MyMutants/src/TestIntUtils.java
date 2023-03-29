import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import caseine.tags.ToDo;
import caseine.tags.ToDoIn;

public class TestIntUtils {

	@Test
	public void testOne() {
		assertEquals(1, IntUtils.reverseInt(1));
	}

	@Test
	@ToDo
	public void testMinusOne() {
		assertEquals(-1, IntUtils.reverseInt(-1));
	}


	@Test
	@ToDoIn("N'oublie pas de tester les cas limites!")
	public void testZero() {
		assertEquals(0, IntUtils.reverseInt(0));
	}

	@Test
	@ToDo
	public void testMax() {
		//Integer.MAX_VALUE = 2147483647
		//we can't return 7463847412 integer, it's bigger than MAX_VALUE
		assertEquals(0, IntUtils.reverseInt(Integer.MAX_VALUE));
	}

	@Test
	@ToDo
	public void testMin() {
		//Integer.MIN_VALUE = -2147483648
		//we can't return -8463847412 integer, it's smaller than MIN_VALUE
		assertEquals(0, IntUtils.reverseInt(Integer.MIN_VALUE));
	}

	@Test
	@ToDo
	public void testPositiveLarge() {
		assertEquals(12345678, IntUtils.reverseInt(87654321));
	}

	@Test
	@ToDo
	public void testNegativeLarge() {
		assertEquals(-123456789, IntUtils.reverseInt(-987654321));
	}

}
