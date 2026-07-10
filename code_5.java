//palindrome number
import java.util.*;

public class code_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int Org = N;
        int reverse = 0;
        while(N!=0){
            int lastDigit = N%10;
            reverse = reverse * 10 + lastDigit;
            N = N/10;
        }
        if(Org==reverse){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome Number");
        }
    }    
}
