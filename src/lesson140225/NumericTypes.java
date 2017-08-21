package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class NumericTypes {
    public static void main(String[] args) {

        byte b = Byte.MIN_VALUE;  // 8 bit, 1 byte
        b = Byte.MAX_VALUE;

        short s =Short.MIN_VALUE;   //16 bit, 2 bytes
        s=Short.MAX_VALUE;

        char c ='A';                //16 bit, 2 bytes
        c = 65;
        c = Character.MIN_VALUE;
        c = Character.MAX_VALUE;

        int i = Integer.MIN_VALUE; //32 bit, 4 bytes
        i = Integer.MAX_VALUE;

        long l = Long.MIN_VALUE; //64 bit, 8 bytes
        l = Long.MAX_VALUE;

        float f = Float.MIN_VALUE; // 32 bit
        f = Float.MAX_VALUE;

        double d = Double.MIN_VALUE; //64 bit
        d = Double.MAX_VALUE;

        boolean bool = true;
        bool = false;
    }
}
