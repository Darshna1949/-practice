//FActors of number
import java.util.*;

public class code_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for(int i=1;i*i<=N;i++){
            if(N%i == 0){
                System.out.print(i+" ");
                if(N/i != i){
                    System.out.print(N/i+" ");
                }
            }
        }
    }
}
