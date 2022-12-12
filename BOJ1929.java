import java.util.*;
 
public class BOJ1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i = m; i <= n; i++){
            prime(i);
        }
    }
    public static void prime(int num){
        if(num < 2) return;
        if(num == 2) {
            System.out.println(num);
            return;
        }
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0) return;
        }
        System.out.println(num);
        return;
    }
}