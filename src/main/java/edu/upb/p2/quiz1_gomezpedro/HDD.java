/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.quiz1_gomezpedro;

/**
 *
 * @author pipe22007
 */
public class HDD extends MotherBoard{
    private int rpm;
    @Override
    public void startFlujoE() {
    }

    @Override
    public void stopFlujoE() {
    }

    @Override
    public void startDatos() {
    }

    @Override
    public void stopDatos() {
    }

    public HDD(int rpm) {
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    
    
}
