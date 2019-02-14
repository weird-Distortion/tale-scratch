import logic.*;

import java.util.List;
import java.util.Map;

public class Main {

    private static final String file = "data.txt";

    public static void main(String[] args) {

        System.out.println("Welcome!\nInsert language");
        UserInput userInput = new UserInput();

        String language = userInput.inputLang();

        TextParser textParser = new TextParser();
        Map<String, List<String>> result = textParser.parseFile(file, language);

        Picker picker = new Picker();
        ResultPrinter resultPrinter = new ResultPrinter(picker);
        resultPrinter.printResult(result);

        TimeScheduleClass timeSchedule = new TimeScheduleClass();
        timeSchedule.activateTimer();

    }
}
