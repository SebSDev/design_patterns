package prg.design_patterns.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Box extends ShipmentItem
{
    List<ShipmentItem> items;

    public Box()
    {
        items = new LinkedList();
    }

    @Override
    public int count()
    {
        int c = 0;

        for (ShipmentItem i : items)
        {
            c += i.count();
        }

        return c;
    }

    public void add(ShipmentItem i)
    {
        items.add(i);
    }

}
