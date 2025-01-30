import java.util.*;
public class non_repeating_element {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prompting user for array size
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    // Input array
    int[] a = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    // Finding non-repeating elements
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : a) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }

    ArrayList<Integer> ar = new ArrayList<>();
    for (Map.Entry<Integer, Integer> element : map.entrySet()) {
        if (element.getValue() == 1) {
            ar.add(element.getKey());
        }
    }
        System.out.println("Non-repeating element(s): " + ar);
    }
}
