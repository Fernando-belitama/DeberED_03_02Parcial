/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.lista;

/**
 *
 * @author FERNANDO
 */
public class Nodo{
    
    float dato;
    Nodo siguiente;

    public Nodo(float dato) {
        this.dato=dato;
        this.siguiente=null;
    }

    public Nodo(float dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public float getDato() {
        return dato;
    }

    public void setDato(float dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
