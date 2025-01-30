import java.util.*;
public class remove_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<c.length;i++){
            if((c[i] != ' ') && (c[i] != '\t')){
                str.append(c[i]);
            }
        }
        System.out.println(str);
    }
}
