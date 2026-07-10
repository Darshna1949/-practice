//given N integer, count how many digit it contain
import java.util.*;

public class code_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int count = 0;
        if(N==0){
            count++;
        }else{
           while(N!=0){
            N = N/10;
            count++;
            } 
        }
        System.out.println("digit count is "+count);
    }
}