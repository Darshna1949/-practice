//Fibonacci Series
import java.util.*;

public class code_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int num1 = 0;
        int num2 = 1;

        if(N<1){
            System.out.print("Invalid to print");
        } else if(N==1){
            System.out.print(num1);
        } else{
            System.out.print(num1 +" "+ num2 +" ");
        }

        for(int i=1;i<=(N-2);i++){
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum+" ");
        }
    }    
}
