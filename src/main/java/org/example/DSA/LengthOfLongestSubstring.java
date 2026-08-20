package org.example.DSA;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }
    public static int longestSubString(String str){
        int maxLength=0;
        int left=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, (right-left)+1);
        }
        return maxLength;
    }
}
