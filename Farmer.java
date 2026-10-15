import java.awt.*;

public class Farmer extends Villager 
{
    protected static final Color[] hatColors = { new Color(169, 149, 14), new Color(177, 164, 74),
            new Color(136, 104, 10), new Color(96, 46, 9) };
    protected static final Color[] faceColors = { new Color(212, 166, 123), new Color(147, 110, 75),
            new Color(194, 145, 99) };
    protected static final Color[] eyeColors = { new Color(153, 229, 80), new Color(225, 225, 225),
            new Color(56, 37, 17) };
    protected static final Color[] suitColors = { new Color(112, 87, 81), new Color(85, 65, 60),
            new Color(60, 42, 36) };
    protected static final Color[] beltColors = { new Color(100, 40, 4), new Color(74, 74, 74),
            new Color(50, 235, 203) };
    protected static final Color[] shoeColors = { new Color(72, 38, 26), new Color(84, 85, 87),
            new Color(131, 127, 126) };

    public Farmer(int x, int y, int p) 
    {
        super(x, y, p);
    }

    public void drawHat(Graphics g) 
    {
        // Row 1
        g.setColor(hatColors[0]);
        g.fillRect(xPos, yPos, 2 * pixelHeight, pixelHeight);
        g.setColor(hatColors[1]);
        g.fillRect(xPos + (2 * pixelHeight), yPos, 6 * pixelHeight, pixelHeight);
        g.setColor(hatColors[0]);
        g.fillRect(xPos + (8 * pixelHeight), yPos, pixelHeight, pixelHeight);

        // Row 2
        g.setColor(hatColors[1]);
        g.fillRect(xPos, yPos + pixelHeight, pixelHeight, pixelHeight);
        g.setColor(hatColors[0]);
        g.fillRect(xPos + pixelHeight, yPos + pixelHeight, pixelHeight * 7, pixelHeight);
        g.setColor(hatColors[1]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + pixelHeight, pixelHeight, pixelHeight);

        // Row 3
        g.setColor(hatColors[1]);
        g.fillRect(xPos, yPos + 2 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(hatColors[2]);
        g.fillRect(xPos + pixelHeight, yPos + 2 * pixelHeight, pixelHeight * 7, pixelHeight);
        g.setColor(hatColors[3]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 2 * pixelHeight, pixelHeight, pixelHeight);

        // Row 4 + 5
        g.setColor(hatColors[3]);
        g.fillRect(xPos, yPos + 3 * pixelHeight, pixelHeight * 9, pixelHeight);
        g.setColor(hatColors[0]);
        g.fillRect(xPos - 3 * pixelHeight, yPos + 4 * pixelHeight, pixelHeight * 15, pixelHeight);

    }

    public void drawFace(Graphics g) 
    {
        // Row 6
        g.setColor(faceColors[1]);
        g.fillRect(xPos, yPos + 5 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + pixelHeight, yPos + 5 * pixelHeight, pixelHeight * 7, pixelHeight);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 5 * pixelHeight, pixelHeight, pixelHeight);

        // Row 7
        g.fillRect(xPos, yPos + 6 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(eyeColors[2]);
        g.fillRect(xPos + pixelHeight, yPos + 6 * pixelHeight, pixelHeight * 6, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + 7 * pixelHeight, yPos + 6 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 6 * pixelHeight, pixelHeight, pixelHeight);

        // Row 8
        g.fillRect(xPos, yPos + 7 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(eyeColors[1]);
        g.fillRect(xPos + pixelHeight, yPos + 7 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(eyeColors[0]);
        g.fillRect(xPos + pixelHeight * 2, yPos + 7 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + 3 * pixelHeight, yPos + 7 * pixelHeight, pixelHeight * 2, pixelHeight);
        g.setColor(eyeColors[0]);
        g.fillRect(xPos + pixelHeight * 5, yPos + 7 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(eyeColors[1]);
        g.fillRect(xPos + pixelHeight * 6, yPos + 7 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + pixelHeight * 7, yPos + pixelHeight * 7, pixelHeight, pixelHeight);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + pixelHeight * 8, yPos + pixelHeight * 7, pixelHeight, pixelHeight);

        // Row 9
        g.setColor(faceColors[1]);
        g.fillRect(xPos, yPos + pixelHeight * 8, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + pixelHeight, yPos + pixelHeight * 8, pixelHeight * 2, pixelHeight);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + pixelHeight * 3, yPos + pixelHeight * 8, pixelHeight * 2, pixelHeight * 3);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + pixelHeight * 5, yPos + pixelHeight * 8, pixelHeight * 3, pixelHeight);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + pixelHeight * 8, yPos + pixelHeight * 8, pixelHeight, pixelHeight);

        // Row 10
        g.fillRect(xPos, yPos + pixelHeight * 9, pixelHeight, pixelHeight);
        g.setColor(faceColors[2]);
        g.fillRect(xPos + pixelHeight, yPos + pixelHeight * 9, pixelHeight, pixelHeight * 2);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + pixelHeight * 2, yPos + pixelHeight * 9, pixelHeight, pixelHeight);
        g.fillRect(xPos + pixelHeight * 5, yPos + pixelHeight * 9, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + pixelHeight * 6, yPos + pixelHeight * 9, pixelHeight, pixelHeight);
        g.setColor(faceColors[2]);
        g.fillRect(xPos + pixelHeight * 7, yPos + pixelHeight * 9, pixelHeight, pixelHeight * 2);
        g.setColor(faceColors[1]);
        g.fillRect(xPos + pixelHeight * 8, yPos + pixelHeight * 9, pixelHeight, pixelHeight);

