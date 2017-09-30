package lesson140708;

import org.junit.*;

public class GraphTestPattern {

    static {
        System.out.println("static init");
    }

    @BeforeClass
    public static void setupClass(){
        System.out.println("BeforeClass");
    }


    {
        System.out.println("instance init");
    }

    public GraphTestPattern() {
        System.out.println("constructor");
    }


    @Before
    public void setup(){

        System.out.println("Before");
    }

    @After
    public void teardown(){

        System.out.println("After");
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("AfterClass");
    }
}
