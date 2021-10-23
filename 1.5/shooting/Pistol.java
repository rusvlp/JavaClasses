package com.company.shooting;

import com.company.shooting.Weapon;

public class Pistol extends Weapon {

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
        if (this.ammo > 0){
            System.out.println("Бах!");
            this.ammo--;
        } else
            System.out.println("Клац!");
    }
}
