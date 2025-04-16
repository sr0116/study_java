package student;

public class StudentService {
	Student[] students = new Student[2];
	// {null,null,null,null,null,null,null,null,null,null,(총 10개 들어가있는거)}
	int count;
	private char[] msg;
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
		
		students[count++] = new Student(no,name,kor,eng,mat);
		
	}
	//조회 // 반복 시켜야함
	void read() {
		System.out.println("조회 기능");
		for(int i = 0; i< count; i++) {
			System.out.println(students[i].no+","+ students[i].name+","+ students[i].total());
			
			 System.out.printf("평균 :" +"%.2f\n", students[i].total2()); 
			//System.out.printf("평균 :"+ students[i].total2() +"점"); //문자열은 하나라도 있으면 문자열
		}
	}
	//수정

	void modify() {
		System.out.println("수정 기능");
		System.out.println	Integer.parseInt(nextLine(msg);
		System.out.print(scanner.nextLine(msg));
		
		
		
	}
	private String nextLine(char[] msg2) {
		// TODO Auto-generated method stub
		return null;
	}
	//삭제
	void remove() {
		System.out.println("삭제 기능");
	}
}
