import javax.swing.*;
import java.awt.*;

public class Game2 {
    JFrame frame = new JFrame("Whack A Mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    JButton[] board = new JButton[9];
    JPanel boardPanel = new JPanel();

    public Game2() {

        frame.setSize(600, 650);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setText("Score : 00");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i<9; i++){
            JButton tile = new JButton();
            board[i] = tile;
            boardPanel.add(tile);
            frame.add(boardPanel);



        }
        frame.setVisible(true);
    }
}
