import java.awt.*;

public class Star 
{
    private int x;
    private int y;
    private int speed;

    public Star(int x, int y)
    {
        this.x = x;
        this.y = y;
        speed = (int)(Math.random()*8 + 2);
    }

    public Star(int x, int y, int speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    //Getters and Setters
    public int getX() 
    {
        return this.x;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    public int getSpeed() 
    {
        return this.speed;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    //Draw Method
    public void drawStar(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 3, 3);
        g.fillOval(x, y+5, 3, 3);
        g.fillOval(x, y+10, 3, 3);
    }

    //Move Method
    public void move(int HEIGHT)
    {
        y += speed;
        if(y>HEIGHT+10)
        {
            y = -20;
        }
    }
}
