package prg.design_patterns.flyweight;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class MyImage
{
    final String description;
    final Flyweight flyweight;

    public MyImage(String description, Flyweight fw)
    {
        this.description = description;
        this.flyweight = fw;
    }

    void printDescription()
    {
        flyweight.printDescription(this);
    }
}
