package project1;

public class Piramide {
    public static void main(String[] args) {
        String s = "";
        String p = "          ";
        for (int i = 0; i < 10; i++) {
            if (i == 9) s = "__________________";
            System.out.println(p + "/" + s +"\\\\\\");
            s = s + "  ";
            p = p.substring(1);
        }

    }
}
