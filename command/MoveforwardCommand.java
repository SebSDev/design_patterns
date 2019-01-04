package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class MoveforwardCommand implements Command
{
    private Spielfigur sp;

    public MoveforwardCommand(Spielfigur sp)
    {
        this.sp = sp;
    }

    @Override
    public void execute()
    {
        sp.moveForward();
    }

    @Override
    public void undo()
    {
        sp.turnLeft();
        sp.turnLeft();
        sp.moveForward();
        new TurnleftCommand(sp).undo();
        new TurnleftCommand(sp).undo();
    }
}
