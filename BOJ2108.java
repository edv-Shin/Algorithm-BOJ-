import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ2108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int modeMax = 0;
        int mode = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            int count = 1;
            int next = 0;
            for(int j = i + 1; j < n;j++){
                if(arr[i] != arr[j]) break;
                count++;
                next++;
            }
            if(count > modeMax){
                modeMax = count;
                mode = arr[i];
                flag = true;
            } else if(count == modeMax && flag){
                mode = arr[i];
                flag = false;
            }
            i += next;
        }
        System.out.println((int)Math.round((double)sum / n));
        System.out.println(arr[n/2]);
        System.out.println(mode);
        System.out.println(arr[n-1]-arr[0]);
    }
}