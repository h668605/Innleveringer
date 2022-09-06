package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB4 {
	public static void main(String[] args) {

		String lønnTxt = showInputDialog("Hvor mye tjente du i år?");
		double lønn = parseDouble(lønnTxt);

		if (lønn <= 190349) {
			showMessageDialog(null, "Du skal betale: kr 0 i skatt");
		} else if (lønn <= 267899) {
			double skatteTrekk = lønn * 0.017;
			showMessageDialog(null, "Du skal betale: kr " + skatteTrekk + " i skatt");
		} else if (lønn <= 643799) {
			double skatteTrekk = lønn * 0.04;
			showMessageDialog(null, "Du skal betale: kr " + skatteTrekk + " i skatt");
		} else if (lønn <= 969199) {
			double skatteTrekk = lønn * 0.134;
			showMessageDialog(null, "Du skal betale: kr " + skatteTrekk + " i skatt");
		} else if (lønn <= 1999999) {
			double skatteTrekk = lønn * 0.164;
			showMessageDialog(null, "Du skal betale: kr " + skatteTrekk + " i skatt");
		} else {
			double skatteTrekk = lønn * 0.174;
			showMessageDialog(null, "Du skal betale: kr " + skatteTrekk + " i skatt");
		}
	}
}
