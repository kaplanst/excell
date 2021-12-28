package project1;

public class IPaddress {

    public static void main(String[] args) {
        System.out.println(longToIP(2149583361L));
    }

    public static String longToIP(long ip) {
       String doubRes = "";
        for (int i = 1; i <= 32; i++) {
           doubRes += ip%2;
           ip = ip / 2;
           if (i % 8 == 0 && i != 32) doubRes += " ";
       }
        String reversRes = new StringBuilder(doubRes).reverse().toString();
        String[] octets = reversRes.split(" ");
        doubRes = "";
        for (int i = 0; i < 4; i++) {
        doubRes += convert(octets[i]);
        if (i != 3) doubRes += ".";
        }


        return doubRes;
    }
    public static int convert(String zeros){
        int octet = Integer.valueOf(zeros);
        int digits = 0;
        if (octet == 0) return 0;
        for (int i = 0; i < 8; i++) {
            digits += octet%10 * Math.pow(2, i);
            octet = octet / 10;
        }


        return digits;
    }
}



