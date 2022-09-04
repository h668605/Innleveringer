package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String poengsumTxt = showInputDialog("Hvilken poengs2um fikk du?");
			int poengsum = parseInt(poengsumTxt);
			if (poengsum > 100 || poengsum < 0) {
				i--;
				System.out.println("Skriv inn en gyldig poengsum");
			} else {

				if (poengsum <= 39) {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren F");
				} else if (poengsum <= 49) {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren E");
				} else if (poengsum <= 59) {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren D");
				} else if (poengsum <= 79) {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren C");
				} else if (poengsum <= 89) {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren B");
				} else {
					System.out.println("Din poengsum er " + poengsum + ", som tilsvarer karakteren A");
				}
			}
		}
	}
}