package prg.design_patterns.flyweight;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description:
 */
public class Flyweight
{
    private final Image image;

    public Flyweight(String path) throws URISyntaxException, IOException
    {
        File file = new File(getClass().getClassLoader().getResource("src/prg/design_patterns/flyweight/" + path).toURI());

        this.image = ImageIO.read(file);
    }

    void printDescription(MyImage i)
    {
        System.out.println("Description of Image " + image.toString() + ": " +  i.description);
    }
}
