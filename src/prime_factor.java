import java.util.*;
public class prime_factor {
  static int isprime(int n){
      for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0) return 0;
      }
      return 1;
  }
  static void primefactor(int n){
      for(int i=2;i<=n;i++){
            if(isprime(i)==1){
                int temp =n;
                while(temp%i ==0){
                    System.out.println(i+" ");
                    temp = temp/i;
                }
            }
      }
  }
    public static void main(String[] args)
    {
        int n = 24;
        primefactor(n);
    }

}
