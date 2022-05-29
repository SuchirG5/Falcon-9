public class Falcon10 extends Rocket
{
    //variables
    private double rocketMass = 541300;
    private double netForce = 0;
    private double altitude;
    private double time = 0;
    private double acceleration = 0;
    private double burnTime = 162;
    private double burnTimeS2 = 397;
    private double rocketMass2 = 96570;

    //constants
    private double dt;
    private double dm = 2462.35;
    private double thrust = 6806000;
    private final double bigG = 6.67 * Math.pow(10, -11);
    private final double earthRadius = 6.38 * Math.pow(10, 6);
    private final double earthMass = 5.98 * Math.pow(10, 24);
    private static final double FRAME_HEIGHT_METERS = 2000000;


    public Falcon10(int xPos, int yPos, int ySpeed, int width, int height, double dt)
    {
        super(xPos, yPos, ySpeed, width, height);
        this.dt = dt;
        altitude = yPos;
    }

    //Getters and Setters

    public double getRocketMass2()
    {
        return rocketMass2;
    }

    public void setBurnTime(double bt)
    {
        this.burnTime = bt;
    }

    public double getBurnTime()
    {
        return this.burnTime;
    }

    public double getRocketMass() 
    {
        return this.rocketMass;
    }

    public void setRocketMass(double rocketMass) 
    {
        this.rocketMass = rocketMass;
    }

    public double getNetForce() 
    {
        return this.netForce;
    }

    public void setNetForce(double netForce) 
    {
        this.netForce = netForce;
    }

    public double getAltitude() 
    {
        return this.altitude;
    }

    public void setAltitude(double altitude) 
    {
        this.altitude = altitude;
    }

    public double getTime() 
    {
        return this.time;
    }

    public void setTime(double time) 
    {
        this.time = time;
    }

    public double getAcceleration() 
    {
        return this.acceleration;
    }

    public void setAcceleration(double acceleration) 
    {
        this.acceleration = acceleration;
    }

    public double getDt() 
    {
        return this.dt;
    }

    public void setDt(double dt) 
    {
        this.dt = dt;
    }

    public double getDm() 
    {
        return this.dm;
    }

    public void setDm(double dm) 
    {
        this.dm = dm;
    }

    public double getThrust() 
    {
        return this.thrust;
    }

    public void setThrust(double thrust) 
    {
        this.thrust = thrust;
    }

    
    //Move method
    @Override
    public void move(int HEIGHT)
    {
            if(time <= burnTime)
            {
                //Stage 1
                rocketMass -= dm*dt;
                netForce = thrust - (bigG*((rocketMass*earthMass)/Math.pow((earthRadius+altitude), 2)));
                acceleration = netForce/rocketMass;
                setYSpeed((getYSpeed() + acceleration*dt));
                altitude += getYSpeed()*dt;
                setY((HEIGHT * (1 - altitude / FRAME_HEIGHT_METERS)));
                time += dt;
            } 
            else if (time <= burnTimeS2)
            {
                // //Stage 2
                dm = 394.34;
                thrust = 934000;
                rocketMass -= dm*dt;
                netForce = thrust - (bigG*((rocketMass*earthMass)/Math.pow((earthRadius+altitude), 2)));
                acceleration = netForce/rocketMass;
                setYSpeed((getYSpeed() + acceleration*dt));
                altitude += getYSpeed()*dt;
                setY((HEIGHT * (1 - altitude / FRAME_HEIGHT_METERS)));
                time += dt;
            }
   
    }


}   
