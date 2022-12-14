import java.util.LinkedList;
import java.util.Scanner;
 
public class BOJ1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(prime(in.nextInt())) count++;
        }
        System.out.println(count);
    }
    public static boolean prime(int num){
        if(num < 2) return false;
        if(num == 2) return true;
 
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}