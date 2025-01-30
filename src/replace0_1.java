import java.util.*;
public class replace0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Input the number
        int result = 0;
        int place = 1; // To keep track of the place value
        while (num > 0) {
            int rem = num % 10; // Get the last digit
            if (rem == 0) {
                rem = 1; // Replace 0 with 1
            }
            result += rem * place; // Add the digit at the correct place
            place *= 10; // Move to the next place value
            num /= 10; // Remove the last digit
        }
        System.out.println(result);
    }
}
