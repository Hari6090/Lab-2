import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nKeyboard Factory...");
		String keyboardType;
		int orderCount;
		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter keyboard type(Qwerty/Gaming) to place an order: ");
		keyboardType = scan.next();
		System.out.println("Enter order count: ");
		orderCount = scan.nextInt();

		Keyboard board1 = new KeyboardFactory().getKeyboard(keyboardType);
		board1.order(orderCount);

		KeyboardData object = KeyboardData.getKeyboard();

		object.addKeyboard(new KeyboardDetails(keyboardType, orderCount));
		System.out.println("\nThe Details added in singleton are, ");
		System.out.println("Keyboard Type: \t Order Count:");
		for (KeyboardDetails keyboardDetails : object.getKeyboardList()) {
			System.out.printf(keyboardDetails.getKeyboardType(), keyboardDetails.getOrderCount());
		}

	}

}
