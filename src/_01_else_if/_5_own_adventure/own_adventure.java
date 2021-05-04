package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {

	public static void main(String[] args) {
		
	
	
	String question = JOptionPane.showInputDialog(null, "once upon a time there was a ___ (name either a wolf or a rabbit)");

	if(question.equals("wolf")){
		String question2 = JOptionPane.showInputDialog(null, "once upon a time there was wolf and he was really ___(type either tired or hungry)");
		
		if(question2.equals("tired")) {
			JOptionPane.showMessageDialog(null, "once upon a time there was wolf and he was really tired so he went to sleep");
		}
			if(question2.equals("hungry")) {
				JOptionPane.showMessageDialog(null, "once upon a time there was wolf and he was really hungry so he ate a rabbit");
			
		}
		
	}
	if(question.equals("rabbit")){
		
		String question3 = JOptionPane.showInputDialog(null, "once upon a time there was a rabbit that was getting chased by a ___ (name either a wolf or a rabbit)");
	
		if(question3.equals("wolf")) {
			
			JOptionPane.showMessageDialog(null, "once upon a time there was a rabbit that was getting chased by a wolf and got eaten ");
		}
			if(question3.equals("rabbit")) {
				
				JOptionPane.showMessageDialog(null, "once upon a time there was a rabbit that was getting chased by a rabbit playing tag");
	}
	
	
	
}
	}
}
	