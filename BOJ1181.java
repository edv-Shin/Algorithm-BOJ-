import java.util.*;
 
public class BOJ1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = new String[in.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.next();
        }
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}