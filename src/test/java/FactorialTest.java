import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactorialTest {
    @Test
    public void factorialCalculation(){
        assertThat(Factorial.factorial(8),is(40320));
    }

    @Test
    public void recursion(){
        assertThat(Factorial.recursion(8),is(40320));
    }

    @Test
    public void recursionWithCache(){
        assertThat(Factorial.recursionWithCache(8),is(40320));
    }
}
