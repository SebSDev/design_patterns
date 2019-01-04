package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class TurnrightCommand implements Command
{
    private Spielfigur sp;

    public TurnrightCommand(Spielfigur sp)
    {
        this.sp = sp;
    }

    @Override
    public void execute()
    {
        sp.turnRight();
    }

    @Override
    public void undo()
    {
        sp.turnLeft();
    }
}
