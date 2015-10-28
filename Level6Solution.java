import sofia.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Level 6, together with its solution using a single Light-Bot.
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version 2015.08.27
 */
public class Level6Solution extends Level6a
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Place the light bot in the world and guide it through the level.
     */
    public void myProgram()
    {
        LightBot mykayla = new LightBot();
        add(mykayla, 2, 6);
       
        mykayla.turnLeft();
        mykayla.move();
        mykayla.jump();
        mykayla.jump();
        mykayla.turnRight();
        mykayla.jump();
        mykayla.jump();
        mykayla.turnLightOn();
        mykayla.jump();
        mykayla.turnLeft();
        mykayla.move();
        mykayla.move();
        mykayla.move();
        mykayla.turnLightOn();
        mykayla.turnRight();
        mykayla.turnRight();
        mykayla.move();
        mykayla.move();
        mykayla.move();
        mykayla.move();
        mykayla.move();
        mykayla.move();
        mykayla.turnLightOn();
       
    }

}
