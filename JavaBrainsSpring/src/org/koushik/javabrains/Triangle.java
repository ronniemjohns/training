package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	private String beanName = null;
	
	// uses setter to inject dependencies
	private String type;
	
	public void draw() {
		System.out.println(getType() + " Triangle drawn");
		//System.out.println("BeanName = " + beanName);
		this.printPoints();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void printPoints() {
		System.out.println("PointA: (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("PointB: (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("PointC: (" + pointC.getX() + "," + pointC.getY() + ")");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
		
	}
}
