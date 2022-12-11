import java.util.*;
 
public class BOJ1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            if (binarySearch(arr, a) >= 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
    public static int binarySearch(int[] arr, int key){
        int lo = 0;
        int hi = arr.length - 1;
        
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(key < arr[mid]){
                hi = mid - 1; 
            } else if(key > arr[mid]){
                lo = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}