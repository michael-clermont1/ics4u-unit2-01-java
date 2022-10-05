
import java.util.ArrayList;
import java.util.List;

/**
 * The Bicycle Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */

public class Stack {
    /**
     * List for stack values.
     */
    private List<Integer> stackAsList = new ArrayList<Integer>();

    /**
     * The push() function.
     *
     * @param pushedNumber -  how much to slow down
     */

    public void push(int pushedNumber) {
        this.stackAsList.add(pushedNumber);
    }
    /**
     * The showStack() function.
     *
     */

    public void showStack() {
        System.out.println(this.stackAsList);
    }
}

