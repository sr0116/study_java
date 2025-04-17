package lesson08.shape;

import lesson08.Rect;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		
		Rect rect = new Rect(4,5);
		
		Shape[] shapes = {circle,rect};
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getClass().getSimpleName());
			System.out.println(shapes[i].area());
			System.out.println(shapes[i].circum());
		
		}
	}
}
