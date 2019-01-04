package prg.design_patterns.adapter.ClassAdapter;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Adapter extends Adaptee implements Target
{
    public Double adaptedRequest()
    {
        return super.specificRequest().doubleValue();
    }
}
