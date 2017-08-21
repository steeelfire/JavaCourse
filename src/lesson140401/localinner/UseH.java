package lesson140401.localinner;

public class UseH {

    public static void main(String[] args) {
        Changeable h = new H();
        h.changeState();

        Changeable g = new G();
        g.changeState();
        g.changeState();
        System.out.println(g.getState());

        Changeable [] arrayOfC = new Changeable[]{h,g};
        use(arrayOfC);
    }

    private static void use(Changeable[] arrayOfC) {
        for (Changeable changeable:
             arrayOfC) {
            changeable.changeState();
        }
    }
}
