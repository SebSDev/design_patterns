package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description:
 */
public interface Command
{
    void execute();
    void undo();
}
