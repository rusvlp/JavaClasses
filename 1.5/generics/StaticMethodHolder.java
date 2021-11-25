package com.company.generics;
import com.company.geometry.Point;
import com.company.geometry.Line;
import com.company.geometry.SpacePoint;

import java.util.List;
import java.util.ArrayList;

public class StaticMethodHolder {
    public static void lineOffset(int offset, Line<? extends Point> line){
        line.start.x += offset;
        line.end.x += offset;
    }

    public static double maxFinder(Storage <? extends Number> ... strg){
        double sum = 0;
        Double d = 0d;
        for (Storage <? extends Number> st: strg){
            Storage <? super Number> st1 = (Storage<? super Number>)st;
            Object tmp = st1.getObj(d);
            sum += ((Number)tmp).doubleValue();
        }

        return sum;
    }

    public static Box<SpacePoint> boxer(Box b){
        if (!b.isEmpty()) b.getObject();
        b.setObject(new SpacePoint(1, 2, 3));
        return b;

    }

    public static void listFuller (List<? super Number> l){
        for (int i = 0; i < 100; i++)
            l.set(i, i);
    }

    public static <T, P> List<P> map (List<T> lst, Applyable<T, P> ap){
        List<P> toRet = new ArrayList<>();

        for (T obj: lst)
            toRet.add(ap.apply(obj));
        return toRet;
    }

    public static <T> List<T> filter(List<T> lst, Filter<T> fltr){
        List<T> toRet = new ArrayList<>();
        for (T tmp: lst)
            if (fltr.filter(tmp)) toRet.add(tmp);
        return toRet;

    }

    public static <T> T reduce (List<T> lst, Reducer<T> rdcr, T def){
        T toRet = def;
        for (int i = 0; i<lst.size(); i++)
            toRet = rdcr.reduce(lst.get(i), toRet);
        return toRet;
    }

    public static <T, P> P collector(List<T> lst, Creator<P> crt, Consumer<P, T> cns){
        P dq = crt.create();
        for (T i: lst)
            cns.push(dq, i);
        return dq;
    }

    public static void secondthird(){
        ArrayList<Integer[]> alai;
    }

    public static void secondsecond(){
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(-3);
        ali.add(7);

        List<Integer> filterd = filter(ali, (i) -> i>0);
        System.out.println(filterd);
    }

    public static void secondfirst(){
        ArrayList<String> als = new ArrayList<>();
        als.add("qwerty");
        als.add("asdfg");
        als.add("zx");

        List<String> filtered = filter(als, (str) -> str.length() > 3);
        System.out.println(filtered);
    }

    public static void thirdthird(){
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(2);
        ali.add(3);

        int res = reduce(ali, (i1, i2) -> i2 = i2 + 1, 0);
        System.out.println(res);
    }

    public static void thirdsecond(){
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(-3);
        ali.add(7);

        int res = reduce(ali, (i1, i2) -> i1+=i2, 0);
        System.out.println(res);
    }

    public static void thirdfirst(){
        ArrayList<String> als = new ArrayList<>();
        als.add("qwerty");
        als.add("asdfg");
        als.add("zx");

        String res = reduce(als, (str1, str2) -> str1+=str2, "");
        System.out.println(res);
    }

    public static void fourthsecondsecond(){
        ArrayList<String> als = new ArrayList<>();
        als.add("hi1");
        als.add("aaabbb");
        als.add("hi2");
        als.add("bbbccc");

        Consumer<ArrayList<ArrayList<String>>, String> anon1 = new Consumer<>() {
            public void push(ArrayList<ArrayList<String>> list, String str){
                for (ArrayList<String> als: list)
                    if (als.get(0).length() == str.length()) {
                        als.add(str);
                        return;
                    }

                ArrayList<String> alsNewLength = new ArrayList<>();
                alsNewLength.add(str);
                list.add(alsNewLength);

            }
        };

        ArrayList<ArrayList<String>> res = collector(als, () -> new ArrayList<>(), anon1);
        System.out.println(res);

    }

    public static void fourthfirst(){
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(-3);
        ali.add(7);

        Creator<ArrayList<ArrayList<Integer>>> anonCreator = new Creator<ArrayList<ArrayList<Integer>>>() {
            public ArrayList<ArrayList<Integer>> create() {
                ArrayList<ArrayList<Integer>> toRet = new ArrayList<>();
                toRet.add(new ArrayList<>());
                toRet.add(new ArrayList<>());

                return toRet;
            }
        };

        ArrayList<ArrayList<Integer>> res = collector(ali, anonCreator, (list, i) -> {boolean b = i >= 0 ? list.get(0).add(i) : list.get(1).add(i);return;});
        System.out.println(res);
    }

    public static void fourththird(){
        ArrayList<String> als1 = new ArrayList<>();
        als1.add("qwerty");
        als1.add("qwerty");
        als1.add("am");
        als1.add("bas");


        ArrayList<String> res = collector(als1, () -> new ArrayList<>(), (als, str) -> {if (!als.contains(str)) als.add(str);});

        System.out.println(res);

    }

    public static void execute(){
       secondsecond();
    }
}

class StringFilter extends WithFiltering<String>{
    public boolean filtering(String str){
        if (str.length() < 3) return false;
        return true;
    }
}

class StringWrapper extends WithApply<Integer>{
    String data;

    public StringWrapper(String str){
        this.data = str;
    }

    public Integer apply(){
        return data.length();
    }
}

