public class toFindMaximum {
    public static void printer(int print){
        System.out.println(print);
    }
    public static void findMaximum(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        printer(max);
    }

    public static void main(String[] args) {
        int[] arr = {99,7,6,5,1,4,8,9,2,12,45,98};
        findMaximum(arr);
    }
}
