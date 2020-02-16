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
public abstract class MotherBoard implements FuentePoder,Transferencia{
    private String nombre;
    private String marca;
    private int capacidad;
    private String protocoloTransferencia;
    
    public void protocoloBIOS(){
    }
}
