package com.company;

/**
 * Created by lodwr on 21.10.2015.
 */
public class MyArray extends BasicArray {
    public MyArray(){
        super();
    }
    public int indexOf(Object o) {
        int i =0;
        for(Object obj:objTab)
        {
            if (obj.equals(o))
                return i;
            i++;
        }
        System.out.println("Nie odnaleziono takiego elementu");
        return -1;
    }
    public boolean remove(Object o){
        int i =0;
        for(Object obj:objTab)
        {
            if (obj.equals(o)) {
                remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
    public boolean set(int index, Object o){
        if(!indexBelongs(index)) {
            System.out.println("Lista nie ma takiego indeksu");
            return false;
        }
        objTab[index]=o;
        return true;
    }

}
