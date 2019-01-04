package prg.design_patterns.factory;

import prg.design_patterns.factory.pack.*;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        CarFactory bmw = new BMWFactory();
        CarFactory mercedes = new MercedesFactory();

        Crossover crs = bmw.createCrossover();
        crs = mercedes.createCrossover();

        Limousine limo = bmw.createLimousine();
    }
}
