package org.example.InterviewCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
