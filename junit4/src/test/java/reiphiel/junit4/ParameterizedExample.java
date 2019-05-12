package reiphiel.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedExample {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1, 2L}, {2, 3, 4L}
        });
    }

    private int i;

    private int j;

    private long k;

    public ParameterizedExample(int i, int j, long k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    @Test
    public void test() {
        System.out.println(i + "," + j + "," + k);
    }

}
