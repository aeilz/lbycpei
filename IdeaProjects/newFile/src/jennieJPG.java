import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class HelloACMgraphics extends GraphicsProgram {

    public void run() {
        GRect rect = new GRect(175, 150);
        rect.setColor(Color.CYAN);
        rect.setFilled(true);
        add(rect, 50, 50);

        GTurtle turt = new GTurtle(50, 50);
        add(turt, 70, 73);

        GLabel label = new GLabel("Hello Eliza!!!");
        label.setColor(Color.BLACK);
        add(label, 100, 100);
    }

    public static void main(String[] args) {
        (new HelloACMgraphics()).start(args);
    }

}