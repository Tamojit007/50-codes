import java.util.*;
public class bubble_sort {
//    static void bubble(int a[]){
//        int temp ;
//        for(int i=0;i<a.length;i++) {
//            for (int j = 0; j < a.length - i - 1; j++) {
//                if (a[j] > a[j +1]) {
//                    temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {2,0,3,5,6,8,1,4};
//        System.out.println(bubble(arr));
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }


        //function that sorts the array
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i-1); j++){
                    if(arr[j] > arr[j+1]){
                        //swap elements
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        public static void main(String[] args) {
            int arr[] = {3, 60, 35, 2, 45, 320, 5};
            System.out.println("Array Before Bubble Sort");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            bubbleSort(arr);
            System.out.println("Array After Bubble Sort");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}
