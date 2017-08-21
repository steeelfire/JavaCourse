package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class SwitchChar {
    public static void main(String[] args) {
        char[] route = {'F', 'F', 'L', 'F', 'R', 'S'};
        for (char direction : route) {
            go(direction);
            
        }
    }

    private static void go(char direction) {
        switch (direction){
            case 'F':
                System.out.println("Forward");
                break;
            case 'L':
                System.out.println("Left");
                break;
            case 'R':
                System.out.println("Right");
                break;
            case 'S':
                System.out.println("Stop");
                break;
            default:
                break;
        }
    }
}
