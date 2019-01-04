package prg.design_patterns.singleton;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        MySingleton ms = MySingleton.getInstance();

        ms.printTest();
    }
}
