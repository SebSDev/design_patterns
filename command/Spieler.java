package prg.design_patterns.command;

import java.util.Stack;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description: Invoker
 */
public class Spieler
{
    Stack<Command> commandHistory;

    public Spieler()
    {
        this.commandHistory = new Stack<>();
    }

    public void doSomething(Command c)
    {
        System.out.println("Doing something: ");

        commandHistory.push(c);
        c.execute();
    }

    public void undoSomething()
    {
        System.out.println("Undoing one step: ");

        if (commandHistory.size() > 0)
        {
            commandHistory.pop().undo();
        }
        else
        {
            System.out.println("nothing to undo!");
        }
    }

    public void undoAll()
    {
        System.out.println("Undoing everything:");

        while (commandHistory.size() > 0)
        {
            undoSomething();
        }
    }
}
