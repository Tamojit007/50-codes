import java.util.*;
public class second_smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int large = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>large) large = a[i];
        }
        System.out.println(large);
        int sec_large = a[0];
        for(int j=0;j<a.length;j++){
            if(a[j] != large && a[j]>sec_large) sec_large = a[j];
        }
        System.out.println(sec_large);
    }
}
