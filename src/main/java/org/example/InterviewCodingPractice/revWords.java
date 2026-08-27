package org.example.InterviewCodingPractice;

public class revWords {
    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String str){
        String[] word = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
