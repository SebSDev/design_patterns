package prg.design_patterns.adapter.ObjectAdapter;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Adapter implements Target
{
    private Adaptee adaptee;

    public Adapter(Adaptee a)
    {
        this.adaptee = a;
    }

    public Double adaptedRequest()
    {
        return adaptee.specificRequest().doubleValue();
    }
}
