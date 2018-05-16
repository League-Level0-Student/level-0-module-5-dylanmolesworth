package extra;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void Prime() {

		JOptionPane.showMessageDialog(null, "Prime!");

	}

	public static void NotPrime() {

		JOptionPane.showMessageDialog(null, "Not Prime!");

	}

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Say a Number!");

		int pon = Integer.parseInt(num);

		if (pon == 1) {
			Prime();
			return;
		}
		if (pon % 2 == 0) {
			NotPrime();
			return;
		}
		for (int i = 2; i < pon; i++) {
			if (pon % i == 0) {
				NotPrime();
				return;
			}
		}
		Prime();
	}
}
