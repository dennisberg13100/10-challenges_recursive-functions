/**
 * FibonacciSequence
 * 
 * The Fibonacci sequence is a series of numbers in which
 * each number is the sum of the two preceding numbers.
 */

public class FibonacciSequence {
    public static int getValueByIndex (int n) {
        if (n == 0) {
            return 0;
        } else {
            return getValueByIndex(n - 1, 0 ,1);
        }
    }

    public static int getValueByIndex (int n, int first, int second) {
        int x = second;
        int y = first + second;
        if (n == 0) {
            return second;
        } else {
            return getValueByIndex(n - 1, x ,y);
        }
    }
 }
    