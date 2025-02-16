package task.hw0214;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Comment implements CommentManager {
	/**
	 * index 값을 채우기 위한 변수
	 */
	private static int nextIndex =1;

	private int commentId;

	private int postId;

	private String commentWriter;

	private String commentContent;

	private String commentWriteDate;

	private String commentWriteTime;

	public Comment() {
	}

	public Comment(int postId, String commentWriter, String commentContent) {
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		this.postId = postId;
		this.commentId = Comment.nextIndex++;
		this.commentWriter = commentWriter;
		this.commentContent = commentContent;
		this.commentWriteDate = dateFormatter.format(nowDate);
		this.commentWriteTime = timeFormatter.format(nowTime);
	}

	@Override
	public void commentRead(int index) {
		   List<String> fileLines = readFile();

		    boolean found = false; // 게시글을 찾았는지 여부를 추적하는 변수

		    // 파일에서 index와 일치하는 값을 찾는 코드
		    for (int i = 0; i < fileLines.size(); i++) {
		        String line = fileLines.get(i);
		        if (line.contains("index: " + index + ",")) { // 해당 게시글을 찾음
		            found = true; // 게시글을 찾았으므로 flag를 true로 설정
		            if (line.contains("댓글 목록:")) {
		                // 댓글 목록을 출력
		                System.out.println(line.substring(line.indexOf("댓글 목록:")));
		            } else {
		                // 댓글 목록이 없으면
		                System.out.println("댓글이 없습니다.");
		            }
		            break; // 게시글을 찾았으면 루프 종료
		        }
		    }

		    if (!found) { // 게시글을 찾지 못했다면
		        System.out.println("잘못된 게시글 번호입니다.");
		    }
	}

	@Override
	public void commentWrite(List<String> data) {
		List<String> fileLines = readFile(); // 파일 읽기

		String newComment = " | " + data.get(0).trim(); // 새 댓글 데이터 추가
		boolean isUpdated = false;

		for (int i = 0; i < fileLines.size(); i++) {
			String line = fileLines.get(i);

// 해당 postId 찾
			if (line.contains("댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.")) {
				// 기존 "댓글이 없습니다." 삭제 후 새 댓글 추가
				line = line.replace("댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.", "");
				line += newComment;
			} else {
				// 기존 댓글이 있으면 추가
				line += " || " + newComment;
			}
			System.out.println(fileLines.get(i));
			fileLines.set(i, line);
			isUpdated = true;
			break;
		}

		if (!isUpdated) {
			System.out.println("해당 PostID를 찾을 수 없습니다.");
		} else {
			File targetFile = new File(Board.getDirectoryPath(), Board.getFilePath());

			try {
				// 파일에 수정된 내용 덮어쓰기
				Files.write(targetFile.toPath(), fileLines); // 수정된 내용만 덮어씁니다.
				System.out.println("파일이 성공적으로 저장되었습니다.");
			} catch (IOException e) {
				System.out.println("파일에 저장하는 중에 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}

	}

	@Override
	public void commentDelete(int index, int index2) {
		List<String> fileLines = readFile(); // 파일 읽기

		for (int i = 0; i < fileLines.size(); i++) {
			String line = fileLines.get(i);

			if (line.startsWith("index: " + index + ",")) { // 해당 게시글 찾기
				if (line.contains("| 댓글 번호: " + index2 + ",")) { // 댓글 찾기
					// 댓글 패턴 찾기
					String regex = "(\\|\\|\\s*)?\\|\\s*index: " + index + ",\\s*\\|\\s*댓글 번호: " + index2 + ",.*?(\\| 댓글 번호:|$)";
					line = line.replaceAll(regex, "").trim(); // 해당 댓글 삭제

					// 모든 댓글이 삭제되었으면 "댓글이 없습니다." 추가
					if (!line.contains("| 댓글 번호:")) {
						line += " | 댓글 목록: 댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.";
					}

					fileLines.set(i, line);
					break;
				} else {
					System.out.println("해당 댓글을 찾을 수 없습니다.");
					return;
				}
			}
		}

		File targetFile = new File(Board.getDirectoryPath(), Board.getFilePath());

		try {
			// 파일에 수정된 내용 덮어쓰기
			Files.write(targetFile.toPath(), fileLines);
			System.out.println("파일이 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생!");
			e.printStackTrace();
		}
	}

	public List<String> readFile() {
		File targetFile = new File(Board.getDirectoryPath(), Board.getFilePath());
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(targetFile.toPath());
		} catch (IOException e) {
			System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
			e.printStackTrace();
		}
		return lines;
	}

	@Override
	public String toString() {
		return Integer.toString(this.postId) + this.commentId + this.commentWriter + this.commentContent
				+ this.commentWriteDate + this.commentWriteTime;
	}

	public String toFileFormat() {
		return "%s,%s,%s,%s,%s,%s".formatted("index: " + this.postId, " | 댓글 번호: " + this.commentId,
				" | 작성자: " + this.commentWriter, " | 내용: " + this.commentContent, " | 작성일시: " + this.commentWriteDate,
				this.commentWriteTime);
	}
}
