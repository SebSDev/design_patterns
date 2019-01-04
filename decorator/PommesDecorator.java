package prg.design_patterns.decorator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description: SomeDecorator
 */
public class PommesDecorator extends GerichteDecorator
{
    public PommesDecorator(Gericht source)
    {
        super(source);
    }

    @Override
    public String getDescription()
    {
        return getSource().getDescription() + " mit Pommes";
    }
}
