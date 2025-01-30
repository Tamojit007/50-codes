import java.util.*;
public class rev_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("reversed array");

        for(int j =n-1;j>=0;j--){
            System.out.println(a[j]);
        }
    }
}
