public class toFindSecondMaximum {
    public static void printer(int print){
        System.out.println(print);
    }
    static void findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(max != arr[i] && secondMax < arr[i]){
                secondMax = arr[i];
            }
        }
        printer(secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {13,34,2,34,33,1};
        findSecondMax(arr);

    }
}
