public class decriceFractions {

    public static void main(String[] args) { //Сокращение дробей
        System.out.println(convertFrac(new int[][]{{69, 132}, {88, 1312}, {30, 40}}));
    }

    public static String convertFrac(int[][] lst) {
        String result = "";
        for (int k = 0; k < lst.length; k++) {
            int tempDiv = 1;

            for (int f = lst[k][0]; f >= 2; f--) {
                if (lst[k][0] == 1) continue;
                if(lst[k][0]%f == 0 && lst[k][1]%f == 0){
                    tempDiv = f; break;
                }
            }

            result = result + "(" + lst[k][0]/tempDiv + ", " + lst[k][1]/tempDiv + ")";
        }
        return result;
    }
}