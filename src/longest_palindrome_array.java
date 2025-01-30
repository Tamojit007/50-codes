import java.util.*;

public class longest_palindrome_array {
    static boolean palindrome(int num){
        int sum =0;
        int rem =0;
        int temp = num;
        while(num>0){
            rem = num%10;
            sum = (sum*10)+rem;
            num = num /10;
        }
        if(temp == sum){return true;}
        else {return false;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array :");
        int n = sc.nextInt();
        //ArrayList<Integer> ar = new ArrayList<>();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int j = n-1;j>=0;j--){
          if(palindrome(a[j]) == true){
              System.out.println("The Largest Palindrome Is : "+ a[j]);
              break;
          }
        }
    }
}
