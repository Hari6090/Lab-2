
public class KeyboardFactory {

	public Keyboard getKeyboard(String KeyboardType) {
		if (KeyboardType == null) {
			return null;
		}

		if (KeyboardType.equalsIgnoreCase("Qwerty")) {
			return new Qwerty();
		}
		
		if(KeyboardType.equalsIgnoreCase("Gaming")) {
			return new GamingKeyboard();
		}
		return null;

	}
}
