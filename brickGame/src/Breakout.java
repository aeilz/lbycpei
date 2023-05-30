/* Starter file for Breakout */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Breakout extends GraphicsProgram{

    /**
     * Width and height of application window in pixels
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 620;

    /**
     * Number of bricks per row
     */
    public static final int NBRICKS_PER_ROW = 10;

    /**
     * Number of rows of bricks
     */
    private static final int NBRICK_ROWS = 10;

    /**
     * Height of a brick
     */
    public static final int BRICK_HEIGHT = 10;

    /**
     * Separation between bricks
     */
    private static final int BRICK_SEP = 4;

    /**
     * Width of a brick
     */
    private static final int BRICK_WIDTH
            = (APPLICATION_WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;


    /**
     * Dimensions of the paddle
     */
    public static final int PADDLE_WIDTH = 60;
    public static final int PADDLE_HEIGHT = 10;

    /**
     * Radius of the ball in pixels
     */
    public static final int BALL_RADIUS = 10;

    public GRect paddle;
    public GOval ball;

    public void mouseMoved(MouseEvent me) {
        paddle.setLocation(me.getX(), paddle.getY());
    }

    public void init() {

        addMouseListeners();

        paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setColor(Color.black);
        add(paddle, 170, 570);

        for (int i = 0; i <= NBRICKS_PER_ROW; i++) {
            int dx = (BRICK_WIDTH + BRICK_SEP) * i;
            for (int j = 1; j <= NBRICK_ROWS; j++) {
                int dy = (BRICK_HEIGHT + BRICK_SEP) * j + 70;
                GRect bricks = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                bricks.setFilled(true);
                if (j<=2){
                    bricks.setColor(Color.RED);
                } else if (j>2 && j<=4) {
                    bricks.setColor(Color.ORANGE);
                } else if (j>4 && j<=6) {
                    bricks.setColor(Color.YELLOW);
                } else if (j>6 && j<=8) {
                    bricks.setColor(Color.GREEN);
                } else if (j>8 && j<=10) {
                    bricks.setColor(Color.CYAN);
                }
                add(bricks, dx, dy);
            }
        }

        ball = new GOval(BALL_RADIUS, BALL_RADIUS);
        ball.setFilled(true);
        ball.setColor(Color.black);
        add(ball, 185,330);

    }
    public void run(){
        while(true){
            ball.move(0,3);
            pause(10);
        }
    }

    public static void main(String[] args){
        (new Breakout()).start(args);
    }

}
