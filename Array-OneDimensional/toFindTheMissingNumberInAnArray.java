public class toFindTheMissingNumberInAnArray {
    public static void MissingNumber(int[] arr){
        int n = arr.length;
        int sum = n * (n + 1)/2;
        for (int i : arr){
            sum = sum - i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] num = {3,0,1};
        MissingNumber(num);
    }
}
