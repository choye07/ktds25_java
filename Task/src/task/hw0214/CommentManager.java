package task.hw0214;

import java.util.List;

/**
 * 게시판 인터페이스
 */
public interface CommentManager {
	
	/**
	 * 댓글 읽기
	 */
	public void commentRead(int index);
	
	/**
	 * 댓글 쓰기
	 */
	public void commentWrite(List<String> data);
	
	/**
	 * 댓글 삭제
	 */
	public void commentDelete(int index, int Index2);
	
}
