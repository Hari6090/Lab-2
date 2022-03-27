import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTest {
	@Test
	public void testKeyboardSingleton() {
		KeyboardData object = KeyboardData.getKeyboard();
		object.addKeyboard(new KeyboardDetails("Qwerty", 12));
		assertEquals(12, object.getKeyboardList().get(0).getOrderCount());
	}
	
	@Test
	public void testKeyboardFactory() {
		GamingKeyboard game = new GamingKeyboard();
		assertEquals("GamingKeyboard ordered successfully", game.toString());
	}
}
