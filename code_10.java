//perfect number
import java.util.*;

public class code_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int sum = 1;
        if(N<=1){
            sum = 0;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                if(i*i!=N){
                    sum += i+(N/i);
                } else{
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        if(sum == N){
            System.out.println("Perfect number");
        } else{
            System.out.println("Not Perfect number");
        }
    }
}
