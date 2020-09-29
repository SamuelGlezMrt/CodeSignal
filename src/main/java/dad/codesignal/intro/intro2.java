package dad.codesignal.intro;

public class intro2 {

	public static void main(String[] args) {
		System.out.println(centuryFromYear(2016));
		System.out.println(centuryFromYear(90));
		System.out.println(centuryFromYear(5));
				
		
	}

	public static int centuryFromYear(int year) {

		int siglo = 1;
		int aux = 0;

		for (int i = 0; i < year; i++) {
			if (i == aux + 100) {
				aux = aux + 100;
				siglo++;
			}

		}

		return siglo;

	}

}
