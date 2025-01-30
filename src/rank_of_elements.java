import java.util.*;
public class rank_of_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<5;i++){
            ar.add(sc.nextInt());
        }
        Collections.sort(ar);
        for(int i=1;i<=5;i++){
            System.out.println("rank of " + ar.get(i-1) + " is " + i);
        }
    }
}
