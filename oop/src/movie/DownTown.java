package movie;

public class DownTown {

	public static void main(String[] args) {
		
		Theater cgv = new Theater();
		System.out.println(cgv);
		
		Movie 하얼빈 = new Movie();
		하얼빈.title = "하얼빈";
		하얼빈.runningTime = 120;
		
		Seat h6 = new Seat();
		h6.seatNumber = "h6";
		h6.isFold = true;
		
		Speaker harman = new Speaker();
		harman.volume = 50;
		harman.isOn = false;
		
		AirConditioner carrier = new AirConditioner();
		
		Projector miniBeam = new Projector();
		miniBeam.isOn = true;
		
		Light sony = new Light();
		sony.color = "대충 노란색";
		sony.isOn = true;
		
		cgv.movie = 하얼빈;
		cgv.seat = h6;
		cgv.speaker = harman;
		cgv.light = sony;
		cgv.airConditioner = carrier;
		cgv.projector = miniBeam;
		
		cgv.playMovie();
		cgv.playMovie();
		
		cgv.turnOnAirConditioner();
		cgv.turnOnAirConditioner();
		
		cgv.turnOnLight();
		cgv.turnOnLight();
		
		cgv.controlVolume(50);
		cgv.controlVolume(60);
		cgv.controlVolume(-70);
		cgv.controlVolume(-50);
		
		cgv.changeSeatState();
		cgv.changeSeatState();
		
		
	}
	
}