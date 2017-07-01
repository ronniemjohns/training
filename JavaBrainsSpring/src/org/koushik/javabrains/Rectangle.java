package org.koushik.javabrains;

import java.util.List;


public class Rectangle {
	
	private String type;
	private String color;
	private List<Point> points;
	
	
	public Rectangle(String type, String color) {
		this.type = type;
		this.color = color;
	}
	
	public Rectangle() {
		
	}
	
	public void draw() {
		System.out.println("Rectangle drawn of type: " + type + " and color " + color);
		for(Point point : points) {
			System.out.println("Rectangle point: (" + point.getX() + "," + point.getY() + ")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
