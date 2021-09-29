package com.company;

public class Gun {
    private int ammo;

    public Gun(){
        this.ammo = 5;
    }

    public Gun(int ammo){
        setAmmo(ammo);
    }

    public void setAmmo(int ammo){
        if (ammo>=0)
            this.ammo = ammo;
        else
            throw new IllegalArgumentException(ammo + " is not a legal argument");
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
