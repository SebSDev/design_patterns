package prg.design_patterns.decorator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        Gericht g = new SalatDecorator(new PommesDecorator(new Schnitzel()));
        Gericht g2 = new SalatDecorator(new Seelachs());

        System.out.println(g.getDescription());
        System.out.println(g2.getDescription());
    }
}
