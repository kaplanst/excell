package project1;

public class RectangleSquares {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {
                System.out.println("X = " + i + ", Y = " + j + ",  result: " + findSquares(i, j)) ;
            }
            
        }
        //System.out.println(findSquares(3,1));
}
    public static int findSquares1(int x, int y){
        int res = 0;
            while (x > 0 && y >0) {
                res+=x*y;
                x--; y--;
            }
        return res;
    }
    public static int findSquares(int x, int y){
        int res = 0;
        for (int sqs = 1; sqs <= y; sqs++) {
            for (int i = sqs; i <= y; i++) {
                for (int j = sqs; j <= x; j++) {
                    ++res;
                }
            }
        }
        return res;
    }
}
