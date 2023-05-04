package project1;

public class list {
    public static void main(String[] args) {

        int[] arr = {7,1,2,7,3,3,3,4,2,1,1,5,5,6};
        String res = "";
        for (int i = 0; i < arr.length; i++) {
        int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) temp++;
            }
            if (!res.contains(arr[i] + " - "))
            res += arr[i] + " - " + temp + "\n";
        }
        System.out.println(res);
    }
}
