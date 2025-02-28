// Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.

// Input Format

// Input contains the array size, no of elements and the window size

// Output Format

// Print the maximum of numbers

// Constraints

// 1 <= size <= 1000                        

// Sample Input 1

// 8

// 1 3 5 2 1 8 6 9

// 3

// Sample Output 1

// 5 5 5 8 8 9

// For example:

// Input	Result
// 8
// 1 3 5 2 1 8 6 9
// 3
// 5 5 5 8 8 9



import java.util.*;
public class slider{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i =0;i<n;i++){
arr[i]=sc.nextInt();
}
int k= sc.nextInt();
int i=0;
while(i<n-k+1){
    int max=0;
    int j=i;
    while(j<k+i){
        if(arr[j]>=max){
            max = arr[j];
        }
        j++;
    }
    System.out.print(max+" ");
    i=i+1;
}
}
}
