package com.company;

public class Gun {
    private int ammo;
    public final int maxAmmo;

    public Gun(){
        this(5, 10);
    }

    public Gun(int maxAmmo){
        this(5, maxAmmo);
    }

    public Gun(int ammo, int maxAmmo){
        if (maxAmmo < 0)
            throw new IllegalArgumentException(maxAmmo + " is not a legal argument");
        this.maxAmmo = maxAmmo;
        load(ammo);

    }
    public int load(int ammo){
        if (ammo < 0)
            throw new IllegalArgumentException(ammo + " is not a legal argument");
        if (ammo >= this.maxAmmo){
            this.ammo = maxAmmo;
            return ammo - maxAmmo;
        } else{
           this.ammo = ammo;
           return 0;
        }


    }

    public int unload(){
        int toRet = this.ammo;
        this.ammo = 0;
        return toRet;
    }

    public int getAmmo(){
        return this.maxAmmo;
    }

    public void shoot(){
        if (ammo > 0){
            System.out.println("Бах!");
            this.ammo--;
        }
        else
            System.out.println("Клац!");
    }
}
