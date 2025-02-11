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
        jFrame.setVisible(true);        //to visibly run
        jFrame.setSize(600, 650);       //managing size
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close with exit key

        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);     //to disable the sizing icon

        jFrame.setLayout(new BorderLayout());       //North, South, East, West, Center

        //JLabel
        textLabel.setText("Score : 00");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 40));

        textPanel.add(textLabel);
        jFrame.add(textPanel);







    }
}
