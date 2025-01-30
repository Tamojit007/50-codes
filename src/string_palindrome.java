import java.util.*;
public class string_palindrome {
    static boolean check(String s1){
        s1 = s1.toLowerCase();
        int low = 0;
        int high = s1.length()-1;
        //String str = "";
        // STRING REVERSE:
//        for(int i = s1.length() -1;i>=0;i-- ){
//            str = str + s1.charAt(i);
//        }
//        if(s1.equals(str)) return true;
//        else return false;
        //Two pointer:
        while(low<high){
            if(s1.charAt(low) != s1.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(check(a));
    }
}
