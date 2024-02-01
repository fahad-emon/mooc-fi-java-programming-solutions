
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] numbers  = {3, 1, 5, 99, 3, 12};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Index of the smallest number: " 
        //         + MainProgram.indexOfSmallest(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallestNum = array[0];
        int i = 1;
        int length = array.length;
        while (i < length) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
            }
            i++;
        }
        return smallestNum;
    }

    public static int indexOfSmallest(int[] array){
        int smallestNum = array[0];
        int smallestIdx = 0;
        int i = 1;
        int length = array.length;
        while (i < length) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                smallestIdx = i;
            }
            i++;
        }
        return smallestIdx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNum = table[startIndex];
        int smallestIdx = startIndex;
        int i = startIndex;
        int length = table.length;
        while (i < length) {
            if (table[i] < smallestNum) {
                smallestNum = table[i];
                smallestIdx = i;
            }
            i++;
        }
        return smallestIdx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Selection sort
    public static void sort(int[] array) {
        int i = 0;
        int length = array.length;
        while (i < length - 1) {
            if (array[i] > array[indexOfSmallestFrom(array,i+1)]) {
                swap(array, i, indexOfSmallestFrom(array,i+1));
            }
            i++;
        }
    }
}
