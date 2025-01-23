package movie;

public class Theater {

	// 속성 (상영관이 가지고 있는것들)
	Movie movie;
	
	Seat seat;
	
	Speaker speaker;
	
	Light light;
	
	AirConditioner airConditioner;
	
	Projector projector;
	
	// 기능(행동) - 상영관이 할 수 있는 것들.
	// 1. 영화를 재생한다.
	//    - projector 변수의 isOn 값이 false 라면 isOn 값을 true로 변경한다.
	//    - projector 변수의 isOn 값이 true 일 때만 isPlay 값을 true 로 변경한다.
	//      projector 변수의 isPlay 값이 true 라면 "영화의 제목을 러닝타임동안 재생합니다." 라고 출력.
	//    - projector 변수의 isPlay 값을 false 로, isOn 값도 false 로 변경한다.
	public void playMovie() {
		if (! projector.isOn) {
			projector.isOn = true;
		}
		
		if (projector.isOn) {
			projector.isPlay = true;
			
			if (projector.isPlay) {
				System.out.println( movie.title + "을 " 
								+ movie.runningTime + "분 동안 재생합니다.");
				projector.isPlay = false;
				projector.isOn = false;
			}
		}
	}
	
	
	// 2. 에어컨을 켠다.
	//    - airConditioner 의 isOn 값이 false 라면 true 로 바꿔준다.
	//      - 현재온도, 세기, 냉/난방여부, 설정온도를 할당한다.
	public void turnOnAirConditioner() {
		if ( !airConditioner.isOn ) {
			airConditioner.isOn = true;
			
			airConditioner.nowTemperature = (float) Math.random() * 40;
			airConditioner.windSpeed = (int) (Math.random() * 4);
			airConditioner.aimTemperature = (float) Math.random() * 40;
			
			boolean isNowWinter = airConditioner.nowTemperature < airConditioner.aimTemperature;
			airConditioner.isCooling = !isNowWinter;
		}
	}
	
	// 3. 조명을 끄고 켠다.
	//    - light 의 isOn 값이 false 라면 true 로 바꿔주고, true 라면 false 로 바꾼다.
	//      light 의 isOn 값이 true 라면 light 의 color를 지정해준다.
	//      light 의 isOn 값이 false 라면 light 의 color를 null 로 변경한다. 예> color = null;
	//    - color 를 지정하는 방법:
	//		- 0 ~ 2중의 임의의 난수를 받아서 0이면 "RED", 1이면 "BLUE", 2이면 "GREEN" 으로 지정.
	public void turnOnLight() {
		light.isOn = !light.isOn;
//		if (light.isOn) {
//			light.isOn = false;
//		}
//		else {
//			light.isOn = true;
//		}
		if (light.isOn) {
			int colorNumber = (int)(Math.random() * 3);
//			light.color = switch(colorNumber) {
//				case 0 -> "RED";
//				case 1 -> "BLUE";
//				default -> "GREEN";
//			};
			
			if (colorNumber == 0) {
				light.color = "RED";
			}
			else if (colorNumber == 1) {
				light.color = "BLUE";
			}
			else {
				light.color = "GREEN";
			}
		}
		else {
			light.color = null;
		}
	}
	
	// 4. 볼륨을 조절한다.
	//    - speaker의 isOn 값이 false 라면 true 로 변경한다.
	//    - speaker의 isOn 값이 true 일때만 볼륨이 변경.
	//       - 볼륨이 변경되는 방식:
	//          - 숫자(정수)를 파라미터로 받아와서 볼륨에 더해 할당하거나 뺀다.
	//          - 증가하거나 감소할 때의 조건.
	//             - 증가된 볼륨의 값이 100 초과된다면 100으로 변경.
	//             - 감소된 볼륨의 값이 0 미만이라면 0으로 변경.
	public void controlVolume(int value) {
		if (!speaker.isOn) {
			speaker.isOn = true;
		}
		
		if (speaker.isOn) {
			speaker.volume += value;
			if (speaker.volume > 100) {
				speaker.volume = 100;
			}
			else if (speaker.volume < 0) {
				speaker.volume = 0;
			}
		}
	}
	
	// 5. 의자를 조정한다.(접고 편다)
	//    - seat 변수의 isFold 값이 true 라면 false 로 바꿔주고, false 라면 true 로 바꿔준다. 
	//    - 변경된 seat 변수의 isFold 값이 true 라면 "좌석번호가 접혔습니다." 라고 출력하고
	//       false라면  "좌석번호가 펼쳐졌습니다." 라고 출력한다.
	public void changeSeatState() {
		seat.isFold = !seat.isFold;
		
		if (seat.isFold) {
			System.out.println(seat.seatNumber + "가 접혔습니다.");
		}
		else {
			System.out.println(seat.seatNumber + "가 펼쳐졌습니다.");
		}
	}
}