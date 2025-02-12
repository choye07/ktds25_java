package com.ktdsuniversity.edu.generic;

import java.util.Iterator;

/**
 * 배열을 효율적으로 쓰는 방법에 대한 설명. 학생 한명의 성적을 구하는 클래스
 */
public class ScoreArray<T> implements Iterable {
	/**
	 * 학생 이름
	 */
	private String name;
	
	/**
	 * 과목별 성적
	 */
	private Object[] scoreArray;

	/**
	 * 등록된 성적의 개수
	 */
	private int size;
	
	private T sum;

	public ScoreArray(String name) {
		this.name = name;
//		this.sum = sum.getClass(); //nullpointerException  발생.
		this.scoreArray = new Object [4]; // [0, 0, 0, 0]
	}
	
	public Object[] getScoreArray() {
		return this.scoreArray;
	}
	
	public int getSize() {
		return this.size;
	}

	/**
	 * 성적 배열에 성적을 추가한다.
	 * 
	 * @param score
	 */
	public void add(T score) {
		if (this.size >= this.scoreArray.length) {
			Object [] tempScoreArray = new Object[this.scoreArray.length + 4];
			// tempScoreArray에 this.scoreArray의 값을 일일이 할당한다.
//			for(int i = 0; i<this.size; i++) {
//				tempScoreArray[i] = this.scoreArray[i];
//			}
			System.arraycopy(this.scoreArray, 0, tempScoreArray, 0, (int) this.size);

			// this.scoreArray = [100, 80, 70, 90]
			// tempScoreArray = [100, 80, 70, 90, 0, 0, 0, 0]

			this.scoreArray = tempScoreArray; // 메모리 교체
		}
		this.scoreArray[size++] = score;
//		this.sum += score;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	// 무슨 타입인지 모르기 때문에
//	public T sum() {
//		this.sum = 0;
//		for (int i = 0; i < this.size; i++) {
//			this.sum += this.scoreArray[i];
//		}
//		return this.sum;
//	}

	// 메소드 자체에는 문젝가 없지만 바디에서 문제가 발생한다.
//	public double avg() {
//		T sum = this.sum > 0 ? this.sum : this.sum();
//		return sum / (double) (this.size);
//	}

	// 점수 등록(add)
	// 합계 구하기 (sum)
	// 평균 구하기 (average)
	// 점수 등록(add) => 점수 배열 변화가 생김.
	// 합계 구하기 (sum) => 올바른 합계가 나옴.
	// 평균 구하기 (average) => 올바른 평균이 나옴.
	// 점수 등록(add) => 점수 배열의 변화가 생김.
	// 평균 구하기 (average) => 올바른 평균이 나옴.
}
