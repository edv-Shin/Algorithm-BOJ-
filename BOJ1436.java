import java.util.*;
 
public class BOJ1436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 666;
        int count = 0;
        while(true){
            if(Integer.toString(i).contains("666"))
                count++;
            if(count == n){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}