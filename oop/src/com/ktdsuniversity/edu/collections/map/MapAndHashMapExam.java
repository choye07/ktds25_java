package com.ktdsuniversity.edu.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapAndHashMapExam {
	public static void main(String[] args) {
		System.out.println("=======Map에 데이터 추가=========");
		Map<String, Integer> priceMap = new HashMap<>();
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.put("LG Gram", 1_800_000);
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("=======Map 데이터 조회=========");

		int applePrice = priceMap.get("Apple Macbook Pro");
		System.out.println(applePrice);
		
//		applePrice = priceMap.get("apple macbook pro");
//		System.out.println(applePrice);

		System.out.println("=======Map 데이터 삭제=========");

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.remove("Apple Macbook Pri");

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("=======Map 데이터 모두 삭제=========");

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.clear();

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("=======Map이 비어있는지 확인=========");
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		boolean isEmpty = priceMap.isEmpty();
		System.out.println(isEmpty);
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		priceMap.clear();

		isEmpty = priceMap.isEmpty();
		System.out.println(isEmpty);
		System.out.println(priceMap);
		System.out.println(priceMap.size());

		System.out.println("=======Map에 동일한 key가 있는지 확인=========");

		System.out.println(priceMap);
		System.out.println(priceMap.size());

		if (!priceMap.containsKey("LG Gram")) {
			priceMap.put("LG Gram", 1_600_000);
		}
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		
		System.out.println("=======Map에 동일한 Value가 있는지 확인=========");
		
		if (priceMap.containsValue(1_700_000)) {
			priceMap.put("LG Gram",1_600_000);
		}
		
		System.out.println(priceMap);
		System.out.println(priceMap.size());
		
		
		// Map 복사 안넣음.
		
		//Map에는 index가 없기 때문에 for-each만 사용해야한다.
		
		
		/**
		 * Map loop
		 * Key/Value Pair를 Entry로 관리 (중복 제거된 상태) Map은 중복 key를 만들 수 없다.
		 * Set<Map,Entry<K,V>> entrySet(); -> 각 key/value Pair를 모두 가져온다.
		 * interface Entry<K,V> {
		 * 		K get Key();
		 * 		V get Value();
		 * 		....
		 * 
		 * }
		 */
		//Entry = java.util.Map.Entry -> 키, 벨류를 묶은 하나
		//priceMap.entrySet() => Set<Map.Entry<String,Integer>>
		for(Entry<String, Integer> eachEntry: priceMap.entrySet()) {
			System.out.println("=".repeat(30));
			System.out.println(eachEntry);
			System.out.println("Key: "+ eachEntry.getKey());
			System.out.println("Value: "+ eachEntry.getValue());
		}
		
		//or
		
		priceMap.forEach((key,value) -> {
			System.out.println("=".repeat(30));
			System.out.println("lamda Key" +key);
			System.out.println("lamda Value" +value);
			
		});
	}
}
