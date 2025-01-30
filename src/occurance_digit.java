import java.util.*;
public class occurance_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        while (num>0){
            int rem = num%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            num = num/10;
        }
        for(Map.Entry<Integer,Integer> element:map.entrySet()){
            System.out.println(element.getKey() + " repeats "+element.getValue()+" times");
        }
    }
}
