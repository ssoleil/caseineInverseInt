package number;


import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
import java.util.Random;

import org.junit.jupiter.api.Test;

public class IntegerTripletTest {

    private static Random R = new Random();
    
    private static int anInt() {
        return R.nextInt();
    }

    public IntegerTripletTest() {
    }

    /**
     * Test of sum method, of class IntegerTriplet.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        for (int i = 0; i < 100; ++i) {
            int sum = anInt()+anInt()+anInt();
            int a = sum;
            int b = anInt();
            int c = anInt();
            a = sum - b - c;
            IntegerTriplet it = new IntegerTriplet(a, b, c);
            assertEquals(sum, it.sum());
        }
    }

    /**
     * Test of average method, of class IntegerTriplet.
     */
    @Test
    public void testAverage() {
        System.out.println("average");
        for (int i = 0; i < 100; ++i) {
            int sum = anInt()+anInt()+anInt();
            int a = sum;
            int b = anInt();
            int c = anInt();
            a = sum - b - c;
            IntegerTriplet it = new IntegerTriplet(a, b, c);
            assertEquals(sum/3.0, it.average(), 1e-6);
        }

    }

    /**
     * Test of concatenate method, of class IntegerTriplet.
     */
    @Test
    public void testConcatenate() {
        System.out.println("concatenate");
        for (int i = 0; i < 100; ++i) {
            int a = anInt();
            int b = anInt();
            int c = anInt();
            IntegerTriplet it = new IntegerTriplet(a, b, c);
            String res = Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
            System.out.println();
            assertEquals(res, it.concatenate());
        }        
    }

}
