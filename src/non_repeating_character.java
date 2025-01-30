import java.util.*;
public class non_repeating_character
{
    static void freq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int count =0;
        String s1 ="";
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                count++;
                s1 = s1+ Character.toString(entry.getKey());
            }
        }
        System.out.println(count);
        System.out.println(s1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        freq(str);
    }
}
