package task.hw0214;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Board implements BoardManager{
	protected  int index;
	/**
	 * 게시글 제목
	 */
	protected String title;
	/**
	 * 게시글 작성자 이름
	 */
	protected String writer;
	
	/**
	 * 게시글 내용
	 */
	protected String content;
	
	/**
	 * 게시글 작성 날짜(연일월)
	 */
	protected String writeDate;
	
	/**
	 * 게시글 작성 시간(시분초)
	 */
	protected String writeTime;

	/**
	 * 댓글 목록
	 */
	protected List<Comment> comment;
	
	
	public Board(String title, String writer, String content) {
		
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		int num =0;
		this.index = num+=1;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = dateFormatter.format(nowDate);;
		this.writeTime = timeFormatter.format(nowTime);
		
	}


	@Override
	public void boardList() {
		
	}


	@Override
	public void contentRead(int index) {
		
	}


	@Override
	public void write() {
		
	}


	@Override
	public void delete() {
		
	}
	
	
}
