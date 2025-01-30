import java.util.*;
public class perfect_num {
    static boolean calculate(int num){
        int sum =0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(sum == num) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("does "+num+" is a perfect number ? : "+calculate(num));
    }
}
