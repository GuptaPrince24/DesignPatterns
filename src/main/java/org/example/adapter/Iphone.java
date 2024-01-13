package org.example.adapter;

public class Iphone {
    AppleCharger charger;
    public Iphone(AppleCharger charger)
    {
        this.charger = charger;
    }
    public void charging()
    {
        charger.appleCharging();
    }
}
