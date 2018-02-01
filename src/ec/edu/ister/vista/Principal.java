/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.lista.Lista;
import java.util.Scanner;

/**
 *
 * @author FERNANDO
 */
public class Principal {
    public static int leerEntero(String texto){
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println(texto);
        int dato=ingreso.nextInt();
        return dato;
    }
    
    public static int menu(){
        
        System.out.println("\t-----MENU-----");
        System.out.println("1.Agregar Final");
        System.out.println("2. Recorrer lista");
        System.out.println("3. Borar un elemento");
        System.out.println("4. Salir");
        int dato=leerEntero("Seleccione una opcion: ");
        return dato;
    }
    
    public static void main(String[] args) {
        
        int opcion;
        Lista coleccion=new Lista();
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    coleccion.agregarNodoFinal(leerEntero("INGRESE UN VALOR: "));
                    break;
                case 2:
                    System.out.println("Lista");
                    coleccion.visualizar();
                    break;
                case 3:
                    coleccion.eliminarNodos(leerEntero("Ingrese un valor"));
                    break;
                default:
                    System.out.println("FIN DEL PROGRAMA");
           }
        }while(opcion!=4);
    }
    
}
