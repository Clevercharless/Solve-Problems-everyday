
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0)
        {
            String S = in.next();
            int N = in.nextInt();
            
            Solution ob = new Solution();
            ob.printIntString(S,N);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printIntString(String S,int N){
        System.out.println("The input string :"+S);
        System.out.println("The input integer :"+N);
    }
}



// Given a string S and an integer number N, print the output in the form: "The input string :S" and "The input integer :N" in the two separate lines.

// Example 1:

// Input:
// S = 'GeeksforGeeks'
// N = 20
// Output : 
// The input string :GeeksforGeeks
// The input integer :20

// Explanation:
// On the first line we have to 
// print "The input string :S" 
// where S = 'GeeksforGeeks'.
// On the second line, we have to 
// print "The input integer :N"
// Where N is 20.
// Example 2:

// Input:
// S = 'Power'
// N = 50
// Output: 
// The input string :Power
// The input integer :50

// Explanation:
// On the first line, we have to
// print "The input string :S"
// where S = 'Power'.
// On the second line, we have to
// print "The input integer :N"
// Where N is 50.
// Your Task:  
// You don't need to read input. Your task is to complete the function printIntString() which takes the String S and an Integer N as input parameters and print two Strings on separate lines as mentioned above.

// Expected Time Complexity: O(1)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= |string length| <= 103
// 1 <= N <= 104
