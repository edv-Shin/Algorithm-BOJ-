import java.util.LinkedList;
import java.util.Scanner;
 
public class BOJ2164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> arr = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++){
            arr.add(i);
        }
        while(true){
            if(arr.size() == 1) break;
            arr.remove();
            arr.add(arr.poll());
        }
        System.out.println(arr.get(0));
    }
}