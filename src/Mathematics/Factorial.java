package Mathematics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {

            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;

            //taking N
            N = sc.nextInt();
            //calling factorial() method
            //of class Factorial
            System.out.println(factorial(N));
        }
    }
    public static long factorial(int N) {
        long fact = 1;
        for(long i =1; i <=N; ++i){
            fact *= i;
        }
        return fact;
    }
}
