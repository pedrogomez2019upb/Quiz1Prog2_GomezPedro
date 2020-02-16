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
public class RAM extends MotherBoard{
    private int frecuencia;
    private String tipoSlot;

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

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTipoSlot() {
        return tipoSlot;
    }

    public void setTipoSlot(String tipoSlot) {
        this.tipoSlot = tipoSlot;
    }
    
}