        // Row 11
        g.setColor(suitColors[0]);
        g.fillRect(xPos, yPos + pixelHeight * 10, pixelHeight, pixelHeight);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + 2 * pixelHeight, yPos + 10 * pixelHeight, pixelHeight, pixelHeight);
        g.fillRect(xPos + 5 * pixelHeight, yPos + 10 * pixelHeight, pixelHeight * 2, pixelHeight);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 10 * pixelHeight, pixelHeight * 2, pixelHeight);

        // Row 12
        g.fillRect(xPos - pixelHeight, yPos + 11 * pixelHeight, pixelHeight * 3, pixelHeight * 4);
        g.setColor(faceColors[0]);
        g.fillRect(xPos + 2 * pixelHeight, yPos + 11 * pixelHeight, pixelHeight * 5, pixelHeight);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 7 * pixelHeight, yPos + 11 * pixelHeight, pixelHeight * 4, pixelHeight);

    }

    public void drawSuit(Graphics g) 
    {
        // Row 13
        g.setColor(suitColors[1]);
        g.fillRect(xPos - 2 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight, pixelHeight * 2);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 2 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(faceColors[2]);
        g.fillRect(xPos + 3 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 6 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.setColor(suitColors[1]);
        g.fillRect(xPos + 9 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight, pixelHeight * 3);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 10 * pixelHeight, yPos + 12 * pixelHeight, pixelHeight, pixelHeight * 3);

        // Row 14
        g.setColor(suitColors[1]);
        g.fillRect(xPos - 3 * pixelHeight, yPos + 13 * pixelHeight, pixelHeight, pixelHeight * 2);
        g.setColor(suitColors[0]);
        g.fillRect(xPos - pixelHeight, yPos + 13 * pixelHeight, pixelHeight * 4, pixelHeight);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 3 * pixelHeight, yPos + 13 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 6 * pixelHeight, yPos + 13 * pixelHeight, pixelHeight * 3, pixelHeight);

        // Row 15
        g.fillRect(xPos - 2 * pixelHeight, yPos + 14 * pixelHeight, pixelHeight * 5, pixelHeight);
        g.setColor(suitColors[1]);
        g.fillRect(xPos + 3 * pixelHeight, yPos + 14 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 4 * pixelHeight, yPos + 14 * pixelHeight, pixelHeight, pixelHeight);
        g.setColor(suitColors[0]);
        g.fillRect(xPos + 5 * pixelHeight, yPos + 14 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.setColor(suitColors[1]);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 14 * pixelHeight, pixelHeight, pixelHeight);

        // Rows 16 + 17
        g.setColor(suitColors[0]);
        g.fillRect(xPos - 3 * pixelHeight, yPos + 15 * pixelHeight, pixelHeight * 13, pixelHeight * 2);
        g.setColor(suitColors[1]);
        g.fillRect(xPos - pixelHeight, yPos + 15 * pixelHeight, pixelHeight * 2, pixelHeight);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 2 * pixelHeight, yPos + 15 * pixelHeight, pixelHeight, pixelHeight * 3);
        g.setColor(suitColors[1]);
        g.fillRect(xPos + 6 * pixelHeight, yPos + 15 * pixelHeight, pixelHeight, pixelHeight * 2);
        g.fillRect(xPos + 8 * pixelHeight, yPos + 15 * pixelHeight, pixelHeight, pixelHeight);
        g.fillRect(xPos, yPos + 16 * pixelHeight, pixelHeight, pixelHeight);
        g.fillRect(xPos + 4 * pixelHeight, yPos + 16 * pixelHeight, pixelHeight * 2, pixelHeight);

        // Row 18
        g.setColor(suitColors[0]);
        g.fillRect(xPos - 2 * pixelHeight, yPos + 17 * pixelHeight, pixelHeight * 11, pixelHeight);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 2 * pixelHeight, yPos + 17 * pixelHeight, pixelHeight, pixelHeight);

        // Rows 19 - 25
        g.setColor(suitColors[0]);
        g.fillRect(xPos, yPos + 18 * pixelHeight, pixelHeight * 9, pixelHeight * 7);
        g.setColor(suitColors[2]);
        g.fillRect(xPos + 3 * pixelHeight, yPos + 18 * pixelHeight, pixelHeight * 2, pixelHeight * 7);
        g.setColor(suitColors[1]);
        g.fillRect(xPos, yPos + 18 * pixelHeight, pixelHeight * 2, pixelHeight);
        g.fillRect(xPos + 5 * pixelHeight, yPos + 19 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.setColor(beltColors[0]);
        g.fillRect(xPos, yPos + 20 * pixelHeight, pixelHeight * 9, pixelHeight);
        g.setColor(beltColors[2]);
        g.fillRect(xPos + 6 * pixelHeight, yPos + 21 * pixelHeight, pixelHeight * 2, pixelHeight * 2);

    }

    public void drawShoes(Graphics g) 
    {
        // Rows 26 - 29
        g.setColor((shoeColors[0]));
        g.fillRect(xPos, yPos + 25 * pixelHeight, pixelHeight * 9, pixelHeight * 2);
        g.setColor(shoeColors[1]);
        g.fillRect(xPos, yPos + 27 * pixelHeight, pixelHeight * 9, pixelHeight * 2);
        g.setColor(shoeColors[2]);
        g.fillRect(xPos + pixelHeight, yPos + 27 * pixelHeight, pixelHeight * 3, pixelHeight);
        g.fillRect(xPos + 5 * pixelHeight, yPos + 27 * pixelHeight, pixelHeight * 3, pixelHeight);
    }

    @Override
    public void drawVillager(Graphics g) 
    {
        drawFace(g);
        drawHat(g);
        drawSuit(g);
        drawShoes(g);
    }
}
