package Oblig1;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		double tall = parseDouble(showInputDialog("Tast inn bruttoinntekt"));
		
		double Trinn0 = tall;
		double Trinn1 = (tall-184800)*0.017;
		double Trinn2 = (184800-260100)*0.017 + (tall-260100)*0.040;
		double Trinn3 = (184800-260100)*0.017 + (651250-260100)*0.040 + (tall-651250)*0.132;
	    double Trinn4 = (184800-260100)*0.017 + (651250-260100)*0.040 + (1021550-651250)*0.132 + (tall-1021550)*0.162;
	    
	    //Trinn0
	    if(tall > 0 && tall <= 184800) {
	    	showInputDialog(null,"Eg har ingen trinnskatt, summen blir: " + Trinn0 + "kr");
	    }
		//Trinn1
	    else if( tall > 184800 && tall <= 260100) {
	    	showInputDialog(null,"Eg har 1,9% trinnskatt, summen blir: " + Trinn1 + "kr");
	    }
		//Trinn2
	    else if( tall > 260100 && tall <= 651250) {
	    	showInputDialog(null,"Eg har 4,0% trinnskatt, summen blir: " + Trinn2 + "kr");
	    }
	    //Trinn3
	    else if( tall > 651250 && tall <= 1021550) {
	    	showInputDialog(null,"Eg har 13,2% trinnskatt, summen blir: " + Trinn3 + "kr");
	    }
        //Trinn4
	    else if( tall > 1021550) {
	    	showInputDialog(null,"Eg har 16,2% trinnskatt, summen blir: " + Trinn4 + "kr");
	    }
	}
}

