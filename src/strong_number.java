import java.util.*;
public class strong_number {
    static int factorial(int num){
        if(num==0 || num== 1) return 1;
        return num* factorial(num-1);
    }
    static boolean calculate(int num){
        int sum =0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            sum = sum + factorial(rem);
            num = num/10;
        }
        if(sum == temp) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(calculate(n));
    }

}
