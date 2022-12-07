import java.util.*;
 
public class BOJ1259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        while(true){
            String str = in.next();
            if(str.equals("0")) break;
            boolean flag = true;
            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("yes");
            else System.out.println("no");
        }
    }
}