import java.awt.*;

import javax.swing.ImageIcon;

public class Rocket 
{
    private double xPos;
    private double yPos;
    private double ySpeed;
    private Color lightBlack = new Color(94, 94, 94);
    public double height;
    public double  width;
    ImageIcon imageIcon;

    public Rocket(int x, int y, int speed, int width, int height)
    {
        xPos = x;
        yPos = y;
        ySpeed = speed;
        this.height = height;
        this.width = width;
    }

    public void drawRocket(Graphics g)
    {
        //Casted variables 
        int xPos = (int) this.xPos;
        int yPos = (int) this.yPos;
        int width = (int) this.width;
        int height = (int) this.height;

        //Top cone
        g.setColor(lightBlack);
        int[] xPoints = {xPos, xPos - width/2, xPos + width/2};
        int[] yPoints = {yPos-125, yPos+(height-250), yPos+(height-250)};
        g.fillPolygon(xPoints, yPoints, xPoints.length);

        //Body
        g.setColor(Color.white);
        g.fillRect(xPos-width/2, yPos+(height-250), width, height-60);

        //Window
        g.setColor(new Color(191, 252, 255));
        g.fillOval(xPos-width/4, yPos-100, width/2, width/2);
        
        //Fins
        g.setColor(lightBlack);
        int[] xPoints2 = {xPos-width/2, xPos-width, xPos-width/2};
        int[] yPoints2 = {yPos+height-205, yPos+height-165, yPos+height-165};
        g.fillPolygon(xPoints2, yPoints2, xPoints2.length);
        int[] xPoints3 = {xPos+width/2, xPos+width, xPos+width/2};
        g.fillPolygon(xPoints3, yPoints2, xPoints2.length);

        //Text
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        g.drawString("The", xPos-width/2, yPos+(width/2)-50);
        g.drawString("ROCKet", xPos-width/2, yPos+(width/2)-35);

        //Image
        imageIcon = new ImageIcon("theRockMeme.jpg");
        g.drawImage(imageIcon.getImage(),(int)(xPos-(width/2)+4), (int)(yPos+height/2 - 150), 
                    (int)width-10, (int)height/5, null);

        //Flame
        g.setColor(new Color(230, (int)(Math.random()*30 + 100), 0));
        int[] flameXPoints = {(int)xPos - 21, (int)xPos, (int) (xPos+20)};
        int[] flameYPoints = {(int)yPos - 10, (int)((Math.random()*65) + (yPos)), (int)yPos - 10};
        g.fillPolygon(flameXPoints, flameYPoints, 3);

       
    }

    //Move method
    public void move(int HEIGHT)
    {
        yPos-=ySpeed;
        if(yPos+height+100 == 0)
        {
            yPos = Liftoff.HEIGHT;
        }
    }

    //Getters and Setters
    public double getXPos()
    {
        return xPos;
    }
    public double getYPos()
    {
        return yPos;
    }
    public double getYSpeed()
    {
        return ySpeed;
    }
    public void setX(int xPos)
    {
        this.xPos = xPos;
    }
    public void setY(double yPos)
    {
        this.yPos = yPos;
    }
    public void setYSpeed(double ySpeed)
    {
        this.ySpeed = ySpeed;
    }




}
