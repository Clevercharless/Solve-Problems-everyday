
public class maxcount{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int count = 0;
while(n>0){
    // if(n>99){
    //     count++;
    // }
    if(n>9){
        count++;
    }
n = n-1;
count++;
}
System.out.println(count);
}
}















A positive integer N is passed as the input. If we print all the numbers from 1 to N continuously, the program must find the number of characters (digits) C printed and print the count C as the output.

 

Input Format:


The first line contains N.

 

Output Format:


The first line contains C.

 

Boundary Conditions:


1 <= N <= 9999999

 

Example Input/Output 1:


Input:


2

 

Output:


2

 

Explanation:


We print 12 and hence the total number of characters is 2.

 

Example Input/Output 2:


Input:


15

 

Output:


21

 

Explanation:


We print 123456789101112131415 and hence the total number of characters is 21.

For example:

Input	Result
2
2
15
21
