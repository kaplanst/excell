package project1;

import java.util.Arrays;

public class justTest {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution("asdfghj3")));
    }

    public static String[] solution(String s) {
        if (s.length()%2 != 0) s+="_";
        String[] str = new String[s.length()/2];
        for (int i = 0; i < str.length; i++) {
            str[i] = s.substring(2*i, 2*i+2);
        }
        return str;
    }
}