import java.util.ArrayList;
import java.util.List;

public class KeyboardData {
	private static KeyboardData keyboardObject = new KeyboardData();

	private List<KeyboardDetails> keyboardList = new ArrayList<KeyboardDetails>();

	private KeyboardData() {
	}

	public static KeyboardData getKeyboard() {
		return keyboardObject;
	}

	public void addKeyboard(KeyboardDetails keyboard) {
		keyboardList.add(keyboard);
	}

	public List<KeyboardDetails> getKeyboardList() {
		return keyboardList;

	}
}
