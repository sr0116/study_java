package Student;

//Data class


public class Student {
	//1. StudentMain의 나머지 기능 구현(메세지 출현)
	//2. Student의 생성자 구현
	// 기본생성자 + (학번, 이름), (다섯개의 필드를 다 사용)
	
	
	// 학생 1인의 총점, 평균을 계산한다면
	//어떻게 처리할 것인지
	int no;
	String name;
	int kor;
	int eng;
	int mat;


    Student(int no, String n, int k, int e, int m) { 
    	
    	no = no;
    	name = n;
    	kor = k;
    	eng = e;
    	mat= m;
    }
}