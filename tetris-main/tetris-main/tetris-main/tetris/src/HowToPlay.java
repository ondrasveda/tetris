import javax.swing.*;
import java.awt.*;

public class HowToPlay extends JFrame{

    private JLabel howToPlay;

    public HowToPlay(){
        initUI();
    }
    public void initUI(){
        setTitle("How to play");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setResizable(false);
        howToPlay = new JLabel("<html>HOW TO PLAY: " +
                "<br>In Tetris, players complete lines by moving <br>differently shaped pieces, which descend onto the playing field. " +
                "<br>The completed lines disappear and grant the player <br>points, and the player can proceed to fill the vacated spaces. " +
                "<br>The game ends when the uncleared lines reach <br>the top of the playing field.");

        add(howToPlay);
    }
}
