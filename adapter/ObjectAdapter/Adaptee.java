package prg.design_patterns.adapter.ObjectAdapter;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Adaptee
{
    public Integer specificRequest()
    {
        return new Integer(5);
    }
}
