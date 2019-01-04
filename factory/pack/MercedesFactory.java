package prg.design_patterns.factory.pack;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class MercedesFactory implements CarFactory
{
    @Override
    public Crossover createCrossover()
    {
        return new MercedesCrossover();
    }

    @Override
    public Limousine createLimousine()
    {
        return new MercedesLimousine();
    }
}
