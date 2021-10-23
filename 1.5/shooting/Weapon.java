package com.company.shooting;

public abstract class Weapon {
    protected int ammo;
    protected int maxAmmo;

    public Weapon(int ammo, int maxAmmo){
      if (maxAmmo <= 0)
          throw new IllegalArgumentException(maxAmmo + " is not a legal argument");
      this.maxAmmo = maxAmmo;
      this.load(ammo);
    }

    abstract void shoot();


    public int getAmmo(){
        return this.ammo;
    }

    public int getMaxAmmo(){
        return this.maxAmmo;
    }

    public int load(int ammo){
        if (ammo < 0)
            throw new IllegalArgumentException(ammo + " is not a legal argument");
        if (ammo >= this.maxAmmo){
            this.ammo = maxAmmo;
            return ammo - maxAmmo;
        } else {
            this.ammo = ammo;
            return 0;
        }
    }

    public void unload(int count){
        if (count > this.ammo)
            throw new IllegalArgumentException(count +  " is bigger than weapon's ammo");
        this.ammo -= count;

    }
}
