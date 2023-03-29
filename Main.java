import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Fibonacci sequence
        System.out.println("Printing the first 10 numbers in the fibonacci sequence:");
        System.out.print(FibonacciSequence.getValueByIndex(0));
        for(int i = 1; i < 10; i++){
            System.out.print(", " + FibonacciSequence.getValueByIndex(i));
        }
        System.out.println("\n");
        // Factorial
        System.out.println("Print all the factorial results from 0 to 5:");
        System.out.print("0!=" + Factorial.result(0));
        for(int i = 1; i <= 5; i++) {
            System.out.print(", " + i + "!=" + Factorial.result(i));
        }
        System.out.println("\n");
        // Binary Search
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        System.out.println("Get the index of the numbers zero to 20 in the array below:");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print(BinarySearch.indexOf(array, 0));
        for (int i = 1; i<=20; i++){
            System.out.print(", " + BinarySearch.indexOf(array, i));
        }
        System.out.println("\n");
        
    }
}
