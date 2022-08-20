package com.shape;

public class Rectangle implements Polygon{
	
	private float length;
	private float breadth;
	
	public Rectangle(){
		this.length=1;
		this.breadth=1;
	}
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getBreadth() {
		return breadth;
	}


	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	public void calArea() {
		System.out.println("Area of rectangle is "+(length*breadth));
	}
	public void calPeri() {
		System.out.println("Perimeter of rectangle is "+(2*(length+breadth)));
	}
	
	
}
