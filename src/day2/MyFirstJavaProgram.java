package day2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot r2d2 = new Robot();
		r2d2.setSpeed(100);
		r2d2.sparkle();
		r2d2.move(100);
		r2d2.miniaturize();
		r2d2.move(-100);
		r2d2.setRandomPenColor();
		r2d2.penDown();
		r2d2.move(200);
		r2d2.turn(90);
		r2d2.setRandomPenColor();
		r2d2.move(200);
		r2d2.turn(90);
		r2d2.setRandomPenColor();
		r2d2.expand();
		r2d2.move(200);
		r2d2.expand();
		r2d2.turn(90);
		r2d2.setRandomPenColor();
		r2d2.move(200);

	}
}
