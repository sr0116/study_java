//package student;
//
//import java.util.Arrays;
//
//public class StudentService {
//// 1. 모든 필드, 메서드, 생성자 > 접근제한자
//// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
//// 3. 점수값 입력의 범위 0~100 사이만 인정
//// 4. 이름 입력은 한글만 인정, 2글자~4글자사이
//// 5. 임시데이터의 점수값을 랜덤으로 배정(60~100)
//
//// 도형 과제 추가
//// 삼각형, 3차원도형 추가 구현
//
//	private Student[] students = new Student[4];
//	private Student[] sortedStudents = new Student[students.length];
//		int count;
//		
//		
//		{students[count++] = new Student(1, "개똥이", 90, 80, 90);
//		students[count++] = new Student(2, "새똥이", 80, 80, 90);
//		students[count++] = new Student(3, "말똥이", 10, 80, 90);
//		students[count++] = new Student(4, "소똥이", 100, 100, 90);
//		
//		sortedStudents = students.clone();
//		rank();
//		}
//		
//		
//		// 입력 : 학번
//		// 출력 : 학생
//		Student findBy(int no) {
//			Student student = null;
//			for(int i = 0 ; i < count ; i++) {
//				if(students[i].getNo() == no) {
//			student = students[i];
//			break;
//				}
//		}
//		return student;
//		}
//		
//		public boolean checkRange(String subject, int input, int start, int end) {
//			boolean ret = true;
//			if(input < start || input > end) {
//				System.out.println(subject +"값의 범위가 벗어났습니다."+ start+"~"+end+"사이의 입력을 해주세요");
//				ret = false;	
//			}
//			return ret;
//		}
//		
//	public int checkRange(String subject, int input, int start, int end) {
//		}
//			if(input <start input > end) {
//			}
//		throw new IllegalArgumentException(subject + ".
//		return input;
//		public int checkRange(String subject, int input) {
//		}
//		return checkRange (subject, input, 0, 100);
//		public String inputName() {
//		}
//		if (name.length() < 2 name. Length() > 4) {
//		String name StudentUtils.nextLine("O1>");
//		I
//		throw new IllegalArgumentException("0 2-4 ĦL");
//		}
//		for(int i = 0; i < name.length(); i++) {
//		}
//		if (name.charAt(i) < '7' name.charAt(i) > 'ğ1') {
//		}
//		throw new IllegalArgumentException("이름은 한글로 구성되어야합니다");
//		return name;
//				
//				
//		// 등록
//		public void register() {
//			System.out.println("등록 기능");
//		// 학생 생성
//		// 학번, 이름, 국어, 영어, 수학
//			int no = StudentUtils.nextInt("학번 > ");
//		
//		Student s = findBy(no);
//		
//		if(s != null) {
//			System.out.println("중복된 학번이 존재합니다");
//			return;
//		}
//		
//		String name = StudentUtils.nextLine("이름 > ");
//			int kor = StudentUtils.nextInt("국어 > ");
//			if(kor<0||kor>100) {
//				System.out.println("값의 범위가 벗어났습니다.");
//			}
//			int eng = StudentUtils.nextInt("영어 > ");
//			if(eng<0||eng>100) {
//				System.out.println("값의 범위가 벗어났습니다.");
//			}
//			int mat = StudentUtils.nextInt("수학 > ");
//			if(mat<0||mat>100) {
//				System.out.println("값의 범위가 벗어났습니다.");
//				return;
//			}
//			if(students.length == count) {
//			students = Arrays.copyOf(students, students.length * 2);
//			}
//			students[count++] = new Student(no, name, kor, eng, mat);
//			sortedStudents = Arrays.copyOf(students, students.length);
//				
//		}
//		// 조회
//		public void read() {
//			System.out.println("조회 기능");
//			print(students);
//		}
//		public void readOrder() {
//			System.out.println("석차순 조회 기능");
//			print(sortedStudents);
//		}
//		
//		public void print(Student[] stu) {
//			for(int i = 0 ; i < count ; i++) {
//			System.out.println(stu[i]);
//			}
//		}
//		
//		// 수정
//		public void modify() {
//			System.out.println("수정 기능");
//			// 학생들 배열에서 입력받은 학번과 일치하는 학생
//			int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
//			Student s = findBy(no);
//			if(s == null) {
//			System.out.println("입력된 학번이 존재하지 않습니다");
//			return;
//			}
//			
//			String name = StudentUtils.nextInt("이름 > ");
//			s.setName(name);
//			s.setKor( StudentUtils.nextInt("국어 > "));
//			s.setEng(StudentUtils.nextInt("영어 > "));
//			s.setMat(StudentUtils.nextInt("수학 > "));
//			sortedStudents = Arrays.copyOf(students, students.length);
//			rank();
//		}
//		// 삭제
//	public void remove() {
//		System.out.println("삭제 기능");
//			int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
//			Student s = findBy(no);
//			System.out.println(public);
//			return;
//			}
//		
//		for(int i = 0 ; i < count ; i++) {
//			if(students[i].no == no) {
//			System.arraycopy(students, i+1, students, i, count-- - 1 - i);
//			break;
//			}
//		}
//		sortedStudents = Arrays.copyOf(students, students.length);
//		rank();
//	}
//		
//	void allAvg() {
//		// 국어, 영어, 수학, 전체평균
//		double avgKor = 0;
//		double avgEng = 0;
//		double avgMat = 0;
//		double avgAll = 0;
//		
//		// count
//		
//	for(int i = 0 ; i < count ; i++) {
//		avgKor += students[i].kor;
//		avgEng += students[i].eng;
//		avgMat += students[i].mat;
//	}
//		avgKor /= (double)count;
//		avgEng /= (double)count;
//		avgMat /= (double)count;
//		
//		avgAll = (avgKor + avgEng + avgMat) / 3;
//		
//		
//		String mame = StudentUtils.nextLine("이름 >");
//		
//		System.out.println(count + "명의 학생 평균");
//		System.out.println("국어 평균 " + avgKor);
//		System.out.println("영어 평균 " + avgEng);
//		System.out.println("수학 평균 " + avgMat);
//		System.out.println("전체 평균" + avgAll);
//		
//	}
//		
//	void rank() {
//	
//		for(int i = 0 ; i < count - 1; i++ ) {
//			int idx = i;
//		for(int j = 1 + i ; j < count ; j++) {
//			if(sortedStudents[idx].total() < sortedStudents[j].total()) {
//				idx = j;
//		}
//	}
//	Student tmp = sortedStudents[i];
//		sortedStudents[i] = sortedStudents[idx];
//		sortedStudents[idx] = tmp;
//		}
//	}
//}
////package student;
////
////import java.util.Arrays;
////
////public class StudentService {
////	Student[] students = new Student[4];
////	Student[] sortedStudents = new Student[students.length];
////		int count;
////	//입력 :학번
////	//출력: 학생
////	Student findBy(int no) {
////		Student student = null;
////		for (int i = 0; i < count; i++) {
////			if(students[i].no == no) {
////		 student = students[i];
////		 	break;
////			}
////		}
////		return student;	
////	}
////	//등록
////	void register() {
////			
////		System.out.println("등록 기능");
////		// 학생 생성
////		// 학번, 이름, 국어 , 영어 , 수학
////		int no = StudentUtils.nextInt("학번>");
////			Student s = findBy(no);
////		//for(int i = 0; i <count ; i++) { //중복 방지
////			if( s != null) {
////				System.out.println("중복된 학번이 존재합니다");
////					return;
////			}
////		//}
////		
////		String name = StudentUtils.nextLine("이름>");
////			int kor = StudentUtils.nextInt("국어>");
////			int eng = StudentUtils.nextInt("영어>");
////			int mat = StudentUtils.nextInt("수학>");
////				if(students.length == count) {//2배씩 늘리는게 원칙
////					students = Arrays.copyOf(students, students.length *2);
////				}
////					students[count++] = new Student(no,name,kor,eng,mat);
////			
////	}
////	//조회 // 반복 시켜야함
////	void read() {
////		System.out.println("조회 기능");
////		print(students);
////	}
////
////	 void readOver() {
////			System.out.println("석차별 조회 기능");
////			print(sortedStudents);
////	}
////		
////	void print(Student[] stu) {
////		for(int i = 0; i< count; i++) {
////			System.out.println(stu[i]);
////		}
////	
////		for(int i = 0; i< count; i++) {
////			System.out.println(students[i].no+","+ students[i].name+","+ students[i].total()+students[i].avg());
////			
////			 //System.out.printf("평균 :" +"%.2f\n", students[i].avg()); 
////			//System.out.printf("평균 :"+ students[i].total2() +"점"); //문자열은 하나라도 있으면 문자열
////		}
////	}
////	//수정
////
////	void modify() {
////		System.out.println("수정 기능"); //class
////			//학생들의 배열에서 입력받은 학번과 일치하는 학생
////			int no =StudentUtils.nextInt("수정할 학생의 학번 :");
////			//Student s = null;
////
////			Student s = findBy(no);
////			if( s == null) {
////				System.out.println("입력된 학번이 존재하지 않습니다");
////				return;
////			}
//////			for (int i = 0; i < count; i++) {
//////				if(students[i].no == no) {
//////					s= students[i];
//////					break;
//////				}
//////			} 
////			s.name = StudentUtils.nextLine("이름>");
////			s.kor = StudentUtils.nextInt("국어>");
////			s.eng = StudentUtils.nextInt("영어>");
////			s.mat = StudentUtils.nextInt("수학>");
////		}
////
////	private String nextLine(char[] msg2) {
////		return null;
////	}
////	//삭제
////	void remove() {
////		System.out.println("삭제 기능");
////		
////		int no =StudentUtils.nextInt("삭제할 학생의 학번 :");
////			Student s = findBy(no);
////		if( s == null) {
////			System.out.println("입력된 학번이 존재하지 않습니다");
////			return;
////		}
////		for (int i = 0; i < count; i++) {
////			if(students[i].no == no) {
////				System.arraycopy(students, i+1, students, i, count-- -1 -i);		
////				break;
////			}
////		}
////	}
////	//1 중복 학생 등록 방지(학번을 기준으로 학생의 존재 여부)
////	//2. 점수당 평균값 출력 + @ 총평균
////	//3. 석차 순위
////	//4. 
////	void allAvg() {
////		System.out.println("과목별 평균");
////		// 국어, 영어,수학, 전체평균
////		
////		double avgKor =0;
////		double avgEng =0;
////		double avgMat =0;
////		double avgAll =0;
////		
////		//count
////		
////		for(int i = 0; i<count; i++) {
////			avgKor += students[i].kor;
////			avgEng += students[i].eng;
////			avgMat += students[i].mat;
////		}
////		
////		avgKor /= (double)count;
////		avgEng /= (double)count;
////		avgMat /= (double)count;
////		
////		avgAll = ( avgKor+avgEng+avgMat)/3;
////		
////		System.out.println(count + "명의 학생평균");
////		System.out.println("국어 평균"+ avgKor);
////		System.out.println("영어 평균"+ avgEng);
////		System.out.println("수학 평균"+ avgMat);
////		System.out.println("전체 평균"+ avgAll);
////	
////		
////	}
//// 
////	void rank() {
////	        for(int i =0; i< count-1;i++) {
////			int idx = i;// 0이니까
////			for(int j = 1 + i; j< count;j++) {
////				if(sortedStudents[idx].total()> sortedStudents[j].total()) {//대소 비교에 따라 오름차순 내림차순 설정 변경 가능
////					idx = j;
////				}
////			}
////			Student tmp = sortedStudents[i];
////			sortedStudents[i] =sortedStudents[idx];
////			sortedStudents[idx] = tmp;
////			
////	        } 
////
////	    int allStu = scores.length;             // 모든 학생 =모든 점수
////	    int subjectCount = scores[0].length; // 0부터 시작
////	    int totalSum = 0;
////	    int totalScore = allStu * subjectCount; 
////
////	    for (int i = 0; i < allStu; i++) {
////	        for (int j = 0; j < subjectCount; j++) {
////	            totalSum += scores[i][j];
////	        }
////	    }
////
////	    double totalAvg = double totalSum / totalScore;
////	    System.out.println("전체 총 평균: " + totalAvg);
////	}
////	
////	// 1. 중복학번 학생 등록 방지
////	//2. 점수당 평균값 출력 + 총평균 새메뉴
////	// 3. 석차순 정렬 새메뉴
//////	//4. Student 클래스의 toString 재정의
//////	public static void main(String[] args) {
//////		int [] arr = {1,2,3,4,5};
//////		int idx = 0;
//////		     
//////		System.arraycopy(arr, idx+1, arr, idx, arr.length -1 -idx);
//////		System.out.println(Arrays.toString(arr));
//////		
//////	}
////	
//////	public static void main (String[] arg){
//////		int [] arr = {5,3,2,1,4,10,0,10,5,4};
//////		
////		// 탐색 n 최소값
////		//1,3,2,5,4 > 1회차 결과
////		//1,2,3,5,4> 2회차
////		//1,2,3,5,4> 3회차
////		//1,2,3,4,5> 4회차
////		//
//////		for(int i =0; i<arr.length-1;i++) {
//////		int idx = i;// 0이니까
//////		for(int j = 1 + i; j< arr.length;j++) {
//////			if(arr[idx]> arr[j]) {//대소 비교에 따라 오름차순 내림차순 설정 변경 가능
//////				idx = j;
//////			}
//////		}
//////		int tmp = arr[i];
//////		arr[i] =arr[idx];
//////		arr[idx] = tmp;
//////		
//////		System.out.println(i+1+"회차::"+Arrays.toString(arr)); //최소값의 인덱스가 중요
////		
////			
////		
////}
////
