package prg.design_patterns.proxy;

/**
 * @author Sebastian Schäffler
 * created at 04.01.2019
 * description: Proxy
 */
public class Proxy implements Information
{
    private KlasseMitGeheimerInformation realSubject;

    public Proxy()
    {
        realSubject = new KlasseMitGeheimerInformation();
    }

    @Override
    public String getInformation()
    {
        // nur bis zum 7. character darf gelesen werden
        return realSubject.getInformation().substring(0, 7);
    }
}
