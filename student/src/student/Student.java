package student;

//Data class


public class Student {
	//0418 과제 1. 모든 필드 .메서드 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리(프로그램 종료는 정상 종료)
	//3. 점수값 입력의 범위 0~100 사이만 인정
	//4. 이름 입력은 한글만 인정, 2글자~4글자 사이 -예외 조건문 다 상관없
	//5. 임시데이터의 점수값을 랜덤으로 배정해서 시작(60~100)
	//6. circle 관련 예제 레슨 8챕터 도형의 연습 , 다향성
	
	
	Student(){} // 1번 기본 생성자먼저 작성
		
	int no; // 학번
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	
	
	 Student(int no, String name) {
		 
	    	this.no= no;
	    	this.name = name;
	    	
	  }
	 
	 Student (int no, String name, int kor, int eng ,int mat) { 
		this.no= no;
	    this.name = name;
	    this.kor = kor;
	    this.eng = eng;
	    this.mat = mat;
		  
	 }	 
	 int total () {
		 return kor+eng+mat;
	 }
    
	 double avg() {
		 return (total()/ 3d );
	 }
	 
	 public String toString () {
		 return String.format("%d %s %d %d %d %f %d",no, name,kor,eng,mat);
	 }
}