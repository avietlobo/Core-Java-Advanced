package operation;

//Write code to implement handling Strings like concatenation, navigation, comparison etc

public class StringOperationExamples {

	public static void main(String[] args) {
		String s1 = "Aviet";
		String s2 = "Lobo";
		concatenateString(s1, s2);
		navigation(s1);
		compare(s1, s2);
	}

	public static String concatenateString(String s1, String s2) {

		return s1.concat(s2);
	}

	public static boolean compare(String s1, String s2) {

		return s1.equals(s2);
	}

	public static void navigation(String s1) {

		s1.chars().forEachOrdered(i -> System.out.println((char) i));
	}

}
