package lld;

import java.util.*;

public class PlaySnakeGame {
    public static void main(String[] args) {
        Dice dice = new Dice(2);
        Jumper snake = new Jumper(29, 8);
        Jumper snake2 = new Jumper(99, 63);
        Jumper snake3 = new Jumper(10, 2);
        Jumper snake4 = new Jumper(30, 8);
        Jumper snake5 = new Jumper(59, 8);
//        creating snakes
        List<Jumper> snakeList = new ArrayList<>();
        snakeList.add(snake);
        snakeList.add(snake2);
        snakeList.add(snake3);
        snakeList.add(snake4);
        snakeList.add(snake5);
//        creating ladder
        List<Jumper> ladder = new ArrayList<>();
        Jumper ladder1 = new Jumper(10, 23);
        Jumper ladder2 = new Jumper(50, 100);
//        creating players
        Player player1 = new Player("Prashant", 1);
        Player player2 = new Player("Ayushi", 2);

        Queue<Player> players = new LinkedList<>();
        players.offer(player1);
        players.offer(player2);
        Map<String, Integer> playerAndPosition = new HashMap<>();
        playerAndPosition.put("Prashant", 0);
        playerAndPosition.put("Ayushi", 0);
        GameBoard gameBoard = new GameBoard(dice, players, snakeList, ladder, playerAndPosition, 100);
        gameBoard.startGame();

    }
}
