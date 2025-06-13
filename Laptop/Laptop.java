/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Laptop;

/**
 *
 * @author LENOVO
 */

public interface Laptop {
    int MAX_VOL = 100;
    int MIN_VOL = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

