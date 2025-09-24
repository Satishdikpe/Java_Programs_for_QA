public class MinNumInArray
{
    public static void minimumNum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void secondminnum(int[] arr){
        int min = arr[0];
        int secmin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                 secmin =  min;
                min= arr[i];
            } else if (arr[i]<secmin && arr[i]!= min) {
               secmin = arr[i];
            }
        }
        System.out.println(secmin);
    }
    public static void main(String[] args) {
        int[] arr1 = {23,456,786,89,12,8};
        minimumNum(arr1);
        secondminnum(arr1);
    }
}
