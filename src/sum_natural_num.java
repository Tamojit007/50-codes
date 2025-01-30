import java.util.*;
public class sum_natural_num {
    static int sum(int n){
        if(n==0) return n;
        return  n+ sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));

    }
}
