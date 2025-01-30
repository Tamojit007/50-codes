import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class consecutive_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        int count =1;
        int res = 1;
        for(int j=1;j<n;j++){
            if(a[j] == a[j-1]) continue;
            else if(a[j] == a[j-1]+1){
                count++;
            }else count =1;
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}
