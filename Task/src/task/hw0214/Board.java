package task.hw0214;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Board implements BoardManager {
	/**
	 * index 값을 채우기 위한 변수
	 */
	private static int nextIndex;
	/**
	 * 찐 index
	 */
	private String postId;
	/**
	 * 게시글 제목
	 */
	private String title;
	/**
	 * 게시글 작성자 이름
	 */
	private String writer;

	/**
	 * 게시글 내용
	 */
	private String content;

	/**
	 * 게시글 작성 날짜(연일월)
	 */
	private String writeDate;

	/**
	 * 게시글 작성 시간(시분초)
	 */
	private String writeTime;

	/**
	 * 댓글 목록
	 */
	private List<String> comment;

	private List<String> boardList = new ArrayList<>();
	private static final String FILE_PATH = "board_data.txt";
	private static final String DIRECTORY_PATH = "C:\\Users\\WIN\\Desktop\\FileIOExam\\Board";

	public Board() {}

	public Board(String title, String writer, String content) {

		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

		this.postId = Integer.toString(Board.nextIndex++);
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = dateFormatter.format(nowDate);
		this.writeTime = timeFormatter.format(nowTime);

	}

	public String getPostId() {
		return this.postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteDate() {
		return this.writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getWriteTime() {
		return this.writeTime;
	}

	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}

	public List<String> getComment() {
		return this.comment;
	}

	public void setComment(List<String> comment) {
		this.comment = comment;
	}
	
	public static String getDirectoryPath() {
		return DIRECTORY_PATH;
	}

	public static String getFilePath() {
		return FILE_PATH;
	}

	@Override
	public void boardList() {
		File targetFile = new File(getDirectoryPath(), getFilePath());

		try {
			List<String> fileLines = Files.readAllLines(targetFile.toPath());
			if (fileLines.size() <= 0) {
				System.out.println("등록된 게시글이 없습니다. 첫 게시글을 등록해주세요");
				return;
			}
			// 파일에서 index와 일치하는 값을 찾는 코드
			for (String line : fileLines) {
				System.out.println(line);

			}

		} catch (IOException ioe) {
			System.out.println("파일을 불러오는 중에 에러가 발생했습니다. ");
			System.out.println("원인: " + ioe.getMessage());
		}

	}

	@Override
	public void boardWrite(List<String> data) {
		File targetFile = new File(getDirectoryPath(), getFilePath());

		if (!targetFile.getParentFile().exists()) {
			targetFile.getParentFile().mkdirs();
		}

		try {
			this.boardList = readFile();
			if (this.boardList != null) {
				this.boardList.addAll(data);
				Files.write(targetFile.toPath(), boardList);
				// 쓴 파일의 위치를 출력한다.
				System.out.println(targetFile.getAbsolutePath());
				return;
			}
			Files.write(targetFile.toPath(), data);
			// 쓴 파일의 위치를 출력한다.
			System.out.println(targetFile.getAbsolutePath());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	@Override
	public void contentRead(int index) {

		List<String> fileLines = readFile();

		// 파일에서 index와 일치하는 값을 찾는 코드
		for (int i = 0; i < fileLines.size(); i++) {
			if (fileLines.get(i).contains(index + ",")) {
				System.out.println(fileLines.get(i));
			}
		}
	}



	@Override
	public void boardUpdate(int findIndex, String value) { // 파일에서 읽어온 내용
		  // 파일에서 읽어온 내용
	    List<String> fileLines = readFile();

	    // 수정할 항목을 구분하기 위해 'title:' 또는 'content:' 문자열을 찾기
	    String[] parts = value.split(":");  // "title: 새로운 제목" 또는 "content: 새로운 내용"으로 분리
	    
	    if (parts.length != 2) {
	        System.out.println("잘못된 형식입니다.");
	        return;
	    }

	    String field = parts[0].trim();  // 제목 또는 내용
	    String newValue = parts[1].trim();  // 새로운 값

	    System.out.println("수정할 항목: " + field);  // 디버깅을 위한 출력
	    System.out.println("새로운 값: " + newValue);  // 디버깅을 위한 출력

	    // 해당 게시글을 찾고 수정
	    boolean isModified = false;  // 수정 여부를 추적

	    for (int i = 0; i < fileLines.size(); i++) {
	        if (i == findIndex) {  // 수정할 항목을 찾았을 때
	            String line = fileLines.get(i);
	            System.out.println("수정 전: " + line);  // 수정 전 내용을 출력

	            // 제목 수정
	            if ("title".equalsIgnoreCase(field)) {
	                String[] segments = line.split("\\|");  // | 기준으로 분리
	                segments[1] = " 제목: " + newValue+", ";  // 제목 부분을 수정
	                fileLines.set(i, String.join("|", segments));  // 수정된 라인을 다시 설정
	            }
	            // 내용 수정
	            else if ("content".equalsIgnoreCase(field)) {
	                String[] segments = line.split("\\|");  // | 기준으로 분리
	                segments[2] = " 내용: " + newValue+", ";  // 내용 부분을 수정
	                fileLines.set(i, String.join("|", segments));  // 수정된 라인을 다시 설정
	            }
	            // 잘못된 항목 입력 처리
	            else {
	                System.out.println("수정할 항목을 잘못 입력했습니다.");
	                return;
	            }

	            System.out.println("수정 후: " + fileLines.get(i));  // 수정 후 내용을 출
	            File targetFile = new File(getDirectoryPath(), getFilePath());

	            try {
	                // 파일에 수정된 내용 덮어쓰기
	                Files.write(targetFile.toPath(), fileLines);  // 수정된 내용만 덮어씁니다.
	                System.out.println("파일이 성공적으로 저장되었습니다.");
	            } catch (IOException e) {
	                System.out.println("파일에 저장하는 중에 오류가 발생했습니다.");
	                e.printStackTrace();
	            }
	            isModified = true;  // 수정됨
	            break;  // 수정이 끝났으면 루프를 종료
	        }
	    }

	    if (!isModified) {
	        System.out.println("지정한 인덱스의 게시글을 찾을 수 없습니다.");
	        return;
	    }

	    // 수정된 내용을 파일에 저장 (덮어쓰지 않고 해당 인덱스만 수정)

	    System.out.println("게시글이 수정되었습니다.");
	}

	@Override
	public void boardDelete(int index) {
		List<String> fileLines = readFile();
		for (int i = 0; i < fileLines.size(); i++) {
			if (fileLines.get(i).contains(index + ",")) {
				fileLines.remove(i);
				System.out.println(fileLines);
			}
		}
	    File targetFile = new File(getDirectoryPath(), getFilePath());

        try {
            // 파일에 수정된 내용 덮어쓰기
            Files.write(targetFile.toPath(), fileLines);  // 수정된 내용만 덮어씁니다.
            System.out.println("파일이 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일에 저장하는 중에 오류가 발생했습니다.");
            e.printStackTrace();
        }
		
	}

	public List<String> readFile() {
		File targetFile = new File(getDirectoryPath(), getFilePath());
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(targetFile.toPath());
		} catch (IOException e) {
			System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
			e.printStackTrace();
		}
		return lines;
	}

	public String toFileFormat() {
		return "%s,%s,%s,%s,%s,%s,%s".formatted("index: " + this.postId, " | 제목: " + this.title,
				" | 작성자: " + this.writer, " | 내용: " + this.content, " | 작성일시: " + this.writeDate, this.writeTime,
				" | 댓글목록 : " + (this.comment != null ? String.join(",", this.comment) : "댓글이 없습니다. 첫 댓글의 주인공이 되어보세요."));
	}



}
