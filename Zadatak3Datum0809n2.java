package drugipaket;

import java.util.Scanner;

public class Zadatak3Datum0809n2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		s =s.replace(" ", "");
		String kompresovan = kompresovanje(s);
		System.out.println("Kompresovan string: " + kompresovan);	
	}
	
	static String kompresovanje (String s) {
		StringBuilder kompresovan = new StringBuilder();
		char tekuci, sledeci = s.charAt(1), zagrada1 = '(' , zagrada2 = ')';
		int brojac = 1;
		for (int i  = 1 ; i < s.length() ; i++) {
			tekuci = s.charAt(i-1);
			sledeci = s.charAt(i);
			if ( tekuci == sledeci) {
				brojac++;
				continue;
			}
			else if ( brojac > 3) {
				kompresovan.append(tekuci);
				kompresovan.append(zagrada1);
				kompresovan.append(brojac);
				kompresovan.append(zagrada2);
			}
			else {
				for (int j = 1 ; j <= brojac ; j++) {
					kompresovan.append(tekuci);
				}
			}
			brojac = 1;
		}
		 if ( brojac > 3) {
				kompresovan.append(sledeci);
				kompresovan.append(zagrada1);
				kompresovan.append(brojac);
				kompresovan.append(zagrada2);
			}
			else {
				for (int j = 1 ; j <= brojac ; j++) {
					kompresovan.append(sledeci);
				}
			}
		return kompresovan.toString();
	}

}
