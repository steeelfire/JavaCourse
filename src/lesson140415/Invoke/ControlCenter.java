package lesson140415.Invoke;

import java.util.concurrent.TimeUnit;

public class ControlCenter implements CommandListener, Runnable {


    private String _command;
    private DispatcheR _dispatcheR;

    public ControlCenter(DispatcheR dispatcheR) {

        _dispatcheR = dispatcheR;
    }

    @Override
    public void command(String command) {

        _command = command;
    }

    @Override
    public void run() {
        while(true){
            _dispatcheR.command(_command);
            pause();
        }
    }

    private void pause() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
