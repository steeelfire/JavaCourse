package lesson140708;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringNumbersTest {

    private int _number;
    private String _expected;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(
                new Object[][]{
                        {10, "ten"},
                        {1, "one"},
                        {21, "twenty one"},
                        {2, "two"},
                        {3, "three"},

                }
        );
    }

    public StringNumbersTest(int number, String expected) {
        _number = number;
        _expected = expected;
    }

    @Test
    public void test(){
//        String description= StringNumbers.convert(10);
//        assertEquals("ten",description);
//        assertEquals("one",StringNumbers.convert(1));
//        assertEquals("twenty one",StringNumbers.convert(21));
        assertEquals(_expected, StringNumbers.convert(_number));
    }
}