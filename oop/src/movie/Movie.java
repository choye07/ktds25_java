package movie;

public class Movie {

	// 멤버변수.
	String title;
	
	// 멤버변수
	int runningTime;
	
	public void pringMovieInformation() {
		
		System.out.println("movie title: "+this.title);
		System.out.println("movie runningtime: "+this.runningTime);
		
	}
}