package task.hw0214;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 게시판 메인 클래스
 */
public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board();
		Comment comment = new Comment();
		Scanner keyboard = new Scanner(System.in);

		int choice;
		int findIndex;
		int findIndex2;
		String title;
		String writer;
		String content;
		String value;
		String answer;

		while (true) {
			System.out.println("기능을 선택하세요.");
			System.out.print("1. 게시글 목록 조회 2. 게시글 내용 조회 3. 게시글 등록 \n" + "4. 게시글 수정 5. 게시글 삭제 \n"
					+ "6. 댓글 등록 7. 댓글 조회 8. 댓글 삭제 0.종료");
			choice = keyboard.nextInt();
			switch (choice) {
			case 0:
				System.out.println("프로그램이 종료됩니다.");
				return;

			case 1:
				System.out.println("=============게시글 목록 조회============");
				board.boardList();
				continue;
			case 2:
				System.out.print("조회할 게시글 번호를 입력하세요: ");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				continue;
			case 3:
				System.out.print("제목: ");
				title = keyboard.next();
				keyboard.nextLine();

				System.out.print("작성자: ");
				writer = keyboard.next();
				keyboard.nextLine();

				System.out.print("내용: ");
				content = keyboard.next();
				keyboard.nextLine();

				List<String> data = new ArrayList<>();
				data.add(new Board(title, writer, content).toFileFormat());
				board.boardWrite(data);
				continue;
			case 4:
				System.out.println("수정할 게시글의 번호를 눌러주세요.");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				
				System.out.println("수정할 항목을 적어주세요: (ex title: or contetn: )");
				value = keyboard.next();
				keyboard.nextLine();
				board.boardUpdate(findIndex, value);
				continue;
			case 5:
				System.out.println("삭제할 게시글의 번호를 눌러주세요.");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				System.out.println("정말 삭제하시겠습니까?");
				answer = keyboard.next();
				if(answer.equals("Y")) {
					board.boardDelete(findIndex);
				}
				continue;
			case 6:
				System.out.println("댓글을 등록할 게시글의 번호를 눌러주세요.");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				System.out.print("내용: ");
				content = keyboard.next();
				keyboard.nextLine();
				System.out.print("작성자: ");
				writer = keyboard.next();
				keyboard.nextLine();

				List<String> data2 = new ArrayList<>();
				data2.add(new Comment(findIndex,content,writer).toFileFormat());
				comment.commentWrite(data2);
				continue;
			case 7:
				System.out.println("댓글 목록을 볼 게시글 번호를 눌러주세요.");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				comment.commentRead(findIndex);
				continue;
			case 8:
				System.out.println("댓글 삭제를 할 게시글 번호를 눌러주세요.");
				findIndex = keyboard.nextInt();
				board.contentRead(findIndex);
				System.out.println("삭제 할 댓글 번호를 눌러주세요.");
				findIndex2 = keyboard.nextInt();
				comment.commentRead(findIndex2);
				comment.commentDelete(findIndex,findIndex2);
				continue;
			default:
				System.out.println("잘못된 기능입니다. 다시 입력해주세요.");
				continue;
			}
		}

	}
}
