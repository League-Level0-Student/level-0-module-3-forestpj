package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(null, "Are you Happy?");

		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep on doing whatever your doing.");
		}

		if (input.equals("no")) {
			String input2 = JOptionPane.showInputDialog(null, "Do you want to be happy?");

			if (input2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}

			if (input2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep on doing whatever your doing.");
			}
		}

	}
}
