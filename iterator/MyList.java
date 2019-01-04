package prg.design_patterns.iterator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public interface MyList<T> extends Iterable<T>
{
    int size();
    void add(T item);
}
