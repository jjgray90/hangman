package me.jjgray.hangman;

public interface GameUtils {

    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED = "\u001B[31m";

    String ANSI_RED_BG = "\u001B[41m";

    String ANSI_GREEN_BG = "\u001B[42m";

    String ANSI_WHITE = "\u001B[37m";

    String state_1 =
            " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + " \n"
                    + "_________________";

    String state_2 =
            " \n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";

    String state_3 =
            "        _________\n"
                    + "        |/\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";


    String state_4 =
            "        _________\n"
                    + "        |/       |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";

    String state_5 =
            "        _________\n"
                    + "        |/       |\n"
                    + "        |       (_)\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";

    String state_6 =
            "        _________\n"
                    + "        |/       |\n"
                    + "        |       (_)\n"
                    + "        |        |\n"
                    + "        |        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";
    String state_7 =
            "        _________\n"
                    + "        |/       |\n"
                    + "        |       (_)\n"
                    + "        |       \\|/\n"
                    + "        |        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "________|________";

    String state_8 =
            "        _________\n"
                    + "        |/       |\n"
                    + "        |       (_)\n"
                    + "        |       \\|/\n"
                    + "        |        |\n"
                    + "        |       / \\\n"
                    + "        |\n"
                    + "________|________";
}
