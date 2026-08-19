package org.example.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(validAnagram(str1, str2));
    }

    public static boolean validAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
