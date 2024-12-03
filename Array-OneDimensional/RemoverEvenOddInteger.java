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
         for (int j : arr) {
             if (j % 2 != 0) {
                 newArray[idx] = j;
                 idx++;
             }
         }
         printArray(newArray);
     }
     public static void RemoveOdd(int[] arr){
         int evenCount = 0;
         for (int a : arr){
             if (a % 2 == 0){
                 evenCount++;
             }
         }
         int[] newArray = new int[evenCount];
         int idx = 0;
         for(int a : arr){
             if (a % 2 == 0){
                 newArray[idx] = a;
                 idx++;
             }
         }
         printArray(newArray);
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,3};
        RemoveEven(arr); // 1 3 5 7 9 3
        RemoveOdd(arr); // 2 4 6 8
    }
}
