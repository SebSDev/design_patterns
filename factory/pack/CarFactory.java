package prg.design_patterns.factory.pack;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public interface CarFactory
{
    Crossover createCrossover();
    Limousine createLimousine();
}
