package prg.design_patterns.adapter.ClassAdapter;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Main
{
    Target t = new Adapter();

    // Double instead of Integer
    Double d = t.adaptedRequest();
}
