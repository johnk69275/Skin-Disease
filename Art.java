/*
John Kim
March 7th, 2024 
This Art class uses the DrawingPAnel class to draw a train with two carts.
It uses various shapes and colors as well as creates a track for the train. 
This was done using the various methods that would create the objects on the panel.
  */
package finalProject;

import java.awt.Color;
import java.awt.Graphics;

public class Art {

    public static void main(String[] args) {
        // Creates a DrawingPanel with a width of 900 and height of 400
        DrawingPanel panel = new DrawingPanel(900, 400);

        // Get the Graphics object to draw on the panel
        Graphics g = panel.getGraphics();
        
        //sets the background to sky blue 
        g.setColor(new Color(25, 25, 112));//sets the color to midnight blue
        g.fillRect(0, 0, 900, 400);
        
        // creates the main track for the train
        g.setColor(new Color(128, 70, 27)); //sets the color to brown
        g.fillRect(0, 340, 900, 25);
        
        //this while loop creates the little rails in each track all the way to the end
        int x = 0;
        while (x < 900)
        {
        	g.setColor(new Color(72, 60, 50));
        	g.fillRect(x, 365, 40, 25);
        	x+=80;
        }
        
        //creates the first train body
        g.setColor(Color.RED);
        g.fillRect(50, 115, 350, 200);
        
        //creates the under-side of the first train body
        g.setColor(Color.DARK_GRAY);
        g.fillRect(35, 315, 380, 10);
        g.setColor(Color.BLACK);
        g.drawRect(35, 315, 380, 10);
        
        //creates the wheels of the first train body
        g.setColor(Color.GRAY);
        g.fillOval(100, 275, 75, 75);
        g.fillOval(280, 275, 75, 75);
        g.setColor(Color.BLACK); 
        g.drawOval(100, 275, 75, 75);
        g.drawOval(110, 285, 55, 55);
        g.drawOval(132, 311, 10, 10);
        g.drawOval(280, 275, 75, 75);
        g.drawOval(290, 285, 55, 55);
        g.drawOval(312, 311, 10, 10);
        
        //adds design to the first train body
        g.setColor(Color.BLACK);
        g.fillRect(50, 260, 350, 55);
        
        g.setColor(Color.WHITE);
        g.fillRect(50, 235, 350, 25);
        
        g.setColor(new Color(210, 180, 140));//sets the color to tan
        g.fillRect(40, 100, 370, 15);
        g.setColor(Color.BLACK);
        //this for loop creates black circles which are meant to be bolts on the train
        for (int i = 50; i < 400; i+= 15) 
        {
        	g.fillOval(i, 105, 5, 5);
        }
        
        //outlines the train body in black
        g.setColor(Color.BLACK);
        g.drawRect(50, 115, 350, 200);
        
        //adds the windows and outlines them in black
        g.setColor(new Color(135, 206, 235));//sets the color to sky blue
        g.fillRect(90, 130, 70, 85);
        g.fillRect(190, 130, 70, 85);
        g.fillRect(290, 130, 70, 85);
        g.setColor(Color.BLACK);
        g.drawRect(90, 130, 70, 85);
        g.drawRect(190, 130, 70, 85);
        g.drawRect(290, 130, 70, 85);
        
        //adds the connector of the first and second train carts
        g.setColor(Color.GRAY);
        g.fillRect(400, 300, 80, 15);
        
        //creates the second train body and under-side and the front of the train
        g.setColor(new Color(240,230,140));
        g.fillOval(840, 205, 30, 50);
        g.setColor(Color.BLACK);
        g.fillOval(835, 150, 25, 173);
        g.setColor(Color.RED);
        g.fillRect(480, 115, 150, 200);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(465, 315, 380, 10);
        
        //outlines in black
        g.setColor(Color.BLACK);
        g.drawRect(465, 315, 380, 10);
        g.drawOval(840, 205, 30, 50);
        
        //creates the wheels of the second train body
        g.setColor(Color.GRAY);
        g.fillOval(530, 275, 75, 75);
        g.fillOval(710, 275, 75, 75);
        g.setColor(Color.BLACK);
        g.drawOval(530, 275, 75, 75);
        g.drawOval(540, 285, 55, 55);
        g.drawOval(562, 311, 10, 10);
        g.drawOval(710, 275, 75, 75);
        g.drawOval(720, 285, 55, 55);
        g.drawOval(742, 311, 10, 10);
        
        //adds design to the second train body
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(480, 260, 150, 55);
       
        g.setColor(Color.WHITE);
        g.fillRect(480, 235, 150, 25);
       
        g.setColor(new Color(210, 180, 140)); //sets the color to tan
        g.fillRect(470, 100, 170, 15);
        g.setColor(Color.BLACK);
        //this for loop adds the bolts 
        for (int i = 480; i < 640; i+= 15) {
        	g.fillOval(i, 105, 5, 5);
        }
        
        //adds to the body of the second train
        g.fillRect(780, 90, 40, 60);
        g.drawRect(480, 115, 150, 200);
        g.setColor(new Color(69, 69, 69));//sets the color to dark gray
        g.fillRect(630, 200, 100, 115);
        g.setColor(Color.BLACK);
        g.drawRect(630, 200, 100, 115);
        g.setColor(Color.RED);
        g.fillRect(730, 150, 115, 165);
        g.setColor(Color.BLACK);
        g.drawRect(730, 150, 115, 165);
        
        //adds the windows
        g.setColor(new Color(135, 206, 235));//sets the color to sky blue
        g.fillRect(520, 130, 70, 85);
        
        //adds the chimney
        g.setColor(Color.BLACK);
        g.drawRect(520, 130, 70, 85);
    }

    
}
