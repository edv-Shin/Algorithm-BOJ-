import java.util.*;
 
public class BOJ1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
 
        int minX = Math.min(x, w-x);
        int minY = Math.min(y, h-y);
        
        System.out.println(Math.min(minX, minY));
    }
}