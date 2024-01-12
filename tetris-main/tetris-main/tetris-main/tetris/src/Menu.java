import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{


    private JButton startGameButton;
    private JButton controlsButton;
    private JButton howToPlayButton;

    public Menu(){
        initUI();
    }
    public void initUI(){
        setTitle("Tetris Main menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(175, 200);
        setLayout(new FlowLayout());
        setResizable(false);

        startGameButton = new JButton("Play tetris");
        controlsButton = new JButton("Controls");
        howToPlayButton = new JButton("How to play");

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> {

                    var game = new Tetris();
                    game.setVisible(true);
                });
                dispose();
            }
        });
        controlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> {

                    var game = new Controls();
                    game.setVisible(true);
                });
            }
        });
        howToPlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> {

                    var game = new HowToPlay();
                    game.setVisible(true);
                });
            }
        });


        add(startGameButton);
        add(controlsButton);
        add(howToPlayButton);
    }
}
