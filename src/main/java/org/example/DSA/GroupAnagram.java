package org.example.DSA;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] data = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i< data.length;i++){
            char[] ch = data[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(data[i]);
        }
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
