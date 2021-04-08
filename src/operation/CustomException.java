package operation;

public class CustomException extends Exception {

	public CustomException(String s) {
		// Call constructor of parent Exception
		super(s);
	}

	// Driver Program
	public static void main(String args[]) {
		try {
			// Throw an object of user defined exception
			throw new CustomException("GeeksGeeks");
		} catch (CustomException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}

}
