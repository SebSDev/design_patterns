package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public class JumpupCommand implements Command
{
    private Spielfigur sp;

    public JumpupCommand(Spielfigur sp)
    {
        this.sp = sp;
    }

    @Override
    public void execute()
    {
        sp.jumpUp();
    }

    @Override
    public void undo()
    {
        sp.jumpDown();
    }
}
