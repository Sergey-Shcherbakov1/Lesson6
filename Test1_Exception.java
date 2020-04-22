import Lesson6.Lesson6_1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1_Exception {
@Parameterized.Parameters
    public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
            {new int[]{5, 3, 2}, new int[]{}},
            {new int[]{7, 3, 5, 100, 50}, new int[]{}}
            //интересно, что если поставить цифру 40000, то выдаст исключение ArrayComparisonFailure!!!
    });
}

    private int[] a;
    private int[] b;

    public Test1_Exception(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    Lesson6_1 test;

    @Before
    public void init() {
        test = new Lesson6_1();
    }

    @Test(expected = RuntimeException.class)
    public void massTestAdd() throws RuntimeException {
        Assert.assertArrayEquals(b, test.getAllNumbersAfter4(a));
    }
}
