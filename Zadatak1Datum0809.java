package drugipaket;

import java.util.Scanner;

public class Zadatak1Datum0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String newS = s.replace(" ", "");
		if (jePalindrom(newS)) {
			System.out.println("Jeste palindrom.");
		} else
			System.out.println("Nije palindrom.");
	}

	static boolean jePalindrom(String s) {
		boolean palindrom = true;
		char karakter1, karakter2;
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
			karakter1 = s.charAt(i);
			karakter2 = s.charAt(j);
			if (karakter1 != karakter2) {
				palindrom = false;
				break;
			}
		}
		return palindrom;
	}

}
