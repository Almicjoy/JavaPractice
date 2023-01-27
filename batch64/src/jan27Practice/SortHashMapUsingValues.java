package jan27Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapUsingValues <K, V>{
	
	public LinkedHashMap<K, V> sortHashMap(HashMap<K, V> h) {
		LinkedHashMap<K, V> sortedMap = new LinkedHashMap<>();
		List<V> l = new ArrayList<>();
		for(Map.Entry<K, V> entry: h.entrySet()) {
			l.add(entry.getValue());
		}
		List<V> sortedList = l.stream().sorted().toList();
		for(V v: sortedList) {
			for(Map.Entry<K, V> entry: h.entrySet()) {
				if(v.equals(entry.getValue())) {
					sortedMap.put(entry.getKey(), v);
				}
			}
		}
		
		return sortedMap;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apples", 2);
		map.put("carrots", 23);
		map.put("oranges", 5);
		map.put("lettuce", 12);
		
		System.out.println(map);
		
		SortHashMapUsingValues<String, Integer> v = new SortHashMapUsingValues<>();
		HashMap<String, Integer> sortedMap = v.sortHashMap(map);
		System.out.println(sortedMap);
		
	}

}
