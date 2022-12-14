package chap09_interface;

//인터페이스의 내용을 가져오고 싶을때 extends를 통해 가져올 수 있다.
//인터페이스의 경우 생성자가 없기때문에, 여러개의 인터페이스를 상속받을 수 있다.
public interface CarOptionInterface extends CarInterface, Days {
	
	public void carDrive();
	
	// 디폴트 메소드 추가 - 실체가 있는 메소드
	// days에 있는 값을 이용하여 차량이 쉬는 날인지를 확인
	// 숫자값이 들어왔을 때, 그 숫자값에 따라서 쉬는 날을 결정
	// ex) RestDay(1) > 일요일이 쉬는 날입니다.
	default public void RestDay(int day) {
		// day가 어떤 값이 들어오든지 일~토를 출력하려고 함
		// 1, 8, 15 들어오면 1로 생각 > 일요일 출력
		// 7, 14, 21 들어오면 7로 생각 > 토요일 출력
		// 좀 더 간단하게 작성하고 싶다면 삼항연산자 사용
		int daySeven;
		if (day%7 == 0) {
			daySeven = 7;
		} else {
			daySeven = day%7;
		}
		
		// 삼항연산자로 작성하기
		int daySeven2 = (day%7 == 0) ? 7 : day%7; 
		
		String date = "";
		
		switch (daySeven) {
		case SUNDAY:
			date = "일요일";
			break;
		case MONDAY:
			date = "월요일";
			break;
		case TUESDAY:
			date = "화요일";
			break;
		case WEDNESDAY:
			date = "수요일";
			break;
		case THURSDAY:
			date = "목요일";
			break;
		case FRIDAY:
			date = "금요일";
			break;
		case SATURDAY:
			date = "토요일";
			break;
		}
		System.out.println(date+"에 차량이 쉬는 날입니다.");
	}
	
}
