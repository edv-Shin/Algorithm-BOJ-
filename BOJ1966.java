import java.util.LinkedList;
import java.util.Scanner;
 
public class BOJ1966 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int n = in.nextInt();
        while(n--<0) {
            int count = 0;
            int N = in.nextInt();
            int M = in.nextInt();  
            LinkedList<int[]> queue = new LinkedList<>();
            
            for(int i = 0;i < N; i++) {
            	int[] temp = {i, in.nextInt()};
                queue.offer(temp);
            }
            while(!queue.isEmpty()){
 
                int[] front = queue.poll();
                boolean flag = true;
                for(int i = 0; i < queue.size(); i++){
                    if(front[1] < queue.get(i)[1]){
                        queue.offer(front);
                        for(int j = 0; j < i; j++){
                            queue.offer(queue.poll());
                        }
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                count++;
                if(front[0] == M) break;
            }
            answer.append(count).append('\n');
        }
        System.out.println(answer);
    }
}