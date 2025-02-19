import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame jFrame = new JFrame();
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    JButton[] board = new JButton[9];
    JPanel boardPanel = new JPanel();
    public Game() {
                //JFrame

        frame.setSize(600, 700);       //managing size
        //

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);     //to disable the sizing icon
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close with exit key

        frame.setLayout(new BorderLayout());       //North, South, East, West, Center

        //JLabel
        textLabel.setText("Score : 00");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 40));

        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        //Buttons
        boardPanel.setLayout(new GridLayout(3,3));

        for(int i = 1; i < 9; i++){
            JButton tile = new JButton();
            board[i] = tile;
            boardPanel.add(tile);
            frame.add(boardPanel);
        }

        frame.setVisible(true);        //to visibly run






    }
}
