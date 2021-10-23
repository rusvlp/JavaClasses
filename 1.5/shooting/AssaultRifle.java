package com.company.shooting;

import com.company.shooting.Weapon;

public class AssaultRifle extends Weapon {
    private int rateOfFire;

    public AssaultRifle(){
        this(30, 30);
    }

    public AssaultRifle(int maxAmmo){
        this(maxAmmo, maxAmmo/2);
    }

    public AssaultRifle(int maxAmmo, int rateOfFire){
        super(maxAmmo, maxAmmo);
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
        String toSout = "";

        for (int i = 0; i<rateOfFire; i++){



            if (this.ammo > 0){
                toSout+= "та-";
                this.ammo--;
            } else
                toSout+="клац-";
        }

        toSout += "\b";
        System.out.println(toSout);
    }

    public void shoot(int seconds){
        for (int i = 0; i<seconds; i++)
            this.shoot();

    }
}
