import java.util.*;
class Solution
{
    public static int findRotationCount(int[] nums)
    {
        // Write your code here...
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        Arrays.sort(nums);
        int temp = nums[0];
        int rem = 0;
        for(int i=0;i<nums.length;i++){
            if(a[i]==temp){
                return(i);
            }
        }
        return 0 ;
    }
    public static Void main(String[] arg){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Input");
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findRotationCount(arr));
}
}

