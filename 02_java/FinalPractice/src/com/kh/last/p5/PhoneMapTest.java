package com.kh.last.p5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		Map<String, Phone> map = new HashMap<>();
		
		map.put("galaxy S7", new Phone("galaxy S7", 563500, "삼성" , 7));
		map.put("iphone 6s", new Phone("iphone 6s", 840000, "애플", 3));
		map.put("G5", new Phone("G5", 563500, "LG", 5));
		
		// 맵에 저장된 객체 정보를 연속 출력 한다.– Map.Entry<String, Phone> 사용할 것
		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		Set<Entry<String, Phone>> entrySet = map.entrySet();
		
		Iterator<Entry<String,Phone>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Phone> entry = it.next();
			
			String key = entry.getKey();
			Phone phone = entry.getValue();
			
			System.out.println(key + " : " + phone);
		}
		
		// TODO 맵에 저장된 객체 정보를 Properties 를 사용해 “phone.xml” 파일에 기록 저장한다.
		Properties prop = new Properties();
		
		// 맵에서 키 목록 조회 => keySet():Set<K>
		for(String key : map.keySet()) {
			prop.setProperty(key, map.get(key).toString());
			// Map의 데이터를 Properties로 복사함
		}
		
		try {
			prop.storeToXML(new FileOutputStream("phone.xml"), "Phone 정보");
			// store => 파일(외부매체)에 출력
			// load => 파일(외부매체)로부터 입력
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
