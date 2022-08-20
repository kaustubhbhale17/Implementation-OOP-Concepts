package com.shape;

public class Square implements Polygon{
	private float side;
	

	public Square(float side) {
		super();
		this.side = side;
	}
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public void calArea() {
		System.out.println("Area of square is "+(side*side));
		
	}

	public void calPeri() {
		System.out.println("Perimeter of square is "+(4*side));
		
	}
	
}
