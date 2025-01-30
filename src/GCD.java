import java.util.*;
public class GCD {
    static int gcd(int num1,int num2){
        while(num1>0 && num2>0){
            if(num1>num2){
                num1 = num1%num2;
            }else {num2 = num2%num1;}
        }
        if(num1==0) return num2;
        else {return num1;}
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println("G.C.D/H.C.F OF TWO NUMBER " + a + " & "+b);
        System.out.println(gcd(a,b));
        System.out.println("L.C.M of Two Number "+ a + " & " +b);
        int z = (a * b)/gcd(a,b);
        System.out.println(z);
    }
}
