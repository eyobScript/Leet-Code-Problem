public class toFindMinimumValue {
    public static void printer(int print){
        System.out.println(print);
    }
    public static void findMinimum(int[] arr){
        int value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (value > arr[i]){
                value = arr[i];
            }
        }
        printer(value);
    }

    public static void main(String[] args) {
        int[] arr = {0,7,6,5,1,4,8,9,2};
        findMinimum(arr);
    }
}
