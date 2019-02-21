package com.lambda2;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ConverkeyValues {
public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Sai", 1);
		map.put("srikanth", 2);
		map.put("nag", 3);
		map.put("haneef", 4);
		
		/*StringBuilder builder = new StringBuilder();
		map.forEach((key, value) -> builder.append(key + value));
		System.out.println(builder.toString());
		*/
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}


}
