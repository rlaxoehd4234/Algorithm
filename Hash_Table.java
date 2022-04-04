package solo_study;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		
		ht.put(0, "철수");
		ht.put(1, "영희");
		ht.put(2, "수철");
		
		ht.remove(2);
		
		
		System.out.println("크기: " + ht.size());
		System.out.println("key 확인: " + ht.containsKey(1));
		System.out.println("value 확인: " + ht.containsValue("영희"));
		System.out.println("empty 상태 확인: " + ht.isEmpty());
		System.out.println("전체 키 확인: " + ht.keySet());
		
		

	}

}
