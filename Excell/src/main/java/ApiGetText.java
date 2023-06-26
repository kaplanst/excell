import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiGetText {
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
        System.out.println(content);
    }
}