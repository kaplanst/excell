package project1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class justTest {
    public static void main(String[] args) throws IOException {
        String shrt = "";
        String str = ("Early bird catches more food");
        for (int i = 0; i < str.length(); i++) {
            if (!shrt.contains("" + str.charAt(i))) {
                shrt += str.charAt(i);
            } else continue;
        }
        System.out.println(shrt);
        char chr;
        for (int i = 0; i < shrt.length() - 1; i++) {
            for (int j = i+1; j < shrt.length(); j++) {
                if (shrt.charAt(i) > shrt.charAt(j)) {
                    chr = shrt.charAt(i);
                    shrt = shrt.substring(0, i) + shrt.charAt(j) + shrt.substring(i+1);
                    shrt = shrt.substring(0, j) + chr + shrt.substring(j+1);
                }
            }

        }
        System.out.println(shrt);
    }
}