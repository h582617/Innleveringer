package Oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			int poeng = parseInt(showInputDialog("Legg inn dine poeng"));
			
			if (poeng <= 100 && poeng >= 90) {
				showMessageDialog(null,"Man får karakter A");
				System.out.println("A");
			}
			
			else if (poeng <= 89 && poeng >= 80) {
				showMessageDialog(null,"Man får karakter B");
				System.out.println("B");
			
		    }
		
			else if (poeng <= 79 && poeng >= 60) {
				showMessageDialog(null,"Man får karakter C");
				System.out.println("C");
			}
			
			else if (poeng <= 59 && poeng >= 50) {
				showMessageDialog(null,"Man får karakter D");
				System.out.println("D");
			}
			
			else if (poeng <= 49 && poeng >= 40) {
				showMessageDialog(null,"Man får karakter E");
				System.out.println("E");
			}
			
			else if (poeng <= 39 && poeng >= 0) {
				showMessageDialog(null,"Man får karakter F");
				System.out.println("F");
			}
	
			else {
				showMessageDialog(null,"Ikke gyldig, prøv igjen!");
				i--;
			}
		}
    }
}
