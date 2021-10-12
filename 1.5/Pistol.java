package com.company;

public class Pistol extends Weapon{

    public Pistol(){
        this(5, 10);
    }

    public Pistol(int maxAmmo){
        this(5, maxAmmo);
    }

    public Pistol(int ammo, int maxAmmo){
       super(ammo, maxAmmo);

    }

    @Override
    public void shoot(){
        if (this.getAmmo() > 0){
            System.out.println("Бах!");
            this.unload(1);
        } else
            System.out.println("Клац!");
    }
}
