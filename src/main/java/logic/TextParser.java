package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

public class TextParser {

    public Map<String, List<String>> parseFile(String file, String language) {

        try {
            String text = Files.lines(Paths.get(file)).collect(joining("\n"));
            String workingPart = findByLanguage(text, language);
            String cleanData = clearStr(workingPart, language);

            String[] titlesAndOpts = cleanData.split("</.*>");

            return findResultMap(titlesAndOpts);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new HashMap<>();
    }

    private String findByLanguage(String text, String language) {
        return Arrays.stream(text.split(","))
                .filter(el ->
                        el.trim().startsWith(language))
                .findFirst()
                .orElse("empty");
    }

    private String clearStr(String str, String language) {
        return str.replaceAll(language + "\\s+\\{", "")
                .replaceAll("}", "")
                .trim();
    }

    private Map<String, List<String>> findResultMap(String[] titlesAndOpts) {
        return Arrays.stream(titlesAndOpts)
                .map(s -> s.trim().split("\n"))
                .collect(toMap(k -> k[0],
                        v -> asList(Arrays.copyOfRange(v, 1, v.length))));
    }
}