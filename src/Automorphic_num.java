import java.util.*;
public class Automorphic_num {
    static boolean solve(int n){
        int squ = n * n;
        while(n>0){
            if(n%10 != squ%10) {
                return false;
            }
            n = n/10;
            squ = squ/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solve(num));
    }
}
