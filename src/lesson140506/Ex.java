package lesson140506;

public class Ex {

    public static void main(String[] args) {
        try {
            m();
        } catch (Exception e) {
            System.out.println("cathced in main: " + e.getMessage());
            System.out.println("reason: " + e.getCause().getMessage());
        }
    }

    private static void m() {
        n();
    }

    private static void n() {
        try {
            o();
        } catch (Exception e) {
            System.out.println("catched it in n");
            throw new RuntimeException("big trouble",e); //chained
        }
    }

    private static void o() {
        throw new RuntimeException("trouble");
    }
}
