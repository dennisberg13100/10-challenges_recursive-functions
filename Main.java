public class Main {
    public static void main(String[] args) {
        // Fibonacci sequence
        System.out.println("Printing the first 10 numbers in the fibonacci sequence:");
        System.out.print(FibonacciSequence.getValueByIndex(0));
        for(int i = 1; i < 10; i++){
            System.out.print(", " + FibonacciSequence.getValueByIndex(i));
        }
        System.out.println("\n");
    }
}
