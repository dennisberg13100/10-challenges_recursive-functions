import java.util.Arrays;

/*
 * Binary Search
 * 
 * Binary search is a search algorithm that finds the 
 * position of a target value within a sorted array by 
 * repeatedly dividing the search interval in half.
 */

public class BinarySearch {
    public static int indexOf(int[] array, int value){
        if(array.length == 1 && array[0] != value) {
            return -1;
        }
        int index = array.length/2;
        if(array[index] == value) {
            return index;
        } else if (array[index] > value){
            int[] newArray = Arrays.copyOfRange(array, 0, index);
            return indexOf(newArray, value);
        } else {
            int[] newArray = Arrays.copyOfRange(array, index, array.length);
            return indexOf(newArray, value, index);
        }
    }

    public static int indexOf(int[] array, int value, int returnIndex){
        if(array.length == 1 && array[0] != value) {
            return -1;
        }
        int index = array.length/2;
        if(array[index] == value) {
            return returnIndex + index; 
        } else if (array[index] > value){
            int[] newArray = Arrays.copyOfRange(array, 0, index);
            return indexOf(newArray, value, returnIndex);
        } else {
            int[] newArray = Arrays.copyOfRange(array, index, array.length);
            return indexOf(newArray, value, returnIndex + index);
        }
    }
}
