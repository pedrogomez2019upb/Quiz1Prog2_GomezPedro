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
public class VideoCard extends MotherBoard{
    private String tipoMemoria;
    private String tipoAlgoritmo;

    @Override
    public void startFlujoE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stopFlujoE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stopDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getTipoAlgoritmo() {
        return tipoAlgoritmo;
    }

    public void setTipoAlgoritmo(String tipoAlgoritmo) {
        this.tipoAlgoritmo = tipoAlgoritmo;
    }
    
}
