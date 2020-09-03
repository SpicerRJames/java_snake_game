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
    //Defines the size of the board
    private final int boardWidth = 300;
    private final int boardHeight = 300;

    //Defines the size of the dots
    private final int dotSize = 10;
    private final int allDots = 900;

    //This defines the random placement of the apples for the game
    private final int randomApplePosition = 29;

    //Determnines the speed of the game
    private final int Delay = 140;
    
}
