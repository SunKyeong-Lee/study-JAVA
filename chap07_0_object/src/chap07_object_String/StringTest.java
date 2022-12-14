package chap07_object_String;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 클래스의 메소드 확인
		String word = new String("단어");
		
		// charAt을 사용하면 문자열의 인덱스를 통해 문자를 출력할 수 있다.
		// 배열과 동일한 인덱스를 가지고 있다. (0부터 시작)
		System.out.println(word.charAt(0)); // 단
		System.out.println(word.charAt(1)); // 어
		
		// compareTo 사전적 순서로 비교
		// 앞에 있으면 -1(음수), 같으면 0, 뒤에 있으면 1(양수)
		System.out.println(word.compareTo("단어")); // 0
		System.out.println(word.compareTo("가지")); // 1768
		System.out.println(word.compareTo("사과")); // -3524
		
		// concat 현재의 단어에 글자를 추가해서 출력
		// 현재의 단어를 바꾸지 않음
		System.out.println(word.concat("장")); // 단어장
		System.out.println(word+"장"); // 단어장 : 메소드 사용과 동일
		System.out.println(word); // 단어

		// equals 문자열을 비교해서 boolean 값을 출력
		System.out.println(word.equals("단어")); // true
		
		// isEmpty는 길이로 boolean값을 출력
		// "" : 빈값으로서 길이가 0
		// null : 아예 가르키는 객체가 없다 = 값이 없다. (에러 발생)
		word = "";
		System.out.println(word.isEmpty()); // true
		
		// length는 길이를 숫자로 출력
		word = "단어";
		System.out.println(word.length()); // 2
		
		// replace 글자를 모두 바꿔줌
		word = "단어어";
		System.out.println(word.replace("어", "아")); // 단아아
		
		// substring 원하는 단어를 잘라서 가져옴
		// 처음 위치 ~ 마지막 위치 (?)
		System.out.println(word.substring(0)); // 전체 출력
		System.out.println(word.substring(0,2)); // 단어
		
		// toLowerCase(), toUpperCase()
		word = "Apple"; 
		System.out.println(word.toLowerCase()); // apple
		System.out.println(word.toUpperCase()); // APPLE
		
		
		
		
		
		// 랩퍼클래스
		
		// 메소드를 쓸 수 없음
		int num = 10;
		
		// 랩퍼클래스를 사용하면 메소드를 쓸 수 없음
		Integer objNum = new Integer(10);
		System.out.println(objNum.equals(0)); // false
		System.out.println(objNum == 10); // true
		
		// Integer에서 메소드를 사용할 수 있다.
		num = Integer.parseInt("5"); // 문자열을 정수형으로
		System.out.println(num+3); // 8 (5+3)
		
		// Parse을 사용하면 문자열을 기초 자료형으로 바꿀 수 있다.
		double objDouble = Double.parseDouble("0.5"); // 문자열을 실수형으로
		System.out.println(objDouble+0.1); // 0.6 (0.5+0.1)
		
		// 랩퍼클래스를 이용해서 문자열로 바꿔줄 수 있다.
		String doubleNum = Double.toString(0.5); // 실수형을 문자열로
		System.out.println(doubleNum+0.1); // 0.50.1 (문자열)
		
		
	}

}
