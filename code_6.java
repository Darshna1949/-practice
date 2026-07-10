//Armstrong Number
import java.util.*;
import java.lang.Math;

public class code_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int original = N;
        int temp = N;
        int count = 0;
        
        while(temp!=0){
            temp = temp/10;
            count++;
        }

        int sum = 0;
        if(N==0){
            count++;
        } else{
            while(N!=0){
            int lastDigit = N%10;
            sum = sum + (int)Math.pow(lastDigit,count);
            N = N/10;
            }
        }
        

        if(original == sum){
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not Armstrong Number");
        }
        
    }    
}
