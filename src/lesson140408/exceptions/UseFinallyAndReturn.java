package lesson140408.exceptions;

public class UseFinallyAndReturn {

    public static void main(String[] args) {
        int result = calculate();
        System.out.println(result);
    }

    private static int calculate() {
        try{
            return 10;
        } finally{
            return 20;
        }
    }
}
