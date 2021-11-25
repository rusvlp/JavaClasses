package com.company.people;
import java.util.ArrayList;

public class Name {
    String first;    // package-private access
    String last;
    String mid;
    private static ArrayList<Name> pool = new ArrayList<>() ;

    private Name(){};

    public String getLast(){
        return this.last;
    }

    public String getMid(){
        return this.mid;
    }

    public String toString(){
        return (first == null ? "" : first) + " " +  (mid == null ? "" : mid) + " " + (last == null ? "" : last);
    }

    public static class Builder{
        String first;
        String last;
        String mid;

        public Builder setFirst(String first){
            this.first = first;
            return this;
        }

        public Builder setLast(String last){
            this.last = last;
            return this;
        }

        public Builder setMid(String mid){
            this.mid = mid;
            return this;
        }

        public Name getName(){
            for (Name n: Name.pool)
                if (n.first == this.first && n.last == this.last && n.mid == this.mid)
                    return n;

            Name toRet = new Name();
            toRet.first = this.first;
            toRet.last = this.last;
            toRet.mid = this.mid;

            Name.pool.add(toRet);
            return toRet;
        }

    }

}
