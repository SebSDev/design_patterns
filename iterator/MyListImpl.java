package prg.design_patterns.iterator;

import java.util.Iterator;

/**
 * @author Sebastian Schäffler
 * created at 02.01.2019
 * description:
 */
public class MyListImpl<T> implements MyList<T>, Iterable<T>
{
    private Element<T> head;
    private int size = 0;

    private static class Element<T>
    {
        private T item;
        private Element next;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new Iterator<T>()
        {
            Element<T> it = head;

            @Override
            public boolean hasNext()
            {
                return it != null;
            }

            @Override
            public T next()
            {
                T val = it.item;
                it = it.next;
                return val;
            }
        };
    }

    @Override
    public void add(T item)
    {
        Element el = new Element();
        el.item = item;

        if (head == null)
        {
            head = el;
        }
        else
        {
            Element tmp = head;
            while (tmp.next != null)
            {
                tmp = tmp.next;
            }
            tmp.next = el;
        }
        size++;
    }

    @Override
    public int size()
    {
        return size;
    }
}
