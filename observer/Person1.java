package prg.design_patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Person1 implements Observer
{
    @Override
    public void update(Observable o, Object info)
    {
        System.out.println("Person1 got notification: " + info);
    }
}
