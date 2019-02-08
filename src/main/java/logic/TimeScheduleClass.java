package logic;

import java.util.Timer;
import java.util.TimerTask;

public class TimeScheduleClass {

    public void activateTimer() {
        printGreatingMsg();
        activateWarning();
        activateFinish();
    }

    private void activateWarning() {

        TimerTask warningTask = new TimerTask() {
            @Override
            public void run() {
                System.err.println("5 min left!");
            }
        };

        Timer timer = new Timer();

        long delay = 1500000;

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
        long delay = 300000;

        timer.schedule(timerTask, delay);
    }

    private void printGreatingMsg() {
        System.out.println("\nYou have 30 min!");
    }

}
