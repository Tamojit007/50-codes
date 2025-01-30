import java.util.*;
public class longest_palindrome_substring {
    static boolean check(String s,int low,int high){
        s=s.toLowerCase();
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return  true;
    }
    static String longestpal(String s){
        int n = s.length();
        int maxlen = 1;
        int start =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(s,i,j) && (j-i+1) > maxlen){
                    start = i;
                    maxlen = j-i+1;
                }
            }
        }
        return s.substring(start , start+maxlen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("longest palindrome substring is :" + longestpal(str));
    }
}
