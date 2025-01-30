import java.util.*;
public class prime_num {
    static void checkprime(int num){
        int div_count =0;
        if(num<2) {
            System.out.println(num + " is not a prime number");
        }else {
            for(int i=1;i<=num/2;i++){
                if(num % i == 0){
                    div_count++;
                }
            }
        }
        if(div_count >2) System.out.println(num + " is not a prime number");
        else System.out.println(num + " is a prime number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkprime(n);
    }
}
