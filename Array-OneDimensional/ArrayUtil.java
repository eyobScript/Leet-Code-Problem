public class ArrayUtil {

    public void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 5;
        myArray[2] = 4;
        myArray[3] = 3;
        myArray[4] = 0;

        printArray(myArray);
        System.out.println("The length of myArray is "  + myArray.length);
        System.out.println("This is the last value in the array " +myArray[myArray.length - 1]);

//        simplest way to initialize array

        int[] arr={2,3,4,5,6,7};
        printArray(arr);

    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}
