import java.util.*;
public class count_inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        int temp;
        for(int j=0;j<n;j++){
            for(int k=0;k<n-j-1;k++){
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Number of Counts is : "+count);
        System.out.println("sorted array is :");
        for(int p=0;p<n;p++){
            System.out.println(a[p]);
        }
    }
}
