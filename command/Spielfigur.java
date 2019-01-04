package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description: Receiver
 */
public class Spielfigur
{
    public void moveForward()
    {
        System.out.println("vorwärts");
    }

    public void turnLeft()
    {
        System.out.println("nach links drehen");
    }

    public void turnRight()
    {
        System.out.println("nach rechts drehen");
    }

    public void jumpUp()
    {
        System.out.println("hochspringen");
    }

    public void jumpDown()
    {
        System.out.println("runterspringen");
    }
}
