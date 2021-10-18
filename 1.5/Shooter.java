package com.company;

public class Shooter implements Shootable{
    String name;
    Weapon gun;

    public Shooter(String name){
        this.name = name;
    }

    public void shoot(){
        if (this.gun == null){
            System.out.println("Не могу участвовать в перестрелке");
            return;
        }

        gun.shoot();


    }
}
