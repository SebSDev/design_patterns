package prg.design_patterns.decorator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description: Decorator
 */
public abstract class GerichteDecorator extends Gericht
{
    private Gericht source;

    public GerichteDecorator(Gericht g)
    {
        this.source = g;
    }

    protected Gericht getSource()
    {
        return source;
    }
}
