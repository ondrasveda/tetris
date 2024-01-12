import javax.swing.*;
import java.awt.*;

public class Controls extends JFrame {
    private JLabel controlLabel;

    public Controls(){
        initUI();
    }

    public void initUI() {
        setTitle("controls");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setResizable(false);
        controlLabel = new JLabel("<html>CONTROLS: " +
                "<br>Move left - left arrow key " +
                "<br>Move right - right arrow key " +
                "<br>Rotate left - up arrow key " +
                "<br>Rotate right - down arrow key " +
                "<br>Place brick down - space " +
                "<br>Pause - P");
        add(controlLabel);
    }
}
