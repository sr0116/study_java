package student;

//Data class


public class Student {
	//1. StudentMain의 나머지 기능 구현(메세지 출현)
	//2. Student의 생성자 구현
	// 기본생성자 + (학번, 이름), (다섯개의 필드를 다 사용)
	
	
	// 학생 1인의 총점, 평균을 계산한다면
	//어떻게 처리할 것인지
	
	
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
}