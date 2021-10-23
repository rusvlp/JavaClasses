package com.company.time;

public class TimeZone extends Time {

    private float tz;

    public TimeZone(int h, int m, int s, float tz){
        this(h*3600 + m * 60 + s, tz);
    }

    public TimeZone(int sec, float tz){
        super(sec);
        setTz(tz);
    }

    public void setTz(float tz){
        if (tz >= -12f && tz <= 14f && (tz % 1 == 0.5 || tz % 1 == 0))
            this.tz = tz;
        else throw new IllegalArgumentException(tz + " is not a legal argument");

        if (tz % 1 == 0f)
            this.setSec(this.getSec() + (int)tz * 3600);
        else if (tz % 1 == 0.5f)
            this.setSec(this.getSec() + (int)tz * 3600 + 1800);

    }

    @Override
    public String toString(){
        return  (tz < 0 ? "-" : "+") + super.toString() + " UTC";

    }
}
