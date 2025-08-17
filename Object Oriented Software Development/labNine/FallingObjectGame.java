// Student ID: C00305107
// Date: 15/02/25
package labNine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class FallingObjectGame extends JPanel implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 400, HEIGHT = 600;
    private final int BASKET_WIDTH = 60, BASKET_HEIGHT = 20;
    private final int OBJECT_SIZE = 20;
    private final int FALL_SPEED = 5;
    
    private int basketX = WIDTH / 2 - BASKET_WIDTH / 2;
    private int score = 0;

    private ArrayList<FallingObject> objects;
    private Timer timer;
    private Random rand;

    public FallingObjectGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        objects = new ArrayList<>();
        rand = new Random();
        timer = new Timer(30, this);
        timer.start();

        // This ensures focus for key events
        setFocusable(true);
        requestFocusInWindow();

        // This is the Add Key Listener for moving the basket
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT && basketX > 0) {
                    basketX -= 20;
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && basketX < WIDTH - BASKET_WIDTH) {
                    basketX += 20;
                }
            }
        });

        // This is the mouse listener to make game restart after mouse click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                restartGame();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw Basket
        g.setColor(Color.BLUE);
        g.fillRect(basketX, HEIGHT - 50, BASKET_WIDTH, BASKET_HEIGHT);

        // Draw Falling Objects
        for (FallingObject obj : objects) {
            g.setColor(obj.isGood ? Color.GREEN : Color.RED);
            g.fillOval(obj.x, obj.y, OBJECT_SIZE, OBJECT_SIZE);
        }

        // Draw Score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Score: " + score, 10, 20);

        // The instruction to restart
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        g.drawString("Click to restart", WIDTH - 120, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This generates new falling objects
        if (rand.nextInt(100) < 10) {  // 10% chance to spawn an object per frame
            boolean isGood = rand.nextBoolean(); // Randomly decide if it's good or bad
            objects.add(new FallingObject(rand.nextInt(WIDTH - OBJECT_SIZE), 0, isGood));
        }

        // This moves objects
        for (int i = 0; i < objects.size(); i++) {
            FallingObject obj = objects.get(i);
            obj.y += FALL_SPEED;

            // Check if object reaches the basket
            if (obj.y >= HEIGHT - 50 && obj.x >= basketX && obj.x <= basketX + BASKET_WIDTH) {
                if (obj.isGood) {
                    score += 10;
                } else {
                    score -= 10;
                }
                objects.remove(i);
                i--;
            }
            // Remove object if it falls off-screen
            else if (obj.y > HEIGHT) {
                objects.remove(i);
                i--;
            }
        }
        repaint();
    }

    /**
     * Restarts the game when the mouse is clicked.
     */
    private void restartGame() {
        score = 0;
        objects.clear();
        basketX = WIDTH / 2 - BASKET_WIDTH / 2;
        repaint();
        requestFocusInWindow(); // Ensures key events work after restarting
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Falling Object Game");
        FallingObjectGame game = new FallingObjectGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Ensures the panel gets focus when the window opens
        game.requestFocusInWindow();
    }
}

/**
 * Class representing a falling object.
 */
class FallingObject {
    int x, y;
    boolean isGood;

    public FallingObject(int x, int y, boolean isGood) {
        this.x = x;
        this.y = y;
        this.isGood = isGood;
    }
}

/*
 * error log:
 * 1. Was unable to get the addMouseListener function to work. 
 * 	I fixed it with 'import java.awt.event.MouseAdapter' and 'import java.awt.event.MouseEvent' 
 * */
