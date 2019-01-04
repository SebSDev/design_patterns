package prg.design_patterns.observer;

import java.util.Observable;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class FunnyCatVideos extends Observable
{
    @Override
    public void notifyObservers(Object o){
        setChanged();
        super.notifyObservers(o);
    }
}
