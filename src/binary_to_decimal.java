import java.util.*;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_val = sc.nextInt();
        int decimal =0;
        int pow = 0;
        while(binary_val>0){
            int rem = binary_val %10;
            decimal += rem*Math.pow(2,pow);
            binary_val = binary_val/10;
            pow++;
        }
        System.out.println("Decimal value is :" + decimal);
    }
}
