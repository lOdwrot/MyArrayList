package com.company;

import java.util.Objects;

/**
 * Created by lodwr on 19.10.2015.
 */
public class BasicArray implements ArrayInterface {
    protected int ammount;
    protected Object[] objTab;

    public BasicArray()
    {
        clear();
    }

    @Override
    public int size() {
        return ammount;
    }

    @Override
    public void add(Object o) {
        if(ammount<=objTab.length)
        objTab=increaseTab(objTab);

        objTab[ammount]=o;
        ammount++;
    }

    @Override
    public void clear() {
        objTab=new Object[0];
        ammount=0;
    }

    @Override
    public boolean remove(int index) {
        if(!indexBelongs(index)){
            System.out.println("Nieprawid³owy indeks");
            return false;
        }

        for(;index<ammount-1;index++)
            objTab[index]=objTab[index+1];

        ammount--;
        return true;
    }


    @Override
    public boolean isEmpty() {
        if(ammount==0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for(Object obj:objTab)
        {
            if(obj.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        if(indexBelongs(index))
            return objTab[index];

        System.out.println("Nie znaleziono elementu o podanej wartoœci indeksu");
        return null;
    }


    protected Object[] increaseTab(Object oTab[])
    {
        Object[] newTab = new Object[oTab.length+1];
        int i = 0;
        for(Object o: oTab){
            newTab[i]=o;
            i++;
        }
        return newTab;
    }
    protected boolean indexBelongs(int index)
    {
        if(index<ammount&&index>=0)
            return true;
        return false;
    }
}
