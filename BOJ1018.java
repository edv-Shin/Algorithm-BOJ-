import java.util.*;

public class BOJ1018 {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new boolean[N][M];
				
		//입력
        for(int i = 0; i < N; i++){
            String str = in.next();
            for(int j = 0; j < M; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int row = N-7;
        int col = M-7;
        for(int i = 0; i < row; i++){
            for(int j = 0;j < col; j++){
                find(i, j);
            }
        }
        System.out.println(min);
        in.close();
    }
    public static void find(int x, int y){
        int count = 0;
        boolean first = arr[x][y]; //첫 칸의 색
 
        for(int i = x; i < x + 8 ; i++){
            for(int j = y; j < y + 8; j++){
                if(arr[i][j] != first){
                    count++;
                }
                first = !first;
            }
            first = !first;
        }	
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
    }
} {
   
}
