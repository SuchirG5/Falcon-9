import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Falcon10Liftoff extends JPanel
{
    private static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    //Fields
    private BufferedImage image;
    private Graphics g;
    private Timer timer;
    private Falcon10 sus;
    private FalconHeavy susHeavy;
    private Farmer f1;
    private Farmer f2; 
    private Star[] stars;
    ImageIcon imageIcon;
    int a = 10;

    //Constructor
    public Falcon10Liftoff() 
    {
        //Initializing objects
        image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = image.getGraphics();
        sus = new Falcon10(520, 160, 0, 40, 150, 0.2);
        susHeavy = new FalconHeavy(420, 160, 0, 40, 150, 0.2);
        imageIcon = new ImageIcon("theRockMeme.jpg");
        f1 = new Farmer(630, 660, 3);
        f2 = new Farmer(680, 680, 3);
        stars = new Star[200];
        for(int i = 0; i < stars.length; i++)
        {
            stars[i] = new Star(i*(WIDTH/stars.length), (int)(Math.random()*HEIGHT));
        }


        //Timer
        timer = new Timer(5, new TimerListener());
        timer.start();

    }

    //TimerListener class that is called repeatedly by the timer
    private class TimerListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            Graphics2D g2D = (Graphics2D) g;

            //Background
            g2D.setColor(new Color(33, 33, 33));
            g2D.fillRect(0, 0, WIDTH, HEIGHT);

            //Stage 1 & 2 borders
            g.setColor(new Color(213, 92, 252));
            drawDashedLine(g, 150, 590, WIDTH, 590);
            drawDashedLine(g, 150, 630, WIDTH, 630);
            drawDashedLine(g, 150, 18, WIDTH, 18);
            drawDashedLine(g, 150, 432, WIDTH, 432);
            g.setFont(new Font("courier", Font.ITALIC, 15));
            g.drawString("Stage 1 (F10)", 25, 634);
            g.drawString("Stage 1 (FH)", 25, 594);
            g.drawString("Stage 2 (F10)", 25, 436);
            g.drawString("Stage 2 (FH)", 25, 22);

             //Scene
             drawScene(g);

            //Drawing both rockets + moving them
            sus.drawRocket(g);
            susHeavy.drawRocket(g);
            sus.move(HEIGHT);
            susHeavy.move(HEIGHT);

            //Villagers
            f1.drawVillager(g);
            f2.drawVillager(g);

            //Data
            printData(g);

            repaint(); 
        }
        
    }

    public void printData(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.WHITE);
        g2D.setFont(new Font("courier", Font.BOLD, 40));
        g2D.drawString("FALCON 10: ", 38, 90);
        g2D.drawString("FALCON HEAVY: ", 38, 265);

        g2D.setFont(new Font("courier", Font.BOLD, 12));
        g2D.drawString("(RIGHT)", 38, 105);
        g2D.drawString("(LEFT)", 38, 280);

        g2D.setFont(new Font("courier", Font.PLAIN, 17));
        g2D.drawString("Time: " + (int)sus.getTime(), 40, 125);
        g2D.drawString("Altitude: " + (int)sus.getAltitude(), 40, 155);
        g2D.drawString("Velocity: " + (int)sus.getYSpeed(), 40, 185);
        
        g2D.drawString("Time: " + (int)susHeavy.getTime(), 40, 300);
        g2D.drawString("Altitude: " + (int)susHeavy.getAltitude(), 40, 330);
        g2D.drawString("Velocity: " + (int)susHeavy.getYSpeed(), 40, 360);
        
    }

    public void drawScene(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;

        //Stars
        for(int i = 0; i < stars.length; i++)
        {
            stars[i].drawStar(g);
            stars[i].move(HEIGHT);
        }

        //Earth
        g2D.setColor(new Color(0, 186, 215));
        g2D.fillOval(100, HEIGHT-90, 800, 500);
        g2D.setColor(new Color(2, 189, 36));
        int[] landXPoints = {425, 500, 550, 300, 260};
        int[] landYPoints = {725, 750, 795, 795, 780};
        g2D.fillPolygon(landXPoints, landYPoints, landXPoints.length);
        int[] land2XPoints = {615, 705, 725, 630, 605};
        int[] land2YPoints = {730, 745, 795, 795, 780};
        g2D.fillPolygon(land2XPoints, land2YPoints, land2XPoints.length);
    }

    public void drawDashedLine(Graphics g, int x1, int y1, int x2, int y2)
    {
        // Create a copy of the Graphics instance
        Graphics2D g2d = (Graphics2D) g;
      
        // Set the stroke of the copy, not the original 
        Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                                        0, new float[]{9}, 0);
        g2d.setStroke(dashed);
      
        // Draw to the copy
        g2d.drawLine(x1, y1, x2, y2);
    }


    @Override
    public void paintComponent(Graphics g) 
    {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    //main method with standard graphics code
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("ROCKets");
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new Falcon10Liftoff()); 
        frame.setVisible(true);
    }

}
