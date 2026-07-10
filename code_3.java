//reverse a number
import java.util.*;
public class code_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int reverse = 0;
        while(N!=0){
            int last_digit = N%10;
            reverse = reverse*10 + last_digit; 
            N = N/10;
        }
        System.out.println("Reverse : "+reverse);
    }
}
