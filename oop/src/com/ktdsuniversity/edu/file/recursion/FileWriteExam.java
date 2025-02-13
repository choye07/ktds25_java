package com.ktdsuniversity.edu.file.recursion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

public class FileWriteExam {

	public static void fileWriteUseNewIO(String directoryPath, String fileName, List<String> data) {
		//1. 새로 작성할 파일 인스턴스 만들기
		File writeFile = new File(directoryPath, fileName);
		//2. 파일을 만들 위치가 존재하는지 확인하기
		if (!writeFile.getParentFile().exists()) {
			//3. 없다면 폴더 새롭게 만들기
			//C:\\Users\\211-17\\Desktop\\FileIOExam\\Store =>  dsjfhsdkjf이 폴더가 없을 때 
			//C:\\Users\\211-17\\Desktop\\FileIOExam\\dsjfhasdkjf만 만든다.
//			writeFile.getParentFile().mkdir();
			
			//C:\\Users\\211-17\\Desktop\\FileIOExam\\Store =>  dsjfhsdkjf이 폴더가 없을 때 
			//C:\\Users\\211-17\\Desktop\\FileIOExam\\ 생성 후 Store 폴더 생성 dsjfhasdkjf만 만든다.
			writeFile.getParentFile().mkdirs();
			//4. 같은 이름의 파일이 이미 존재하는지 확인하기
		}
		int index =2;
		while(writeFile.exists()) {
			//5. 다른 이름의 파일이 나올 때까지 파일 명에 순번 붙이기
			// storeProduct.txt=> storeProduct
			String newFileName = fileName.substring(0,fileName.lastIndexOf("."));
			newFileName += "("+(index++) +").";
			//storeProduct(2).txt
			newFileName += fileName.substring(fileName.lastIndexOf(".")+1);
			writeFile = new File(directoryPath,newFileName);
		}
		
		//6. 파일쓰기
		try {
			Files.write(writeFile.toPath(),data);
			// 쓴 파일의 위치를 출력한다.
			System.out.println(writeFile.getAbsolutePath());
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add( new Product("스마트폰1", 200000, 100).toFileFormat() );
		data.add( new Product("스마트폰2", 200000, 100).toFileFormat() );
		data.add( new Product("스마트폰3", 200000, 100).toFileFormat() );
		data.add( new Product("스마트폰4", 200000, 100).toFileFormat() );
		data.add( new Product("스마트폰5", 200000, 100).toFileFormat() );
		data.add( new Product("스마트폰6", 200000, 100).toFileFormat() );

		fileWriteUseNewIO("C:\\Users\\211-17\\Desktop\\FileIOExam\\Store", "storeProduct.txt", data);
	}
}
