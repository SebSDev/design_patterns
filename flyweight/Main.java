package prg.design_patterns.flyweight;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description: The Flyweight pattern I have implemented here is just a small Adjustment from the one we learned in class
 */
public class Main
{
    public static void main(String[] args) throws IOException, URISyntaxException
    {
        List<MyImage> images = new LinkedList<>();
        FlyweightFactory fwf = new FlyweightFactory();

        images.add(new MyImage("Erste Beschreibung für testImage1", fwf.getFlyweight("testImage1.jpg")));
        images.add(new MyImage("Zweite Beschreibung für testImage1", fwf.getFlyweight("testImage1.jpg")));
        images.add(new MyImage("Dritte Beschreibung für testImage1", fwf.getFlyweight("testImage1.jpg")));
        images.add(new MyImage("Vierte Beschreibung für testImage1", fwf.getFlyweight("testImage1.jpg")));
        images.add(new MyImage("Erste Beschreibung für testImage2", fwf.getFlyweight("testImage2.jpg")));
        images.add(new MyImage("Zweite Beschreibung für testImage2", fwf.getFlyweight("testImage2.jpg")));

        for (MyImage i : images)
        {
            i.printDescription();
        }
    }
}
