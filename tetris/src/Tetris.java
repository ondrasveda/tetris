import java.awt.*;
import javax.swing.*;

public class Tetris extends JFrame {


    private JLabel statusbar;


    public Tetris() {
        initUI();
    }


    public void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setResizable(false);
        setTitle("Tetris Game");
        setSize(500, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusBar() {

        return statusbar;
    }


}
