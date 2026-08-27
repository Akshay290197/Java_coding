package org.example.InterviewCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";
        duplicateChar(str);
    }
    public static void duplicateChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
