package merboxel.chess;

import merboxel.chess.game.Command;
import merboxel.chess.game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game chessGame = new Game();

        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("FIN")) {
            String[] command = input.split(" ");
            switch (command[0].toUpperCase()) {
                case (Command.MOVE) -> {
                    try {
                        chessGame.doMove(command[1]);
                    } catch (Exception ignored) {
                        System.out.println(helpMessage());
                    }
                }
                case (Command.HELP) -> {
                    System.out.println(helpMessage());
                }
                case (Command.PRINT) -> {
                    System.out.println(chessGame.printBoard());
                }
                default -> {
                }
            }
            input = sc.nextLine();
        }
    }

    public static String helpMessage() {
        return """
                Available commands
                'MOVE XXX-XX'
                'PRINT'
                'HELP'
                """;
    }
}