package task.hw0214;

import java.util.List;

/**
 * 게시판 인터페이스
 */
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
	public void boardWrite(List<String> data);

	/**
	 * 게시글 수정
	 */
	public void boardUpdate(int index,String data);

	/**
	 * 게시글 삭제
	 */
	public void boardDelete(int index);

}
