//sum of digit
import java.util.*;

public class code_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int sum = 0;
        while(N!=0){
            int lastDigit = N%10;
            sum = sum + lastDigit;
            N = N/10;
        }
        System.out.println("Sum of digit : "+sum);
    }
}