package task.hw0214;

public interface BoardManager {
	/**
	 * 게시글 목록
	 */
	public void boardList();
	
	/**
	 * 게시글 읽기
	 */
	public void contentRead(int index);
	
	/**
	 * 게시글 쓰기
	 */
	public void write();
	
	/**
	 * 게시글 삭제
	 */
	public void delete();
	
}
