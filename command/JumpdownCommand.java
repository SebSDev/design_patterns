package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class JumpdownCommand implements Command
{
    private Spielfigur sp;

    public JumpdownCommand(Spielfigur sp)
    {
        this.sp = sp;
    }

    @Override
    public void execute()
    {
        sp.jumpDown();
    }

    @Override
    public void undo()
    {
        sp.jumpUp();
    }
}
