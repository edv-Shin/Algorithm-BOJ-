import java.util.*;
 
public class BOJ1874 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        while(n-- > 0){
            int num = in.nextInt();
            if(num > start){
                for(int i = start + 1; i <= num; i++){
                    stack.push(i);
                    answer.append('+').append('\n');
                }
                start = num;
            } else if(stack.peek() != num){
                System.out.println("NO");
                return;
            }
            stack.pop();
            answer.append('-').append('\n');
        }
        System.out.println(answer);
    }
}