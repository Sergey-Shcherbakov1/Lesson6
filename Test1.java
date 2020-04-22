import Lesson6.Lesson6_1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class Test1 {


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{6, 20, 50, 4, 150}, new int[]{150}},
                {new int[]{4, 2, 2}, new int[]{2, 2}},
                {new int[]{7, 3, 4}, new int[]{}}
        });
    }

    private int[] a;
    private int[] b;

    public Test1(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    Lesson6_1 test;

    @Before
    public void init() {
        test = new Lesson6_1();
    }

    @Test
    public void massTest() {
        Assert.assertArrayEquals(b, test.getAllNumbersAfter4(a));
    }

    @Test(expected = RuntimeException.class)
    public void exceptionTest() {
        test.getAllNumbersAfter4(new int[]{1,2,3});
    }
}