import java.util.*;
public class leap_year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leapyear = sc.nextInt();
        if(leapyear % 400 == 0) System.out.println("It is a leap year");
        else if (leapyear %4 ==0 && leapyear % 100 !=0) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not leap year");
        }
    }
}
