package Oblig1;

import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {
		
	      int n = Integer.parseInt(showInputDialog("Skriv inn et positivt heltall"));
	      int svar = 1;
	      if(n >= 0) {
	    	  for(int i = 1; i <= n; i++) {
	    		  svar = svar * i;
	    		  System.out.println("Eg får som svar: " + svar);
	    	  }
	       showMessageDialog(null,svar);
	       
	      } else {
		 
		   showMessageDialog(null,"Tallet du taster inn kan ikke være negativt!");
	}
  }
}
