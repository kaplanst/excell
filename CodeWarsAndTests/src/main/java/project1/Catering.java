package project1;

public class Catering {
    public static void main(String[] args) {
        System.out.println(find_caterer(1500, 61));
    }
    public static int find_caterer(int budget, int people) {
        int third = 30;
        if ((people == 0) || (budget / people < 15)) return -1;
        if (people > 60) third = 24;
        if (budget/people >= third) return 3;
        if (budget/people >= 20) return 2;
        return 1;
    }
}

