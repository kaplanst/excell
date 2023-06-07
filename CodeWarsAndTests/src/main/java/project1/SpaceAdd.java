package project1;

public class SpaceAdd {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $0");
    }

}
