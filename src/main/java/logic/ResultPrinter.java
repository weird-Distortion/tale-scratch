package logic;

import java.util.List;
import java.util.Map;

public class ResultPrinter {

    private Picker picker;

    public ResultPrinter(Picker picker) {
        this.picker = picker;
    }

    public void printResult(Map<String, List<String>> map) {

        map.forEach((k, v) ->
                System.out.println(k
                        + " : "
                        + picker
                        .pickElement(v)
                        .replaceAll("[<>]", "")
                        .trim()));
    }
}
