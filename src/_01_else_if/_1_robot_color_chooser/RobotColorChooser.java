
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.move(50);
		
		rob.turn(90);
		
        rob.move(50);
		
		rob.turn(90);
		
        rob.move(50);
		
		rob.turn(90);
		
        rob.move(50);
		
		rob.turn(90);
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String input = JOptionPane.showInputDialog(null, "What color do you want to draw with? Red, Yellow, or Blue.");
		//5. Use an if/else statement to set the pen color that the user requested
		if (input.equals("red")) {
			rob.setPenColor(255, 0, 0);
			
		}
		if (input.equals("yellow")) {
			rob.setPenColor(0, 255, 255);
			
		}
		if (input.equals("blue")) {
			rob.setPenColor(0, 0, 255);
			
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
			
			
		}
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
