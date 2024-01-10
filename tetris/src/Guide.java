import javax.swing.*;
import java.awt.*;

public class Guide extends JFrame{

    private JLabel controlLabel;
    private JLabel howToPlay;

    public Guide(){
        initUI();
    }
    public void initUI(){
        setTitle("How to play");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setResizable(false);
        howToPlay = new JLabel("<html>HOW TO PLAY: " +
                "<br>In Tetris, players complete lines by moving <br>differently shaped pieces, which descend onto the playing field. " +
                "<br>The completed lines disappear and grant the player <br>points, and the player can proceed to fill the vacated spaces. " +
                "<br>The game ends when the uncleared lines reach <br>the top of the playing field.");
        controlLabel = new JLabel("<html>CONTROLS: " +
                "<br>Move left - left arrow key " +
                "<br>Move right - right arrow key " +
                "<br>Rotate left - up arrow key " +
                "<br>Rotate right - down arrow key " +
                "<br>Place brick down - space " +
                "<br>Pause - P");
        add(howToPlay);
        add(controlLabel);
    }
}
