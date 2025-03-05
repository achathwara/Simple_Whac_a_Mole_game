import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Game2 {
    JFrame frame = new JFrame("Whack A Mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    JButton[] board = new JButton[9];
    JPanel boardPanel = new JPanel();

    ImageIcon animalIcon;
    ImageIcon hammerIcon;

    JButton currentAnimeTile;
    JButton currentHammerTile;

    Random random = new Random();

    Timer setAnimeTimer;
    Timer setHammerTimer;

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

        //Image Icons
        //animalIcon = new ImageIcon(getClass().getResource("./animal.png"));
        Image animeImg = new ImageIcon(getClass().getResource("./animal.png")).getImage();
        animalIcon = new ImageIcon(animeImg.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

        Image hammerImg = new ImageIcon(getClass().getResource("./hammer.png")).getImage();
        hammerIcon = new ImageIcon(hammerImg.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

        boardPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i<9; i++){
            JButton tile = new JButton();
            board[i] = tile;
            boardPanel.add(tile);
            tile.setIcon(animalIcon);
            //tile.setIcon(hammerIcon);
            tile.setFocusable(false);
            frame.add(boardPanel);
        }

        //Timer
        setAnimeTimer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(currentAnimeTile != null){
                    currentAnimeTile.setIcon(null);
                    currentAnimeTile = null;
                }
                int num = random.nextInt(9);    //if it choose 5
                JButton tile = board[num];

                tile.setIcon(animalIcon);
                currentAnimeTile = tile;
            }
        });
        setAnimeTimer.start();

        frame.setVisible(true);
    }
}
