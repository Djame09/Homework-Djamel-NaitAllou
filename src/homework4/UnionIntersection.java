package array;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {

        Integer [] array1 = {1, 3, 2, 4, 8, 9, 0};
        Set<Integer> set1=new HashSet<>(Arrays.asList(array1)); // convert array1 to set 1.
        Integer [] array2= {1, 3, 7, 5, 4, 0, 7, 5};
        Set<Integer> set2=new HashSet<>(Arrays.asList(array2)); // convert array2 to set 2.
        System.out.println("the set1 is: " +set1);
        System.out.println("the set2 is: " +set2);
        Set <Integer> union= new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("the Union is: "+union);

        Set<Integer> intersection=new HashSet<>(set1);

        intersection.retainAll(set2);
        System.out.println("the Intersection is: "+intersection);
        Set <Integer> symdeff= new HashSet<>(union);
        symdeff.removeAll(intersection);
        System.out.println("the Symmetric difference is: "+symdeff);

        }

    }


