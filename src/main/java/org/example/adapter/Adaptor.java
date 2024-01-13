package org.example.adapter;

public class Adaptor implements AppleCharger{
    AndroidCharger charger;
    public Adaptor(AndroidCharger charger)
    {
        this.charger= charger;
    }

    @Override
    public void appleCharging() {
        charger.androidCharging();
    }
}
