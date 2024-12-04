public class moveZeroesToEndOfAnArray {
    public static void printer(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void moveZeroesToEnd(int[] arr){
            int i = 0;
            for (int j = 0; j < arr.length; j++) {
              if ( arr[j] != 0 && arr[i] == 0 ){
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
              if (arr[i] != 0){
                  i++;
              }
            }
            printer(arr);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12,9,0,2};
        moveZeroesToEnd(arr);
    }
}
