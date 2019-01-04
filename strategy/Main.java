package prg.design_patterns.strategy;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        String text = "Dies ist ein Text mit ein paar Wörtern!";

        Strategy lt = new LowercaseStrategy();
        Strategy up = new UppercaseStrategy();
        Strategy deco = new DecorationStrategy();

        lt.print(text);
        up.print(text);
        deco.print(text);
    }
}
