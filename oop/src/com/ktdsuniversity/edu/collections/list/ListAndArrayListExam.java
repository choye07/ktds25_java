package com.ktdsuniversity.edu.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayListExam {
	public static void main(String[]args) {

		System.out.println("List에 데이터 추가=================================");
		
		List<Integer> scoreList = new ArrayList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println("List 데이터 조회=================================");
		
		int score = scoreList.get(0);
		System.out.println(score);
		
		score = scoreList.get(1);
		System.out.println(score);
		
		score = scoreList.get(2);
		System.out.println(score);
		
		score = scoreList.get(3);
		System.out.println(score);
		
		score = scoreList.get(4);
		System.out.println(score);
		
		System.out.println("List 반복 데이터 조회=================================");
		
		for(int i = 0; i <scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);
		}
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		scoreList.remove(3);
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println("List 데이터 모두 삭제=================================");
		
		System.out.println(scoreList.isEmpty());
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		scoreList.clear();
		
		System.out.println(scoreList.isEmpty());
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println("List 비어있는지 확인=================================");
		
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(95);
		scoreList.add(85);
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		if(! scoreList.contains(90)) {
			scoreList.add(90);
		}
		
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println("값이 있는지 =================================");
		
		List<Integer> scoreList2 = new ArrayList<>();
		scoreList2.addAll(scoreList);
		
		
		System.out.println(System.identityHashCode(scoreList));
		System.out.println(scoreList);
		System.out.println(scoreList.size());
		
		System.out.println(System.identityHashCode(scoreList2));
		System.out.println(scoreList2);
		System.out.println(scoreList2);
		
		System.out.println(" 메모리 주소=================================");
		
		List<Integer> readOnlyList = List.of(1,2,3,4,5);
		System.out.println(readOnlyList);
		System.out.println(readOnlyList.size());
		
		
		int [] array = new int[10];
		
		// for
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		// for
		for(int i = 0; i <scoreList.size(); i++) {
			score = scoreList.get(i);
			System.out.println(score);
		}
		
		//for -each => 훨씬 간단하고, 훨씬 빠르다.
//		int [] array = new int[10];
		for(int number : array) {
			System.out.println("array for each"+number);
			
			
		// for를 쓸 때와 for - each를 쓸 때의 구분 케이스
		// 반복 중에 인덱스 값을 사용해야 한다면 반드시 for 사용
		//         -> [7, 45, 31, 23, 6, 7]이 배열에서 31번은 몇 번 인덱스이 있나?
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " 은" + i + " 인덱스에 있습니다.");
			}
		}
//		List<Integer> scoreList = new ArrayList<>();
		//for - each
		for(int eachScore :scoreList ) {
			System.out.println(eachScore);
		}
		
		//배열 반복 방법: for, for-each
		//리스트 반복 방법: for, for-each
		//for-each를 사용할 수 있는 조건!
		//반복시키려는 클래스가 Iterctor, Iterable 인터페이스를 구현시켰을 때만 사용가능.
		
		//List.of() => ImmutableCollections.listFromTrustedArray
		//ImmutableCollections는 add 지원 안함.
		//public boolean add(E e) {throw uoe();}
//		readOnlyList.add(10);// UnsupportedOperationException.
		
		
	}
}
