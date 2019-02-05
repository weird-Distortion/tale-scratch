import logic.TimeScheduleClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String language = scanner.nextLine().trim();

        BasicEnum.valueOf(language.toUpperCase()).print();

        TimeScheduleClass timer = new TimeScheduleClass();
        timer.activateTimer();

    }
}
