import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

class Tomato {
   int x;
   int y;
   int z;
   Tomato(int z, int x, int y) {
      this.x = x;
      this.y = y;
      this.z = z;
   }
}

public class BOJ7569 {
   static int dx[] = {-1, 0, 1, 0, 0, 0};
   static int dy[] = {0, 1, 0, -1, 0, 0};
   static int dz[] = {0, 0, 0, 0, 1, -1};
   static int M; 
   static int N;
   static int H;
   static int[][][] box;
   static Queue<Tomato> que = new LinkedList<Tomato>();
   public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      H = Integer.parseInt(st.nextToken());

      box = new int[H][N][M];

      for(int h = 0; h < H; h++) {
         for(int n = 0; n < N ; n++) {
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < M; m++) {
               box[h][n][m] = Integer.parseInt(st.nextToken());
               if(box[h][n][m] == 1) {
                  que.add(new Tomato(h, n, m));
               }
            }
         }
      }
      System.out.println(bfs());
   }
   public static int bfs() {
      while(!que.isEmpty()) {
         Tomato t = que.remove();
         int x = t.x;
         int y = t.y;
         int z = t.z;
         for(int i = 0; i < 6; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            int nz = z + dz[i];
            if (nx>=0 && ny>= 0 && nz>=0 && nx<N && ny<M && nz<H) {
               if(box[nz][nx][ny] == 0) {
                  que.add(new Tomato(nz, nx, ny));
                  box[nz][nx][ny] = box[z][x][y] + 1;
               }
            }
         }
      }
      int result = Integer.MIN_VALUE;

      for(int h = 0; h < H; h++) {
         for(int n = 0; n < N ; n++) {
            for(int m = 0; m < M; m++) {
               if(box[h][n][m] == 0) return -1;
               result = Math.max(result, box[h][n][m]);
            }
         }
      }
      if(result == 1) return 0;
      else return result-1;
   }
}


