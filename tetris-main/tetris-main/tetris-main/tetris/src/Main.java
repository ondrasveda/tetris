import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Menu();
            game.setVisible(true);
        });
    }

}


