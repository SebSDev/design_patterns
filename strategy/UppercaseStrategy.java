package prg.design_patterns.strategy;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class UppercaseStrategy implements Strategy
{
    @Override
    public void print(String text)
    {
        System.out.println(this.getClass().getSimpleName().toString() + ": " + text.toUpperCase());
    }
}
