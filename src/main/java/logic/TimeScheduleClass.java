package logic;

import java.util.Timer;
import java.util.TimerTask;

public class TimeScheduleClass {

    public void activateTimer() {
        activateWarning();
        activateFinish();
    }

    private void activateWarning()  {

        TimerTask warningTask = new TimerTask() {
            @Override
            public void run() {
                System.err.println("5 min left!");
            }
        };

        Timer timer = new Timer();

        long delay = 5000;

        timer.schedule(warningTask, delay);

        try {
            Thread.currentThread().join(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void activateFinish() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.err.println("Time is up!");
                System.exit(0);
            }
        };

        Timer timer = new Timer();
        long delay = 2000;

        timer.schedule(timerTask, delay);
    }

}
