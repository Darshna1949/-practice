//prime number
import java.util.*;

public class code_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        if(N<=1){
            isPrime = false;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                isPrime = false;
                break;
            }    
        }
        if(isPrime){
            System.out.println("Prime Number");
        } else{
            System.out.println("Not Prime Number");
        }
    }
}
