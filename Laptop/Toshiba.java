/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laptop;

/**
 *
 * @author LENOVO
 */

public class Toshiba implements Laptop{
    private int volume;
    private boolean is_power_on;
    
    public Toshiba(){
        this.volume = 60;
    }

    @Override
    public void powerOn(){
        is_power_on = true;
        System.out.println("Toshiba is ON");
        System.out.println("Dynabook Tecra A40-G i7 productnation is ready!");
    }
    
    @Override
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown in progress...");
    }
    
    @Override
    public void volumeUp(){
        if(is_power_on){
            if(this.volume == MAX_VOL){
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Laptop is OFF! Please turn it on first.");
        }
    }
    
    @Override
    public void volumeDown() {
        if(is_power_on){
            if(this.volume == MIN_VOL){
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Laptop is OFF! Please turn it on first.");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
}
