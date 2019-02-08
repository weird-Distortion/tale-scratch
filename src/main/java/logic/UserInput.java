package logic;

import java.util.Scanner;

public class UserInput {

    public String inputLang() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().trim();
    }
}
