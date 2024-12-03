public class toFindMinimumValue {
    public static void printer(int print){
        System.out.println(print);
    }
    public static void findMinimum(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        printer(min);
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,1,4,8,9,2};
        findMinimum(arr);
    }
}
