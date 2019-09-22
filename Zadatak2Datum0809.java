package drugipaket;

import java.util.Scanner;

public class Zadatak2Datum0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		s = s.replace(" ", "");
		System.out.print("Najduzi podstring samoglasnika je: " + podstringSamoglasnika(s));

	}

	static String podstringSamoglasnika(String s) {
		String podstring = "", privremeniPodstring = "";
		char karakter;
		for (int i = 0; i < s.length(); i++) {
			karakter = s.charAt(i);
			if (karakter != 'a' && karakter != 'e' && karakter != 'i' && karakter != 'o' && karakter != 'u') {
				privremeniPodstring = "";
				continue;
			}
			privremeniPodstring += karakter;
			if (privremeniPodstring.length() > podstring.length()) {
				podstring = privremeniPodstring;
			}
		}
		return podstring;
	}

}
