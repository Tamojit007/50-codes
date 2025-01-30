import java.util.*;
public class replace_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2  = sc.nextLine();
        String replaceString = s.replace(s1,s2);
        System.out.println(replaceString);
    }
}
