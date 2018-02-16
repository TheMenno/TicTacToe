/**
 * Created by menno_000 on 16-2-2018.
 */

public class Game {
    final private int BOARD_SIZE = 3;
    private Tile[][] board;

    private Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    public Game() {
        board = new Tile[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = Tile.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public Tile draw(int row, int column) {
        /*It has to retrieve the current value of the board at position (row, column).
        If that place is still blank, we can go ahead and fill it.
        if the current player is player one, fill it with a cross
        if the current player is player two, fill it with a croos
        in either case, make sure the other played gets the turn
        also in both cases, make sure to return Tile.CROSS or Tile.CIRCLE to allow the UI to update
        If that place isn’t blank, it’s an invalid move! Just return Tile.INVALID.*/
    }
}
