import java.util.*;
public class addition_fraction {
    static int gcd(int num1,int num2){
        while(num1>0 && num2 >0){
            if(num1>num2) num1 = num1%num2;
            else num2 = num2%num1;
        }
        if(num1 == 0) return num2;
        else return num1;
    }
    static void lowest(int den3, int num3){
        int common_fac = gcd(den3,num3);
        den3 = den3/common_fac;
        num3 = num3/common_fac;
        System.out.println("Resultant faction is : " +num3 + "/"+den3 );
    }
    static void add(int num1, int den1, int num2,int den2){
        int gcd = gcd(den1,den2);
        int den3 = (den1*den2)/gcd;
        int num3 = (num1*den3/den1)+(num2*den3/den2);
        lowest(den3,num3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 :");
        int num1 = sc.nextInt();
        System.out.println("den1 :");
        int den1 = sc.nextInt();
        System.out.println("num2 :");
        int num2 = sc.nextInt();
        System.out.println("den2 :");
        int den2 = sc.nextInt();
        System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
        add(num1, den1, num2, den2);
    }
}
