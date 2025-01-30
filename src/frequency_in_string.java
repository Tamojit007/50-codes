import java.util.*;
public class frequency_in_string {
    static void freq(String s){
        Map<Character,Integer> map = new HashMap<>();
        s = s.toLowerCase();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> element:map.entrySet()){
            System.out.println(element.getKey() + " repeats "+element.getValue()+" times");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        freq(str);
    }
}
