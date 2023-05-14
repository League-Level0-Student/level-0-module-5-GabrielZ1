package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {


	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape would you like drawn? (square, triangle, or circle)");
		String color = JOptionPane.showInputDialog("And what color would you like this shape? (red, orange, yellow, green, blue, or purple)");

		int colR = 0;
		int colG = 0;
		int colB = 0;


		if(color.equalsIgnoreCase("red")) {
			colR = 255;
			colG = 0;
			colB = 0;

		}
		else if(color.equalsIgnoreCase("orange")) {
			colR = 255;
			colG = 165;
			colB = 0;

		}
		else if(color.equalsIgnoreCase("yellow")) {
			colR = 255;
			colG = 255;
			colB = 0;

		}
		else if(color.equalsIgnoreCase("green")) {
			colR = 0;
			colG = 255;
			colB = 0;

		}
		else if(color.equalsIgnoreCase("blue")) {
			colR = 0;
			colG = 0;
			colB = 255;

		}
		else if(color.equalsIgnoreCase("purple")) {
			colR = 255;
			colG = 0;
			colB = 255;
		}


		if(shape.equalsIgnoreCase("square")) {
			drawSquare(colR, colG, colB);

		}
		else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle(colR, colG, colB);

		}
		else if (shape.equalsIgnoreCase("circle")) {
			drawCircle(colR, colG, colB);

		}



	}

	public static void drawSquare(int colR, int colG, int colB) {
		Robot rob = new Robot();
		rob.show();
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colR, colG, colB);

		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);

		rob.penUp();
		rob.hide();

	}


	public static void drawTriangle(int colR, int colG, int colB) {
		Robot rob = new Robot();
		rob.show();
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colR, colG, colB);

		rob.setAngle(30);
		rob.move(50);
		rob.setAngle(150);
		rob.move(50);
		rob.setAngle(270);
		rob.move(50);

		rob.penUp();
		rob.hide();
	}


	public static void drawCircle(int colR, int colG, int colB) {
		Robot rob = new Robot();
		rob.show();
		rob.setSpeed(20);
		rob.penDown();
		rob.setPenColor(colR, colG, colB);

		
		for(int i = 1; i<= 125; i++)
		{
			rob.move(5);
			rob.turn(3);
		}


		rob.penUp();
		rob.hide();




	}



}
