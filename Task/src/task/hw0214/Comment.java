package task.hw0214;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Comment extends Board{

	private String commentWriter;
	
	private String commentContent;
	
	private String commentWriteDate;
	
	private String commentWriteTime;
	

	public Comment(String title, String writer, String content, String commentWriter, String commentContent, String commentWriteDate, String commentWriteTime) {
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		super(title, writer, content);
		this.commentWriter = commentWriter;
		this.commentContent = commentContent;
		this.commentWriteDate = dateFormatter.format(nowDate);
		this.commentWriteTime = timeFormatter.format(nowTime);
	}
	
//	public Comment(String title, String writer, String content,String commentWriter,String commentContent, String commentWriteDate,String commentWriteTime ) {
//		LocalDate nowDate = LocalDate.now();
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
//		LocalTime nowTime = LocalTime.now();
//		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
//		
//		super(title,writer,content,  );
//		
//		
//		this.commentWriter = commentWriter;
//		this.commentContent = commentContent;
//		this.commentWriteDate = dateFormatter.format(nowDate);
//		this.commentWriteTime = timeFormatter.format(nowTime);
//	}
}
