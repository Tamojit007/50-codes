import  java.util.*;
public class remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s ="";
        //str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>=97 && str.charAt(i)<= 122) || (str.charAt(i)>=65 && str.charAt(i)<=90)){
                s += str.charAt(i);
            }
        }
        System.out.println("The result string is :" + s);
    }
}
