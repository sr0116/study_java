package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	// {null,null,null,null,null,null,null,null,null,null,(총 10개 들어가있는거)}
	int count;
	private char[] msg;
	{
	//	students[count++] = new Student() 나중에 작성
	}

	//등록
	void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어 , 영어 , 수학
		int no = StudentUtils.nextInt("학번>");
		String name = StudentUtils.nextLine("이름>");
		int kor = StudentUtils.nextInt("국어>");
		int eng = StudentUtils.nextInt("영어>");
		int mat = StudentUtils.nextInt("수학>");
		if(students.length == count) {//2배씩 늘리는게 원칙
			students = Arrays.copyOf(students, students.length *2);
		}
		students[count++] = new Student(no,name,kor,eng,mat);
		
	}
	//조회 // 반복 시켜야함
	void read() {
		System.out.println("조회 기능");
		for(int i = 0; i< count; i++) {
			System.out.println(students[i].no+","+ students[i].name+","+ students[i].total()+students[i].avg());
			
			 //System.out.printf("평균 :" +"%.2f\n", students[i].avg()); 
			//System.out.printf("평균 :"+ students[i].total2() +"점"); //문자열은 하나라도 있으면 문자열
		}
	}
	//수정

	void modify() {
		System.out.println("수정 기능"); //class
			//학생들의 배열에서 입력받은 학번과 일치하는 학생
			int no =StudentUtils.nextInt("수정할 학생의 학번 :");
			Student s = null;
			for (int i = 0; i < count; i++) {
				if(students[i].no == no) {
					s= students[i];
					break;
				}
			} 
			s.name = StudentUtils.nextLine("이름>");
			s.kor = StudentUtils.nextInt("국어>");
			s.eng = StudentUtils.nextInt("영어>");
			s.mat = StudentUtils.nextInt("수학>");
		}

	private String nextLine(char[] msg2) {
		return null;
	}
	//삭제
	void remove() {
		System.out.println("삭제 기능");
		
		int no =StudentUtils.nextInt("삭제할 학생의 학번 :");
		for (int i = 0; i < count; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- -1 -i);		
				break;
			}
		}
	}
	
	// 1. 중복학번 학생 등록 방지
	//2. 점수당 평균값 출력 + 총평균 새메뉴
	// 3. 석차순 정렬 새메뉴
	//4. Student 클래스의 toString 재정의
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int idx = 0;
		System.arraycopy(arr, idx+1, arr, idx, arr.length -1 -idx);
		System.out.println(Arrays.toString(arr));
	}
}
