import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.*;

public class PHFlag extends GraphicsProgram {

    public void run(){
        GStar star = new GStar(25,50,33);
        star.setFilled(true);
        star.setColor(Color.ORANGE);
        add(star);

        GStar star2 = new GStar(25,420,33);
        star2.setFilled(true);
        star2.setColor(Color.ORANGE);
        add(star2);

        GStar star3 = new GStar(325,234,33);
        star3.setFilled(true);
        star3.setColor(Color.ORANGE);
        add(star3);

        GOval sun = new GOval(88, 195, 90,90);
        sun.setFilled(true);
        sun.setColor(Color.ORANGE);
        add(sun);

        GLine line = new GLine(135,140,135,335);
        line.setColor(Color.ORANGE);
        add(line);

        GLine line2 = new GLine(35,240,230,240);
        line2.setColor(Color.ORANGE);
        add(line2);

        GLine line3 = new GLine(90,200,185,290);
        line3.setColor(Color.ORANGE);
        add(line3);

        GLine line4 = new GLine(90,200,185,290);
        line4.setColor(Color.ORANGE);
        add(line4);

        GPoint[] bluepoints = new GPoint[4];
        bluepoints[0] = new GPoint ( 0, 0);
        bluepoints[1] = new GPoint (this.getWidth(), 0);
        bluepoints[2] = new GPoint (this.getWidth(), this.getHeight()/2);
        bluepoints[3] = new GPoint(this.getWidth()/2,this.getHeight()/2);

        GPolygon blue = new GPolygon (bluepoints);
        blue.setFilled(true);
        blue.setColor (Color.BLUE);
        add(blue);

        GPoint[] bluepoints2 = new GPoint[4];
        bluepoints2[0] = new GPoint ( 0, this.getHeight());
        bluepoints2[1] = new GPoint (this.getWidth(), this.getHeight());
        bluepoints2[2] = new GPoint (this.getWidth(), this.getHeight()/2);
        bluepoints2[3] = new GPoint(this.getWidth()/2,this.getHeight()/2);

        GPolygon red = new GPolygon (bluepoints2);
        red.setFilled(true);
        red.setColor (Color.RED);
        add(red);

    }

        public static void main(String[] args){
        (new PHFlag()).start(args);
    }

}