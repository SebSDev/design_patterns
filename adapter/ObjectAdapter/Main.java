package prg.design_patterns.adapter.ObjectAdapter;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        Target t = new Adapter(new Adaptee());

        // Double instead of Integer
        Double d = t.adaptedRequest();
    }
}
