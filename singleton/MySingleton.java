package prg.design_patterns.singleton;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class MySingleton
{
    private static MySingleton instance;
    private int test = 0;

    private MySingleton(){ }

    public static MySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new MySingleton();
        }

        return instance;
    }

    public void printTest()
    {
        System.out.println(test);
    }
}
