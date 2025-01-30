import java.util.*;
public class num_is_a_sum_two_primenum {
    static int a[] = new int[20];
    static int checkprime(int num){
        int count =0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) count++;
        }
        if(count>2) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p =0;
        //insert prime number upto num itself
        for(int i =2;i<num;i++){
            if(checkprime(i) == 1) a[p++]=i;
        }

        //summation
        for(int j=0;j<a.length/2;j++){
            int sum =0;
            for(int k=j+1;k<a.length;k++){
                    sum = a[j] + a[k];
                    if(sum == num) System.out.println(a[j] + " , "+ a[k]);
            }
            if(a[j]+a[j] == num) System.out.println(a[j] + " , " + a[j]);
        }
    }
}
