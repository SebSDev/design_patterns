package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class TurnleftCommand implements Command
{
    private Spielfigur sp;

    public TurnleftCommand(Spielfigur sp)
    {
        this.sp = sp;
    }

    @Override
    public void execute()
    {
        sp.turnLeft();
    }

    @Override
    public void undo()
    {
        sp.turnRight();
    }
}
