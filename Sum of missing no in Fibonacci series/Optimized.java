import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bound = sc.nextInt();
        
        if (bound < 1) {
            System.out.println("Invalid input! Please enter a number greater than 0.");
            return;
        }

        // Generate Fibonacci sequence
        int a = 0, b = 1;
        List<Integer> fibList = new ArrayList<>();
        fibList.add(a);
        if (bound > 1) fibList.add(b);

        for (int i = 2; i < bound; i++) {
            int next = a + b;
            fibList.add(next);
            a = b;
            b = next;
        }

        // Convert list to a set for quick lookup
        Set<Integer> fibSet = new HashSet<>(fibList);
        
        // Print Fibonacci sequence
        System.out.println("Fibonacci sequence: " + fibList);

        // Sum of non-Fibonacci numbers
        int maxFib = fibList.get(fibList.size() - 1);
        int nonFibSum = 0;

        for (int i = 0; i < maxFib; i++) {
            if (!fibSet.contains(i)) {
                nonFibSum += i;
            }
        }

        System.out.println("Sum of non-Fibonacci numbers: " + nonFibSum);
    }
}
