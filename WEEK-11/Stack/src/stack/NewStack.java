/**
 * @author vashishth
 * CIS-2571
 * 04/07/2022
 * NewStack Class
 * This class uses ArrayList as an superclass and create NewStack by inheritance
 */

package stack;

public class NewStack extends java.util.ArrayList {

    // to get size of the stack by invoking size() of Parent class
    public int getSize() {
        return size();
    }
    
    // returns the last input
    public Object peek() {
        return get(getSize() - 1);
    }

    // removes the last input
    public Object pop() {
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    // adds the input
    public void push(Object o) {
        add(o);
    }

    @Override
    /**
     * Override the toString in the Object class
     */
    public String toString() {
        String out = "[ ";
        for(int i = getSize(); i > 0; i--){
            out += get(i-1);
            out += ((i-1) != 0) ? ", " : "";
        }
        out += "]";
        return out;
    }
}
