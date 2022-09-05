package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {
	public static void main(String[] args) {

		int nummer = parseInt(showInputDialog("Skriv inn et tall"));
		int sum = 1;

		if (nummer > 0) {
			while (nummer > 0) {
				sum = sum * nummer;
				nummer--;
			}
			showMessageDialog(null, "dette er summen av tallet ditt: " + sum);
		} else {
			showMessageDialog(null, "Skriv inn et tall over 0");
		}
	}
}
