package project1;

public class PasswordGenerator {
    public static void main(String[] args) {
        String pass;
        String newPass = "General1";
        if (!newPass.matches(".*[A-Z].*")) {
            System.out.println("Password must contain CAPITAL letters. Recommended password is: " + newPassCreator());
        } else System.out.println("Password is acceptable. Your new password is: " + newPass);


    }

    public static String newPassCreator() {
        String alf = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        String password = "";
        for (int i = 0; i < 15; i++) {
            password += alf.charAt((int)(Math.random()*alf.length()));
        }
        return password;
    }
}
