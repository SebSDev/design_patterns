package prg.design_patterns.proxy;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description: RealSubject
 */
public class KlasseMitGeheimerInformation implements Information
{

    private String geheimeInformation;

    public KlasseMitGeheimerInformation()
    {
        // In diesem String ist alles ab dem 7. character streng geheim!
        this.geheimeInformation = "Hallo. Ab hier ist die Information geheim!";
    }

    public String getInformation()
    {
        return geheimeInformation;
    }
}
