package lesson08.shape;

public class Circle extends Shape{
	
	int r;
	
	public  Circle() {}
	
	public  Circle(int r) {
		this.r = r;
	}		
	public double circum() {
		return 2* r* Math.PI;
	}
		public double area() {
			return r* r* Math.PI;
			
	}
}
//삼각형 구현 총 4개 클래스  
// 삼차원 도형 원기둥 육면체 삼각기둥 - 3개 클래스 추가하고 겉넓이 부피구하기