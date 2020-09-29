package dad.codesignal.intro;

public class intro3 {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("Programando"));
		System.out.println(checkPalindrome("oso"));
	}

	public static boolean checkPalindrome(String inputString) {

		StringBuilder stringBuilder = new StringBuilder(inputString);

		String cadenaInvertida = stringBuilder.reverse().toString();

		if (inputString.equals(cadenaInvertida)) {
			return true;
		} else {
			return false;
		}

	}
}
