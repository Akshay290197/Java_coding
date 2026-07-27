package org.example.prac_01;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "programming";
        Character ch = firstRepeatingCharacter(str);
        System.out.println(ch);
    }
    public static Character firstRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))>1){
                return str.charAt(i);
            }
        }
        return null;
    }
}
