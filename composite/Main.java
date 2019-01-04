package prg.design_patterns.composite;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        Box b = new Box();

        Box shoeBox = new Box();
        shoeBox.add(new Shoes());

        b.add(shoeBox);
        b.add(new Pencil());
        b.add(new Gloves());
        b.add(new Pencil());

        System.out.println(b.count());
    }
}
