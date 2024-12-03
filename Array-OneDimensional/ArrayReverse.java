public class ArrayReverse {
    public static void printer(int[] print){
        for (int a : print){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void ReverseArray(int[] arr){
          int star = 0;
          int end = arr.length - 1;
          while (star < end){
              int temp = arr[star];
             arr[star] = arr[end];
             arr[end] = temp;
             star++;
             end--;
          }
          printer(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ReverseArray(arr);
    }
}
