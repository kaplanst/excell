package project1;

public class UniqueNumber {

    public static void main(String[] args) {

        double[] arry = new double[]{1, 1, 1, 2, 1, 1};
        System.out.println(findUniq(arry));
    }

    public static double findUniq(double arr[]) {

        if (arr[0] == arr[1]) {
            for (int i = 2; i < arr.length; i++) {
                if (arr[0] != arr[i]) return arr[i];
            }
        } else if (arr[0] == arr[2]) return arr[1];


        return arr[0];
    }

}
