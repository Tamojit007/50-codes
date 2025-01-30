import java.util.*;
public class array_rotation {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int j =0;j<5;j++){
            a[j] = sc.nextInt();
        }
        System.out.println("how many roation?");
        int k = sc.nextInt();

        for(int i =k;i<a.length;i++){
            ar.add(a[i]);
        }
        for(int p =0;p<k;p++){
            ar.add(a[p]);
        }
//        int r=0;
//        while(ar.size() < a.length){
//            ar.add(a[r]);
//            ++r;
//        }
        System.out.println("before rotation :");
        for(int l =0;l<a.length;l++){
            System.out.println(a[l]);
        }
        System.out.println("after rotation");
        System.out.println(ar);
        System.out.println(ar.size());
    }
}
