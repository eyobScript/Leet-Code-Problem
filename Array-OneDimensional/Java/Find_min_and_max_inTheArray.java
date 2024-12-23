package Java;

public class Find_min_and_max_inTheArray {
    public static void print(int min, int max) {
        System.out.println("The minimum number is " + min + " and the maximum number is " + max);
    }
    public static void finder(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            } else if (min > arr[i]){
                min = arr[i];
            }
        }
        print(min, max);
    }
    public static void main(String[] args) {
      int[] arr = { 26, 33, 45, 55, 66, 78, 8, 106, 10, 11, 46, 163, 114, 15 };
      finder(arr);
    }
}
