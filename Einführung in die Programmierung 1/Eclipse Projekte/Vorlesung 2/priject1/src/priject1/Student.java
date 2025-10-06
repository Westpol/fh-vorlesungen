package priject1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean correctInput = false;
		while(!correctInput) {
			System.out.print("Gebe eine Aufgabe ein: ");
			int varA = scanner.nextInt();
			String sign = scanner.next();
			int varB = scanner.nextInt();
			int ergebnis = 0;
			if(sign.equals("+")) {
				ergebnis = varA + varB;
				correctInput = true;
			}
			else if(sign.equals("-")){
				ergebnis = varA - varB;
				correctInput = true;
			}
			System.out.println(ergebnis);
		}
	}

}
