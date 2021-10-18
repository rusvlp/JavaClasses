package com.company.dataStructures;

import javax.swing.plaf.ListUI;
import java.lang.reflect.Constructor;
import java.util.*;
import java.lang.reflect.InvocationTargetException;

/**
 * DeepList is compositive class, which contains ArrayList or LinkedList field (depends of string, that you will put in constructor)
 *
 * @param <E> Type of objects, that will be set in your DeepList
 */


public class DeepList<E>{
    // 1. DeepList -> Array, Linked
    // 2. Конструктор
    // ссылочная совместимость
    // Override



    private List list;

    /**
     * Copying constructor. Allows create DeepList accepting inheritors of AbstractList.
     *
     * @param cl accepts class. Instance of this class will be created in object.
     * @param toCopy object that will br copied into new instance
     * @throws Exception
     */

    public DeepList(Class cl, AbstractList<? extends E> toCopy) throws Exception{
        this(cl);
        deepCopy(toCopy);
    }

    /**
     * Copying constructor. Type of creating instance depends on type of accepted DeepList's containing type.
     *
     * @param toCopy object that will be copied into new instance
     * @throws Exception
     */

    public DeepList(DeepList toCopy) throws Exception{
        this(toCopy.getContainedClass(), toCopy.getList());
    }


    /**
     * Copying constructor.
     *
     * @param cl Accepts Class. Instance of this class will be created in object (Inheritors of AbstractList).
     * @param toCopy DeepList that will be copied
     */

    public DeepList(Class cl, DeepList<? extends E> toCopy) throws Exception{
        this(cl);
        deepCopy(toCopy.getList());
    }

    public DeepList(List toCopy) throws Exception{
        this(toCopy.getClass());
        deepCopy(toCopy);
    }

    /**
     *Constructor creates empty DeepList
     *
     * @param cl accepts Class to create instance of it inside DeepList
     */

    public DeepList(Class cl){
      if (cl == ArrayList.class)
          list = new ArrayList<E>();
      else if(cl == LinkedList.class)
          list = new LinkedList<E>;
      else
          throw new IllegalArgumentException("Accepted class must be LinkedList or ArrayList");

    }

    /**
     * Method does deep copying (using reflection). The main method of this class.
     *
     * @param toCopy AbstractList that will deep copied into this object
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */

    public void deepCopy(List<? extends E> toCopy) throws Exception{
        Constructor cstr;
        for (int i = 0; i<toCopy.size(); i++){
            E ob = toCopy.get(i);
            cstr = ob.getClass().getConstructor(ob.getClass());
            this.list.add((E)cstr.newInstance(ob));
        }
    }

    /**
     * Method returns ArrayList or LinkedList object (depends of contained object)
     *
     * @return inheritor of AbstractList
     */

    public AbstractList<? extends E> getList(){
        if (al != null)
            return al;
        else if(ll != null)
            return ll;
        return null;
    }

    /**
     * Method returns contained class.
     *
     * @return contained class of this object (ArrayList or LinkedList)
     */

    public Class getContainedClass(){
        return list.getClass();
    }

    /**
     * Method does change of list type.
     *
     * @throws Exception
     */

    public void changeTypeOfList() throws Exception{
        if (al != null){
            ArrayList<E> tmp = this.al;
            this.al = null;
            this.ll = new LinkedList<E>();
            deepCopy(tmp);
        } else if(ll != null) {
            LinkedList<E> tmp = this.ll;
            this.ll = null;
            this.al = new ArrayList<E>();
            deepCopy(tmp);
        }

    }


    public int size(){
        if (al != null)
            return al.size();
        else if (ll != null)
            return ll.size();
        return 0;
    }

    public boolean isEmpty(){
        if (al != null)
            return al.isEmpty();
        else if (ll != null)
            return ll.isEmpty();
        return true;
    }

   public boolean contains(Object o){
       if (al != null)
           return al.contains(o);
       else if (ll != null)
           return ll.contains(o);
       return false;
    }



}
