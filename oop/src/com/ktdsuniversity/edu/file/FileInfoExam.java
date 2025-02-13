package com.ktdsuniversity.edu.file;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileInfoExam {
	public static void printFileInfo(String directoryPath, String filename) {
		File file = null;
		if (filename == null) {
			file = new File(directoryPath);
		} else {
			file = new File(directoryPath, filename);
		}

		// 파일이 존재하냐?
		boolean exists = file.exists();
		System.out.println("exists: " + exists);

		// 파일이냐?
		boolean isFile = file.isFile();
		System.out.println("isfile: " + isFile);

		boolean isFolder = file.isDirectory();
		System.out.println("isfile: " + isFolder);

		// 전체 경로
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath: " + absolutePath);

		// 파일 이름 -> 파일이 없어도 이름이 나온다.
		String name = file.getName();
		System.out.println("name: " + name);

		// 파일 크기는 얼마냐?
		/**
		 * 파일의 크기는 long으로 받아온다. 이유는? 1 byte = 8bit; 1000byte = 1KiB 1000KiB = 1MiB
		 * 1000MiB = 1GiB 1000GiB = 1TiB 1000TiB = 1PiB
		 */
		long length = file.length();
		System.out.println(filename + " length: " + length + "byte");

		// 파일이 언제 만들어졌냐? => 지금은 모른다.
		// 날짜와 시간을 long으로 주는 이유
		// 컴퓨터가 날짜와 시간을 처리하는 방법
		// 기준으로 부터 몇 밀리초가 지났는지 계산.
		// 이때 밀리초는 (1초/1000)
		// 기준 1970-01-01 00:00:00.000 (실행할 때 기준)
		long lastModified = file.lastModified();
		System.out.println("lastModified: " + lastModified);
		Date lastModifiedDate = new Date(lastModified);
		System.out.println(filename + "lastModified: " + lastModifiedDate);

		// 이 파일의 부모 폴더는 누구인가?
		// 이 파일이 어디에 있냐?

		String parentDirectody = file.getParent();
		System.out.println(filename + "parentDirectory: " + parentDirectody);

		// file 객체가 폴더였을 때, 폴더 내부에 있는 항목은 뭐냐?
		File[] listfile = file.listFiles();
		;
		System.out.println(filename + " listFiles: " + Arrays.toString(listfile));
		System.out.println("=".repeat(40));
	}

	/**
	 * 탐색을 시작하고 싶은 폴더를 주면 하위에 존재하는 모오오오든 폴더와 피일들의 목록을 풀력한다.
	 * 
	 * @param startDirectoryPath
	 */
	public static void traversingAndPrintFileInfo(String startDirectoryPath) {
		// 끝나는 조건을 명시하지 않아도 자동적으로 Pop이 된다.
		// startDirectoryPath경로의 File 인스턴스(file)를 생성
		File file = new File(startDirectoryPath);
		// 파일이 존재한다면
		if (file.exists()) {
			System.out.println(file.getAbsolutePath() + "(" + file.length() + ")");
			// file이 폴더 파일 상관 없이 출력
			 if(file.isDirectory()) {
				// file의 자식 요소(폴더+파일)들을 얻어온다.
				File[] listFiles = file.listFiles();
				// file의 자식 요소(폴더+파일)을 반복한다.
				for(File child: listFiles) {					
					 traversingAndPrintFileInfo(child.getAbsolutePath());
				}
			}

		}else {
			System.out.println("해당 파일/폴더와 일치하는 것이 없습니다.");
		}

	}

	public static void main(String[] args) {
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam", "company.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam", "example.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam", "sample.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam\\subfolder1", "sub_company.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam\\subfolder1", "sub_example.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam\\subfolder1", "sub_sample.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam\\subfolder1\\subfolder1-1", "sub1-1_sample.txt");
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam\\subfolder2", "sample.txt");
//
//		printFileInfo("C:\\Users\\211-17\\Desktop\\fileexam", null);
		
		traversingAndPrintFileInfo("C:\\Users\\211-17\\Desktop\\fileexam");

	}
}
