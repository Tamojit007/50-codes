//In a classroom some of the seats are already occupied by students
//and only a few seats are available in the classroom.
//The available seats are assumed as r and n number of students are looking for the seat.
//We need to find in how many different permutations n number of students can sit on r number of chairs.

import java.util.*;
public class permutation {
    static int fact(int num){
        if(num == 1 || num == 0) return 1;
        return num * fact(num-1);
    }
    public static void main(String[] args) {
        int people = 5;
        int seats = 9;

        if(people < seats)
        {
            int z =fact(people);
            System.out.println(z);
        }
        else {
        int permutation = fact(people)/fact(people-seats);
        System.out.println(permutation);}
    }
}
