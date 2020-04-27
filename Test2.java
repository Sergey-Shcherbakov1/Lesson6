import Lesson6.Lesson6_2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {new int[]{1, 100, 5, 54}, true},
                        {new int[]{30, 40, 50, 100}, false},
                        {new int[]{4, 10, 5, 12}, true}
                }
        );
    }
    private final int[] a;
    private final boolean b;
    public Test2(int[] a, boolean b) {
       this.a = a;
       this.b = b;
    }

    Lesson6_2 test;
    @Before
    public void init() {
        test = new Lesson6_2();
    }

    @Test
    public void massTest () {
        Assert.assertTrue(String.valueOf(b), Lesson6_2.detectNumber(a));
    }

    @Test (expected = NullPointerException.class)
    public void exceptionTest () {
    int [] a = null;
    Assert.assertTrue(Lesson6_2.detectNumber(a));
    }
}
