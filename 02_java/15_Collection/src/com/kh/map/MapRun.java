package com.kh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

	/*
	 * Map<K,V> 특징 key-value 형식으로 데이터를 관리 * key에 해당하는 데이터 : 중복을 허용하지 않음(Set 방식) *
	 * value에 해당하는 데이터 : key값이 중복되지 않은 경우, 중복이 허용 됨(List 방식)
	 * 
	 * - 메소드 데이터 추가 : put(key값, value값) 데이터 삭제 : remove(key값) 데이터 조회 : get(key값) 키
	 * 목록 조회 : keySet():Set 저장된 데이터 길이 : size()
	 * 
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(1000, "HTML");
		hMap.put(1001, "CSS");
		hMap.put(1002, "JS");
		hMap.put(1003, "JAVA");

		// 키 목록 조회 keyList
		Set<Integer> keyList = hMap.keySet();

		// 키 값들을 출력
		System.out.println("----- key list -----");
		for (Integer key : keyList) {
			System.out.println(key);
		}
		System.out.println("--------------------");

		// 키를 이용하여 데이터(value) 출력
		for (Integer key : keyList) {
			System.out.println(key + " : " + hMap.get(key));
		}
		System.out.println("--------------------");

		// JS데이터 제거
		hMap.remove(1002); // 해당 키 값으로 데이터 제거

		// Iterator
		Iterator<Integer> it = keyList.iterator();
		while (it.hasNext()) {
			int k = it.next();// 키 값
			System.out.println(k + " : " + hMap.get(k));
		}
	
		// ebtrySet() : key-value 세트의 집합
		Set entrySet = hMap.entrySet();
		// => Set<Entry<Integer, String>>>
		
		Iterator entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Entry entry = (Entry)entryIt.next();
			// => Entry<Integer, Striing>
			
			Integer key = (Integer)entry.getKey(); // key값 조회
			String value = (String)entry.getValue();	// value 값 조회
			
			System.out.println(key + ":::" + value);
		}
	}

}
