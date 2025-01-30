import java.util.*;
public class add_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[3][3];// length of m1 is row(3) [coloum(3) is the length of the assigned row(1)]
        int m2[][] = new int[3][3];
        int m3[][] = new int[3][3];

        System.out.println("1st matrix");
        for(int row1 =0;row1< m1.length;row1++){
            for(int col1 =0;col1<m1[row1].length; col1++){
                System.out.println("element of " + row1 + "," + col1 + " : ");
                m1[row1][col1] = sc.nextInt();
            }
        }
        System.out.println("2nd matrix");
        for(int row2 =0;row2< m2.length;row2++){
            for(int col2 =0;col2<m2[row2].length; col2++){
                System.out.println("element of " + row2 + "," + col2 +" : ");
                m2[row2][col2] = sc.nextInt();
            }
        }
        System.out.println("resultant matrix is :");

        for(int row3 =0;row3< m3.length;row3++){
            for(int col3 =0;col3<m3[row3].length; col3++){
                m3[row3][col3] = m1[row3][col3] + m2[row3][col3];
                System.out.print(m3[row3][col3]);
            }
            System.out.println();
        }

    }
}
