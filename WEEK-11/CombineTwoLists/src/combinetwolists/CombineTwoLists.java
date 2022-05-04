/**
 * @author vashishth
 * CIS-2571
 * 04/07/2022
 * Combine two integer lists
 * This method uses arraylist and integer as data type for arraylist and add 
 * both lists together.
 */

package combinetwolists;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // create two integer arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // getting the size of the arraylist
        System.out.print("Enter the size of list1: ");
        int size1 = input.nextInt();
        
        //creating list with random integers
        for (int i = 0; i < size1; i++) {
            list1.add( (int) ( Math.random() * 100 ) );
        }
        
        System.out.print("Enter the size of list2: ");
        int size2 = input.nextInt();
        
        //creating list with random integers
        for (int i = 0; i < size2; i++) {
            list2.add( (int) ( Math.random() * 100 ) );
        }
        
        // getting elements of the lists
        System.out.println("list1: " + list1);
        /*for (int i = 0; i < size1; i++) {
            System.out.print(((i+1) == size1) ? (list1.get(i)) : (list1.get(i) + ", "));
        }
        System.out.println("]");*/
        
        System.out.println("list2: " + list2);
        /*for (int i = 0; i < size2; i++) {
            System.out.print(((i+1) == size2) ? (list2.get(i)) : (list2.get(i) + ", "));
        }
        System.out.println("]");*/
        
        // printing the output
        System.out.println("The combined list is " + union(list1,list2));
        
    }
    
    public static ArrayList<Integer> union(ArrayList<Integer> list1, 
            ArrayList<Integer> list2) {
        
        //using addAll method to add all elements for both lists
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
