import junit.framework.Assert;

import static junit.framework.Assert.*;

/**
 * Created by khwan on 14. 10. 21.
 */
public class Test1 {

    public static void main(String[] args){

        int a = 5;
        int b = 7;
        int expected = 12;

        Calculator c = new Calculator();
        int result = c.getSum(a, b);

        assertEquals(expected, result, 0);
    }
}

class Calculator{

    public int getSum(int n1, int n2){
        return n1 +  n2;
    }
}