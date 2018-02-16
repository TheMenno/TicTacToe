package com.example.menno_000.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();
    }

    public void tileClicked(View view) {
        /*It has to translate the button into the right coordinates. Use int id = view.getId(); to find out which button it is, and (temporarily) store the corresponding row and column.

        It has to feed those coordinates to the Games draw method:

        Tile tile = game.draw(row, column);
        Depending on the outcome of the draw method, it has to update the selected button. Here’s a starter:

        switch(tile) {
            case CROSS:
                // do something
                break;
            case CIRCLE:
                // do something
                break;
            case INVALID:
                // do something different
                break; */
        }

    resetClicked() {
        game = new Game();

        /*But don’t forget to reset the UI as well!*/
    }
}
