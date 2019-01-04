package prg.design_patterns.observer;

import java.util.Observer;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        FunnyCatVideos fcv = new FunnyCatVideos();
        NewsTicker nt = new NewsTicker();

        Observer p1 = new Person1();

        nt.addObserver(p1);
        nt.addObserver(new Person3());
        nt.addObserver(new Person2());

        fcv.addObserver(new Person2());

        fcv.notifyObservers("Neues lustiges Katzenvideo!!!");
        fcv.notifyObservers(new Integer(23));

        nt.notifyObservers("Schwerer Unfall auf A8");
        nt.notifyObservers("Kältester Winter seit 100 Jahren erwartet!");
    }
}
