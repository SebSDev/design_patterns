package prg.design_patterns.decorator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description: SomeDecorator
 */
public class SalatDecorator extends GerichteDecorator
{
    public SalatDecorator(Gericht source)
    {
        super(source);
    }

    @Override
    public String getDescription()
    {
        return super.getSource().getDescription() + " mit Salat";
    }
}
