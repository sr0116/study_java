package lesson12;

import java.util.Arrays;

public class Ex2050421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=%EA%B3%A0%EC%96%91%EC%9D%B4&oquery=%EC%9E%90%EB%B0%94+%EB%A0%88%ED%8D%BC%ED%81%B4%EB%9E%98%EC%8A%A4&tqi=jsUValqX5E0ssaDVHBdssssssMK-431385&ackey=v272m0i1";
		// 프로토콜:// 도메인/파일명?(물음표가쿼리스트링.파라미터)
		//1. 위 항목에 맞춰 문자열 자르기
		//where=nexearch&ssc =tab.nx.all&query =%EA%B3%A0%EC%96%91%EC%9D%B4&oquery=%EC%9E%90%EB%B0%94+%EB%A0%88%ED%8D%BC%ED%81%B4%EB%9E%98%EC%8A%A4&tqi=jsUValqX5E0ssaDVHBdssssssMK-431385&ackey=v272m0i1";
		// 쿼리스트링 추출한 이gn에
		//쿼리스트링은 키1(변수명) = 값 1& 키2 =값2 (현재 6개의 쌍)
		//즉 값의 쌍은 &로 구분, 키와 값은 = 로 구분
		
		String [] url2 = url.split(":");
		System.out.println( Arrays.toString(url2));
//		
		String [] url3 = url.split("&");
		System.out.println( Arrays.toString(url3));
		
		
//		String [] url2 = url.length();
//		for(String s :  url) { 
//			if(!s.startsWith("&")) {
//				System.out.println(s);				
//		}
//		
//		
//	}
//		String url2= url.substring(0,6);
		
//		System.out.println("프로토콜>>" + url2);
//		System.out.println("도메인>>" + url2);
//		System.out.println("파일명>>" + url2);
//		System.out.println("?이후>>" + url2);
//		
	}
	}
