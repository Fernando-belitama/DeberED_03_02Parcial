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
public class Lista {
    
    Nodo inicio;
    Nodo fin;

    public Lista() {
        inicio=null;
        fin=null;
    }
    public void agregarNodoInicio(int dato){
        Nodo nuevo=new Nodo(dato);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
        if(fin==null)
            fin=nuevo;
    }
    
    public void agregarNodoFinal(int dato){
       Nodo nuevo=new Nodo(dato);
       if(fin!=null){
           fin.setSiguiente(nuevo);
           fin=nuevo;
       }
       else{
           fin=nuevo;
           inicio=nuevo;
       }
    }
    
    public void visualizar(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getSiguiente();
        }
    }
    
    public void eliminarNodos(int numero){
        if(inicio!=null){
            if(inicio.getDato()!= numero){
                inicio=fin=null;
            }
            else if((inicio==fin)&&(inicio.getDato()!=numero)){
                inicio=inicio.getSiguiente();
            }
            else{
                Nodo anterior=inicio;
                Nodo siguiente=inicio.getSiguiente();
                while((siguiente!=null)&&(siguiente.getDato()!=numero)){
                    anterior=siguiente;
                    siguiente=siguiente.getSiguiente();
                }
                if(siguiente!=null){
                    anterior.setSiguiente(siguiente.getSiguiente());
                    if(siguiente==fin){
                        fin=anterior;
                    }
                }
            }
        }
    }
    
    
}
