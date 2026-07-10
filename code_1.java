//sum of n numbers
import java.util.*;

class code_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1;i<=N;i++){
            sum += i;
        }
        System.out.println("Sum of "+N+" number is "+sum); // using logic give O(n)

        System.out.println("Sum of "+N+" number is "+((N*(N+1))/2)); //direct formula & more optimal give O(1)

    }
}