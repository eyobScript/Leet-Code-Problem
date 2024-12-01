public class RemoverEvenOddInteger {
     public static void printArray(int[] arry){
         for (int a : arry){
             System.out.print(a + " ");
         }
         System.out.println();
     }
     public static void RemoveEven(int[] arr){
         int oddCounter = 0;
         for (int a : arr){

             if (a % 2 != 0){
                 oddCounter ++;
             }
         }
         int[] newArray = new int[oddCounter];
         int idx = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] % 2 != 0){
                 newArray[idx] = arr[i];
                 idx++;
             }
         }
         printArray(newArray);
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,3};
        RemoveEven(arr);
    }
}
