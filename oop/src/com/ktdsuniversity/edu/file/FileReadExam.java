package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

/**
 * 바탕화면 > FileIOExam > readSample.txt Lorem lipsum
 * 
 */
public class FileReadExam {

	public static void loadProducts() {
		File targetFile = new File("C:\\Users\\211-17\\Desktop\\FileIOExam", "products.txt");
		List<Product> productList = new ArrayList<>();
		try {
			List<String> fileLines = Files.readAllLines(targetFile.toPath()); // Autocloseable Pipe 자동적으로 닫는다.
			for (String line : fileLines) {
				System.out.println(line);
				productList.add( new Product (line.split(",") ) );
			}
		} catch (IOException ioe) {
			System.out.println("파일을 불러오는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
		for(Product eachProduct : productList ) {
			System.out.println(eachProduct);
		}
	}

	public static void fileReadUseNewIO(String directoryPath, String filename) {
		File targetFile = new File(directoryPath, filename);
		try {

			List<String> fileLines = Files.readAllLines(targetFile.toPath()); // Autocloseable Pipe 자동적으로 닫는다.
			for (String line : fileLines) {
				System.out.println(line);
			}
		} catch (IOException ioe) {
			System.out.println("파일을 불러오는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}

	}

	public static void fileReadUseOldIO(String directoryPath, String filename) {
		// 읽어오려는 파일의 객체를 만든다.(targetFile)
		File targetFile = new File(directoryPath, filename);
		if (!targetFile.exists() || !targetFile.isFile()) {
			return;
		}
		FileReader fileReader = null;
		// 파일을 읽기 위한 FileReader 객체를 만든다 (fileReader)
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(targetFile);
			// Note. 파일의 내용을 바이트 단위로 읽는다.
			// 영어, 숫자, 특수문자: 1 byte "abc"
			// 그 외 나머지 외국어들: 3 byte "한글"
			// "한글"에서 1 바이트를 읽었다 ?ㅁ
			// 파일을 한 줄 씩 읽기 위한 BufferedReader 객체를 만든다(bufferedReader)
			bufferedReader = new BufferedReader(fileReader);
			// 내부에서 FileReader를 이용해서 한줄 자체를 통째로 읽음.
			// 캐리지리턴(\n)이 나올때까지 바이트를 계속 읽는다.
			// bufferedReader를 통해서 EOF 까지 한줄 씩 읽는다.
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			// 한 줄씩 출력한다.

		}
//		catch (FileNotFoundException | IOException ) { // 같은 부모라서 하나만 써줘도 됨.
		catch (FileNotFoundException fnfe) {
			System.out.println(targetFile.getName() + " 파일이 존재하지 않습니다.");
			return;
		} catch (IOException ioe) {
			System.out.println("파일을 읽는 중에 오류가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
			return;
		} finally {
			// 오류가 나도, 나지 않아도 finally는 실행이 된다.
			// 파이프를 닫는다 (오픈의 역순)
			// bufferedReader를 닫는다.
			if (bufferedReader != null) {
				try {

					bufferedReader.close();
				} catch (IOException ioe) {
					// NullPointerException
				}
			}
			// FileReader를 닫는다.
			if (fileReader != null) {
				try {

					fileReader.close();
				} catch (IOException ioe) {

				}
			}

		}
	}

	public static void main(String[] args) {
//		fileReadUseNewIO("dsfsdfsdf", "dfjdflsd");
//		fileReadUseOldIO("C:\\Users\\211-17\\Desktop\\FileIOExam", "readSample.txt");
//		fileReadUseNewIO("C:\\Users\\211-17\\Desktop\\FileIOExam", "readSample.txt");
		loadProducts();
	}

}
