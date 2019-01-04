package prg.design_patterns.flyweight;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class FlyweightFactory
{
    private Map<String, Flyweight> flyweights = new HashMap();

    Flyweight getFlyweight(String path) throws URISyntaxException, IOException
    {
        if (flyweights.containsKey(path))
        {
            return flyweights.get(path);
        }
        else
        {
            Flyweight fw = new Flyweight(path);
            flyweights.put(path, fw);
            return fw;
        }
    }
}
