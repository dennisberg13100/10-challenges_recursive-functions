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
    }
}
