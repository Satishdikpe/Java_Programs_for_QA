import java.util.Arrays;

public class ReverseWithoutThirdVer {
    public static void main(String[] args) {
        int[] arr1 = {23,456,786,89,12,8};
        int start = 0;
        int end = arr1.length-1;
        while(start<end) {
            arr1[start] = arr1[start] + arr1[end];
            arr1[end] = arr1[start] - arr1[end];
            arr1[start] = arr1[start]- arr1[end];
            start++;
            end--;
        }
        for(int num :arr1){
            System.out.print(num+" ");
        }
    }
}
