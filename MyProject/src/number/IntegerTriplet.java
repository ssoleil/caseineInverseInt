package number;


import caseine.tags.ToDoIn;



/**
 * A class representing a triplet of three integers
 * @author hadrien cambazard
 */
public class IntegerTriplet {

    private int a;
    private int b;
    private int c;

    /**
     * Constructor using three values
     */
    public IntegerTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the sum of the elements in the set
     */
    @ToDoIn("Compute and return the sum of the elements in the set")
    public int sum() {
        return a+b+c;
    }

    /**
     * @return the average value of the set
     */
    @ToDoIn("Compute and return the average value of the set")
    public double average() {
        return (a+b+c)/3.0;
    }

    /**
     * @return the string obtained by concatenating the three integers
     */
    @ToDoIn("Compute and return the string obtained by concatenating the three integers")
    public String concatenate() {
        return ""+a+b+c;
    }
}
