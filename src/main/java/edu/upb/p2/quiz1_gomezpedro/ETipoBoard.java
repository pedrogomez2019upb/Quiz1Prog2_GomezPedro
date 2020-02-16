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
public enum ETipoBoard {
    
       AMD("procesador","AMD"),INTEL("procesador","Intel");
       private final String procesador;
       private final String tipoProcesador;
       ETipoBoard(String procesador,String tipoProcesador){
           this.procesador=procesador;
           this.tipoProcesador=tipoProcesador;
       }
         @Override
    public String toString() {
    return procesador;
  }
}
