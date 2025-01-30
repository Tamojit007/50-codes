import java.util.*;
public class perfect_number {
    static boolean check(int num){
        int sum =0;
        for(int i=1;i<=num/2;i++){
            if(num%i ==0){
                sum += i;
            }
        }
        if(sum == num) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(check(a));
    }
}
