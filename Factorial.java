/**
 * Factorial
 * 
 * Factorial is a mathematical function that multiplies 
 * a number by all the positive integers less than itself.
 */
public class Factorial {

    public static int result(int n){
        if (n == 0) {
            return 1;
        } else {
            return result(n, 1);
        }
    }

    public static int result(int n, int result){
        if (n ==   1) {
            return result;
        } else {
            return result(n-1, n * result);
        }
    }
}