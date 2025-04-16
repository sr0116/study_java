package lesson08;

import lesson08.shape.Shape;

public class Rect extends Shape{
	int x, y;
	
	
	public Rect() {}
	public Rect(int x, int y) {
		this.x =x;
		this.y =y;
		
	}
	public double circum() {
		return(x+y) * 2;
	}
	public double area() {
		return x * y;
	}
}
