package lesson140303.statics;

/**
 * Created by User on 19.07.2017.
 */
public class A {

    public static int objectCount;

    public static int getCount(){
        return objectCount;
    }

    int id;

    {
        id = objectCount++;
    }
}
