
package _03_modulo._4_fizz_buzz;

import javax.swing.JOptionPane;

/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: 
* 
* Instead of saying a number that is divisible by 3, say "Fizz".
* And instead of saying a number that is divisible by 5, say "Buzz".
* For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* Print your results to the console.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/

public class FizzBuzz {
	
	public static void main(String[] args) {
	
	int x=1;
	
for (int i = 0; i< 20; i++) {
	
	if(x%15==0) {
		JOptionPane.showMessageDialog(null, "fizzbuzz");
	}
	
	else if(x%3==0) {
		JOptionPane.showMessageDialog(null, "fizz");
	}
	else if(x%5==0) {
		JOptionPane.showMessageDialog(null, "buzz");
	}
	else {
		JOptionPane.showMessageDialog(null, "" +x+ "");
	}

	x+=1;
}
	
	
	
	
	
	
	}
}

