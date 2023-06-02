package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ApiGetText {
    public static void main(String[] args) throws IOException {
        String country = "Iraq";
        String output  = getUrlContents("https://jsonmock.hackerrank.com/api/countries?name=" + country);
        String capital = output.substring(output.lastIndexOf("capital\":\"") + 10);
        capital = capital.substring(0, capital.indexOf('"'));
        System.out.println(capital);
    }

    private static String getUrlContents(String theUrl) throws IOException {
        URL url = new URL(theUrl);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        String content = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                content = line;
            }
        }
        return content;
    }
}