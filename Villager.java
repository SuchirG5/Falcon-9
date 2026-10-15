import java.awt.*;

public abstract class Villager 
{
    protected int pixelHeight;
    protected int xPos;
    protected int yPos;
    protected int health;




    protected Villager(int x, int y, int p) 
    {
        xPos = x;
        yPos = y;
        pixelHeight = p;
        health = 1500;
    }

    public abstract void drawVillager(Graphics g); 

    public int getHealth() 
    {
        return this.health;
    }

    public void setHealth(int health) 
    {
        this.health = health;
    }

    public void setPixelHeight(int pixelHeight)
    {
        this.pixelHeight = pixelHeight;
    }

    public void setXPos(int x)
    {
        this.xPos = x;
    }

    public void setYPos(int y)
    {
        this.yPos = y;
    }

    public int getPixelHeight() 
    {
        return pixelHeight;
    }

    public int getXPos() 
    {
        return xPos;
    }

    public int getYPos() 
    {
        return yPos;
    }

    public void drawPixels(int x, int y, int width, int height, Color c, Graphics g) 
    {
        g.setColor(c);
        g.fillRect(xPos+x*pixelHeight, yPos+y*pixelHeight, width*pixelHeight, height*pixelHeight);
    }

    public void move(int speed, int leftEdge, int rightEdge)
    {
        this.xPos+=speed;
        if(xPos>=rightEdge || xPos<= leftEdge)
        {
            speed *= -1;
        }
        
    }

}
