/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.quiz1_gomezpedro;

/**
 *
 * @author pipe22007
 * @param <T>
 */
public class Describir<T> {
  T obj;
 
  public Describir(T o) {
    this.obj = o;
  }
 
  public T mostrarBoard(){
    return obj;
}
}
 

