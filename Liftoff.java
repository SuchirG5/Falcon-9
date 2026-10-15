    import java.awt.*;
    import java.awt.event.*;

    import javax.swing.*;
    import java.awt.image.BufferedImage;

public class Liftoff extends JPanel
{
	private static final int WIDTH = 600;
	public static final int HEIGHT = 600;

	//required global variables
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private Rocket rocket; 
    ImageIcon imageIcon;

	//Constructor required by BufferedImage
	public Liftoff() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		rocket = new Rocket(300, 400, 2, 40	, 150);
        
        imageIcon = new ImageIcon("theRockMeme.jpg");
		
		
		//set up and start the Timer
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

            
            // background
            GradientPaint blueToGreen = new GradientPaint(0, 0, new Color(8, 0, 61), 0, HEIGHT, new Color(0, 181, 145));
            g2D.setPaint(blueToGreen);
            g2D.fillRect(0, 0, WIDTH, HEIGHT);

            g.setColor(new Color(255, 255, 255));
		    for (int i = 0; i < WIDTH; i += 2) 
		    {
			    int randY = (int) (Math.random() * HEIGHT);
			    g.fillRect(i, randY, 2, 2);
		    }
            
            rocket.drawRocket(g);
			
            rocket.move(3);
            
            double rXPOS = rocket.getXPos();
            double rYPOS = rocket.getYPos();
            g.drawImage(imageIcon.getImage(),(int)(rXPOS-(rocket.width/2)+4), (int)(rYPOS+rocket.height/2), 
						(int)rocket.width-10, (int)rocket.height/5, null);
			
			repaint(); //leave this alone, it MUST  be the last thing in this method
		}
		
	}

	//do not modify this
    @Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animation Shell");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setContentPane(new Liftoff()); 
		frame.setVisible(true);
	}

}
