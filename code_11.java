//Strong number
import java.util.*;
public class code_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int org = sc.nextInt();
        sc.close();

        int N = org;
        int fact=1;
        int sum = 0;

        if(org == 0){
            sum = 1;
        }

        while(N != 0){
            int temp = N%10;
            for(int i=2;i<=temp;i++){
            fact *= i;
            }
            sum += fact;
            fact = 1;
            N = N/10;
        }
        System.out.println(sum);

        if(sum == org){
            System.out.println("Strong number");
        } else{
            System.out.println("Not Strong number");
        }
    }
}
