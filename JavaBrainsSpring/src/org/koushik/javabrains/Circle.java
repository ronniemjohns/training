package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Required;



public class Circle implements Shape {
	private int diameter;
	private String color;
	private Point center;
	
	public Circle(int diameter, Point center) {
		this.diameter = diameter;
		this.center = center;
	}
	
	public Circle(String color) {
		this.color = color;
	}
	
	public Circle(int diameter, String color) {
		this.diameter = diameter;
		this.color = color;
	}
	
	public Circle() {
		
	}

	public void draw() {
		System.out.println("Circle drawn of diameter: " + diameter 
				+ " and color " + color + " with center (" 
				+ center.getX() + "," + center.getY() + ")");
	}

	public int getDiameter() {
		return diameter;
	}

	
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getColor() {
		return color;
	}

	//@Required
	public void setColor(String color) {
		this.color = color;
	}

	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
}
