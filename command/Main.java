package prg.design_patterns.command;

/**
 * @author Sebastian Schäffler
 * created at 03.01.2019
 * description: Client
 */
public class Main
{
    public static void main(String[] args)
    {
        Spielfigur sp = new Spielfigur(); // Receiver

        Spieler s = new Spieler(); //Invoker

        s.doSomething(new MoveforwardCommand(sp));
        s.doSomething(new TurnleftCommand(sp));
        s.doSomething(new JumpupCommand(sp));
        s.doSomething(new MoveforwardCommand(sp));
        s.doSomething(new MoveforwardCommand(sp));

        s.undoAll();

    }
}
