package lld;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

public class GameBoard {

    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Jumper> snake;
    private List<Jumper> lader;
    private Map<String, Integer> playerAndPosition;
    private int boardSize;

    public GameBoard(Dice dice, Queue<Player> nextTurn, List<Jumper> snake, List<Jumper> lader, Map<String, Integer> playerAndPosition, int boardSize) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snake = snake;
        this.lader = lader;
        this.playerAndPosition = playerAndPosition;
        this.boardSize = boardSize;
    }

   public void startGame(){
        while (nextTurn.size() > 1 ){
            Player player = nextTurn.poll();
            int currentPosition = playerAndPosition.get(player.getName());
            int rollDice = dice.roll();
            int nextCell = currentPosition + rollDice;
            if (nextCell > boardSize) nextTurn.offer(player);
            else if (nextCell == boardSize) {
                System.out.println(player.getName() + " won the game");
            }else {
                int[] nextPosition = new int[1];
                boolean[] b = new boolean[1];
                nextPosition[0] = nextCell;
                snake.stream()
                        .forEach( s-> {
                                    if (s.getStart() == nextCell) {
                                        nextPosition[0] = s.getEnd();
                                    }
                                }
                        );
                if (nextPosition[0] != nextCell) System.out.println(player.getName() + " beaten by snake "+ nextCell);
                lader.stream().forEach(l -> {
                    if (l.getStart() == nextCell) {
                        nextPosition[0] = l.getEnd();
                        b[0] = true;
                    }
                });
                if (nextPosition[0] != nextCell && b[0]) System.out.println(player.getName() + " got ladder...");
                if (nextPosition[0] == boardSize){
                    System.out.println(player.getName() + " won the game...");
                }
                else {
                    playerAndPosition.put(player.getName(), nextPosition[0]);
                    System.out.println(player.getName() + " is in position at "+ nextPosition[0]);
                    nextTurn.offer(player);
                }
            }
        }
    }
}
