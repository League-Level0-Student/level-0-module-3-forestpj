
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		int x=30;
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(25);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		rob.penDown();
		
		for (int i=0;i<10;i++) {
		
		for (int i2=0;i2<5;i2++) {
			
		rob.setSpeed(999999999);
		rob.turn(144);
		// 3. Set the length of each line in the star to 30.
		rob.move(30);
		
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */
		}
		x+=75;
		rob.moveTo(x, 300);
		
		
		}
	}

}
