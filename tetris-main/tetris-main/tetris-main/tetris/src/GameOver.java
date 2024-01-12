import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOver extends JFrame {
    private JLabel gameOver;
    private JButton closeGameButton;

    public GameOver(Board b){
        initUI(b.getStatusbar().getText());
    }
    
    public void initUI(String text){
        setTitle("Game over");
        setSize(250, 300);
        setLayout(new FlowLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameOver = new JLabel();
        gameOver.setText(text);
        closeGameButton = new JButton("Close game");

        closeGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        add(closeGameButton);
        add(gameOver);

    }
    

}
