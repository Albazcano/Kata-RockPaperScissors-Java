package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Paper;

import org.junit.Test;


public class GameTest {
    
    @Test
    public void rock_win_scissors() {
        Game game = new Game();

        Rock player1= new Rock();
        Scissors player2 = new Scissors();

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Rock wins", result);
    }

    @Test
    public void rock_win_scissors_reverse() {
        Game game = new Game();

        Scissors player1= new Scissors();
        Rock player2 = new Rock();

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Rock wins", result);
    }

    @Test
    public void paper_win_rock() {
        Game game = new Game();

        Paper player1= new Paper();
        Rock player2 = new Rock();

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Paper wins", result);
    }

    @Test
    public void paper_win_rock_reverse() {
        Game game = new Game();

        Rock player1= new Rock();
        Paper player2 = new Paper();

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Paper wins", result);
    }

    @Test
    public void scissors_win_paper() {
        Game game = new Game();

        Scissors player1= new Scissors();
        Paper player2 = new Paper();

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Scissors wins", result);
    }

    @Test
    public void scissors_win_paper_reverse() {
        Game game = new Game();

        Paper player1 = new Paper();
        Scissors player2= new Scissors();
        

        String result = game.play(player1.getName(), player2.getName());

        assertEquals("Scissors wins", result);
    }
}
