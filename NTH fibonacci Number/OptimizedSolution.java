import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        int a = 1, b = 1, sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println(sum);
    }
}
