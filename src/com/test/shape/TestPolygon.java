package com.test.shape;

import com.shape.*;

public class TestPolygon {

	
	public static void main(String[] args) {
		Square s = new Square(5);
		s.calArea();
		s.calPeri();
		
		Rectangle r = new Rectangle();
		r.setLength(10.5f);
		r.setBreadth(20f);
		r.calArea();
		r.calPeri();
	}

}
