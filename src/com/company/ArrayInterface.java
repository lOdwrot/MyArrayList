package com.company;

import java.util.Objects;

/**
 * Created by lodwr on 19.10.2015.
 */
public interface ArrayInterface {
    public int size();
    public void add(Object o);
    public void clear();
    public boolean remove(int i);
    public boolean isEmpty();
    public boolean contains(Object o);
    public Object get(int i);
}
