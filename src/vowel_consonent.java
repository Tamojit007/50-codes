import java.util.*;
public class vowel_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        int vowel_count = 0;
        int consonent_Count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) == 'u'){
                vowel_count++;
            }else consonent_Count++;
        }
        System.out.println("vowel_count is : "+vowel_count);
        System.out.println("consonent_count is : "+consonent_Count);

    }
}
