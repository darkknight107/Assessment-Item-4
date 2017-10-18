package src.Tests;
import src.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class PlayerTest {
    Player player;
    Game game1;
    DiceValue diceValue;
    Player player1= new Player("Rick", 100);
    int winnings;
    @Before
    public void setUp() throws Exception {
        player= mock(Player.class);
        game1= mock(Game.class);

    }

    @Test
    public void getBalance() throws Exception {
        winnings= game1.playRound(player1, DiceValue.getRandom(), 5);
        if(winnings > 0){
            Assert.assertEquals(105, player1.getBalance());
        }
        else{
            Assert.assertEquals(95, player1.getBalance());
        }
    }
}