package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class SwitchEnum {
    enum RobotCommands {Forward, Left, Right, Stop};

    public static void main(String[] args) {
        RobotCommands[] route = {RobotCommands.Forward, RobotCommands.Forward,
        RobotCommands.Left, RobotCommands.Right, RobotCommands.Forward,
        RobotCommands.Stop};

        for (RobotCommands command:route){
            process(command);
        }
    }

    private static void process(RobotCommands command) {
        switch(command){
            case Forward:
                System.out.println(command.name());
                break;
            case Left:
                System.out.println(command.name());
                break;
            case Right:
                System.out.println(command.name());
                break;
            case Stop:
                System.out.println(command.name());
                break;
            default:
                break;
        }
    }


}
