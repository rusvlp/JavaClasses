package com.company;

public class AssaultRifle extends Gun{
    private int rateOfFire;

    public AssaultRifle(){
        this(30, 30);
    }

    public AssaultRifle(int maxAmmo){
        this(maxAmmo, maxAmmo/2);
    }

    public AssaultRifle(int maxAmmo, int rateOfFire){
        super(maxAmmo);
        setRateOfFire(rateOfFire);

    }

    public void setRateOfFire(int rateOfFire){
        if (rateOfFire > 0)
            this.rateOfFire = rateOfFire;
        else
            throw new IllegalArgumentException(rateOfFire  + " is nor a legal argument!");
    }

    public int getRateOfFire(){
        return this.rateOfFire;
    }

    @Override
    public void shoot(){
        this.shoot(1);
    }

    public void shoot(int seconds){
        for (int i = 0; i<seconds; i++)
            for (int j = 0; j<this.rateOfFire; j++)
                super.shoot();

    }
}
