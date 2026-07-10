//Find GCD & LCM
import java.util.*;

public class code_9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int GCD=1;
        int LCM=1;
        for(int i=1;i<=Math.min(X,Y);i++){
            if(X%i==0 && Y%i==0){
                GCD = i;
                LCM = i*i;
            }
        }
        System.out.println(GCD);
        System.out.println(LCM);
    }    
}
