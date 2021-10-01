package project1;

public class NOKtheBest {
    public static void main(String[] args) {

        System.out.println(Nok(new int[]{2, 19, 4, 31, 13, 33, 8, 101}));
    }
public static int Nok(int[] raz){

        for (int i = raz[raz.length - 1]; i < Integer.MAX_VALUE; i = i + raz[raz.length - 1]) {
            int t = 0;
            for (int j = 0; j<raz.length; j++) {
                if (i % raz[j] == 0) t++;
                else {
                    break;
                }
            }
            if (t == raz.length) return i;
        }
            return 1;
    }
}