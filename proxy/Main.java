package prg.design_patterns.proxy;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description: Client
 */
public class Main
{
    public static void main(String[] args)
    {
        Information info = new Proxy();

        System.out.println(info.getInformation());
    }
}
