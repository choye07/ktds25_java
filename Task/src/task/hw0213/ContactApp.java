package task.hw0213;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import task.hw0213.exceptions.ContactNotFoundException;

public class ContactApp implements ContactAppInterface {

	private List<Contact> contacts;

	public ContactApp(String fileDirectoryPath, String filename) {
		this.contacts = new ArrayList<>();
		this.loadData(fileDirectoryPath, filename);
	}

	@Override
	public void loadData(String fileDirectoryPath, String filename) {
		// 파일을 읽어서 this.contacts 에 연락처 목록을 할당한다.
		File targetFile = new File(fileDirectoryPath,filename);
		
		try {
			List<String> fileLines = Files.readAllLines(targetFile.toPath()); // Autocloseable Pipe 를 자동으로 닫는다.
			for ( String line : fileLines ) {
				System.out.println(line);
				
				this.contacts.add(new Contact( line.split(",") ) );
			}
			
		}catch(IOException ioe) {
			System.out.println("파일을 읽어오는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + ioe.getMessage());
		}
		
		
	}

	@Override
	public void writeData(String fileDirectoryPath, String filename,List<String> data) {
		// this.contact에 있는 연락처 정보를 파일에 쓴다.
		

		// 1. 새로 작성할 파일 인스턴스 만들기
		File writeFile = new File(fileDirectoryPath, filename);
		// 2. 파일을 만들 위치가 존재하는지 확인하기
		if ( ! writeFile.getParentFile().exists() ) {
			// 3. 없다면 폴더 새롭게 만들기
			writeFile.getParentFile().mkdirs();
		}
		
		// 4. 같은 이름의 파일이 이미 존재하는지 확인하기
		int index = 2;
		while ( writeFile.exists() ) {
			// 5. 다른 이름의 파일이 나올 때까지 파일 명에 순번 붙이기

			String newFileName = filename.substring(0, filename.lastIndexOf("."));
			newFileName += " (" + (index++) + ").";
			newFileName += filename.substring( filename.lastIndexOf(".") + 1);
			
			writeFile = new File(fileDirectoryPath, newFileName);
		}
		
		// 6. 파일 쓰기
		try {
			Files.write(writeFile.toPath(), data);
			// 쓴 파일의 위치를 출력한다.
			System.out.println(writeFile.getAbsolutePath());
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	
		
		
		
	}
	
	@Override
	public void clean() {
		this.contacts.clear();
	}

	@Override
	public void addNewContact(Contact newContact) {
		this.contacts.add(newContact);
	}

	@Override
	public void remove(int contactIndex) {
		if (contactIndex >= 0 && contactIndex < this.contacts.size()) {
			this.contacts.remove(contactIndex);
		}
	}

	@Override
	public Contact getContactAt(int contactIndex) {
		if (contactIndex < this.contacts.size() && contactIndex >= this.contacts.size()) {
			throw new ContactNotFoundException(contactIndex + " 연락처가 아직 채워지지 않은 인덱스입니다.");
		}
		return this.contacts.get(contactIndex);
	}
	
	@Override
	public void sort() {
		// Selection Sort
		int minIdx = 0;
		for (int i = 0; i < this.contacts.size(); i++) {
			minIdx = i;
			for (int j = i + 1; j < this.contacts.size(); j++) {
				if (this.contacts.get(minIdx) != null && this.contacts.get(j) != null) {
					if ( this.contacts.get(minIdx).getNumber() > this.contacts.get(j).getNumber() ) {
						minIdx = j;
					}
				}
			}
			
			if (minIdx != i) {
				Contact temp = this.contacts.get(minIdx);
				if (temp != null && this.contacts.get(i) != null) {
					this.contacts.set(minIdx, this.contacts.get(i));
					this.contacts.set(i, temp);
				}
			}
		}
	}


}
