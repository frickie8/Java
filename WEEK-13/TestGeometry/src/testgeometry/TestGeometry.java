/**
 * @author vashishth
 * CIS-2571
 * 04/22/2022
 * TestGeometry 
 * This program uses Octagon class and creates objects and compares and clones Octagon.
 */ 

package testgeometry;

import java.util.ArrayList;

public class TestGeometry {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        // creates a new octagon with side length 8
        Octagon octagon1 = new Octagon(8);
        
        // creates an arraylist for Octagon object
        ArrayList<Octagon> geometricObjects = new ArrayList<> ();
        
        // adds the octagon1 to arraylist
        geometricObjects.add(octagon1);
        
        // adds six more Octagon objects to arraylist
        for(int i = 0; i < 6; i++) {
            // creates the randomvalue for side length
            double randomValue = (Math.random() * 100 + .5);
            geometricObjects.add(new Octagon(randomValue));
        }

        // display all octagons present in the arraylist
        int index = 0;
        for(Octagon o: geometricObjects){
            System.out.print("Octagon #" + (++index) + " ");
            System.out.println(o);
        }

        System.out.println();
        
        // randomly clone any octagon from the arraylist
        Octagon octagon2 = (Octagon) geometricObjects.get((int) (Math.random() * 7)).clone();
        
        System.out.println("Selected octagan 1: " + octagon1);
        System.out.println("Selected octagan 2: " + octagon2);
        
        System.out.println();
        
        //Outputs the comparison between selected and all of the other in arraylist
        int index_1 = 0;
        for(Octagon o: geometricObjects){
            System.out.print("Selected octagan #1 is");
            switch (octagon1.compareTo(o)) {
                case  1 : 
                    System.out.print(" greater than ");
                    break;
                case -1 : 
                    System.out.print(" less than ");
                    break;
                default : System.out.print(" equal to ");
            }
            System.out.println("Octagon #" + (++index_1));       
        }
        
        System.out.println();
        
        int index_2 = 0;
        for(Octagon o: geometricObjects){
            System.out.print("Selected octagan #2 is");
            switch (octagon2.compareTo(o)) {
                case  1 : 
                    System.out.print(" greater than ");
                    break;
                case -1 : 
                    System.out.print(" less than ");
                    break;
                default : System.out.print(" equal to ");
            }
            System.out.println("Octagon #" + (++index_2));       
        }
        
        System.out.println();
        
        // outputs particular equals method and use it all octagon elements from 
        // arraylist
        int index_3 = 0;
        for (Octagon o : geometricObjects) {
            System.out.println("Selected octagan #1 is" + 
                    ((octagon1.equals(o)) ? " equal to " : " not equal to " ) +
                    "Octagon #" + (++index_3));
        }

        System.out.println();
        
        int index_4 = 0;
        for (Octagon o : geometricObjects) {
            System.out.println("Selected octagan #2 is" + 
                    ((octagon2.equals(o)) ? " equal to " : " not equal to " ) +
                    "Octagon #" + (++index_4));
        }

        System.out.println();
    }
}   