import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }


    // Defines the size of the board
    private final int boardWidth = 300;
    private final int boardHeight = 300;

    //Defines the size of the dots
    private final int dotSize = 10;
    private final int allDots = 900;

    //This defines the random placement of the apples for the game
    private final int randomApplePosition = 29;

    //Determnines the speed of the game
    private final int Delay = 140;

    //These two variable from the x and y coordinates of all the snake joints (dots)
    private final int x[] = new int[allDots];
    private final int y[] = new int[allDots]; 

    private int dots;
    private int apple_x;
    private int apple_y;

   
   //Variable for controlling the snake's direction in the game.
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;

    private Timer timer;
    private Image dot;
    private Image apple;
    private Image head;

    public Board() {
        
        initBoard();
    }

    //This method will get the images for the game 
    private void loadImage() {
        ImageIcon dotPng =  new ImageIcon("src/resources/dot.png");
        dot = dotPng.getImage();

        ImageIcon applePng =  new ImageIcon("src/resources/apple.png");
        apple = applePng.getImage();

        ImageIcon headPng =  new ImageIcon("src/resources/head.png");
        head = headPng.getImage();
    }

    //This is the method that will lkocate the apple
    private void locateApple() {

        int r = (int) (Math.random() * randomApplePosition);
        apple_x = ((r * dotSize));

        r = (int) (Math.random() * randomApplePosition);
        apple_y = ((r * dotSize));
    }


    //This method creates the snake, and will randomly locate a apple on the game board at the start of the game
    private void initGame() {
        dots = 3;

        for (int i = 0; i < dots; i++){
            x[i] = 50 - i * 10;
            y[i] = 50;
        }

        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
        

    }

    //This method checks if the head of the snake hits a apple and will add another dot to the snake
    private void checkApple() {
        if((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            locateApple();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    
}
