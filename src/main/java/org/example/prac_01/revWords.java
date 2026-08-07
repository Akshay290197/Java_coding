package org.example.prac_01;

public class revWords {
    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String str){
        String[] word = str.split(" ");
        for(int i = word.length-1;i>=0;i--){
            System.out.print(word[i]+" ");
        }
        return "";
    }
}
