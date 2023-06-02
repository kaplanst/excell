package project1;

import javax.imageio.stream.ImageInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//test
public class justTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name=italy");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        String content = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                content = line;
            }
        }
        String capital = content.substring(content.lastIndexOf("capital\":\"") + 10);
        capital = capital.substring(0, capital.indexOf('"'));
        System.out.println(capital);    }

}


