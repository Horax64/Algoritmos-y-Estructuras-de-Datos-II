package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> { 
    int longitud;
    Nodo primero; 
    Nodo último;
    

    private class Nodo {
        T valor; 
        Nodo siguiente;
        Nodo anterior;

        Nodo(T valor){
            this.valor = valor;
        }

        
    }

    public ListaEnlazada() {
        this.longitud = 0;
        this.primero = null;
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo cabeza = new Nodo(elem);
        if(primero == null){
            primero = cabeza;
            último = cabeza;   
            longitud += 1;
        }
        else{
        primero.anterior = cabeza;
        cabeza.siguiente = primero;
        primero = cabeza;
        longitud +=1;
        }
        
    }

    public void agregarAtras(T elem) {
        Nodo cola = new Nodo(elem);
        if(longitud == 0){
            primero = cola;
            último = cola; 
            longitud += 1;
        }
        else{
         último.siguiente = cola;
         cola.anterior = último; 
         último = cola;
         longitud += 1;
        }   

    }

    public T obtener(int i) {
        int j = 0;
        Nodo nodoActual;
        nodoActual = primero;
        
        while(j<i){
            nodoActual = nodoActual.siguiente;
            j +=1;
        }
        return nodoActual.valor;
    
    }

    public void eliminar(int i) {
        int j = 0; 
        Nodo nodoActual = primero;
    
        while(j<i){
            nodoActual = nodoActual.siguiente; 
            j += 1;
        }
        if(j == longitud -1){
            nodoActual.anterior.siguiente = null;
            longitud -=1;
        }
        else if(j != 0){
        nodoActual.anterior.siguiente = nodoActual.siguiente;
        nodoActual.siguiente.anterior = nodoActual.anterior; 
        longitud -= 1;
        }
        else{
            primero = primero.siguiente;
            longitud -= 1;
        }
    }

    public void modificarPosicion(int indice, T elem) {
        int j = 0;
        Nodo nodoActual;
        nodoActual = primero;
        
        while(j<indice){
            nodoActual = nodoActual.siguiente;
            j +=1;
        }
        nodoActual.valor = elem;
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> nuevaLista = new ListaEnlazada<>();
        int j = 0;
        while(j < longitud){
            nuevaLista.agregarAtras(this.obtener(j));
            j += 1;
        }
        return nuevaLista;
    
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        this.longitud = lista.longitud;
        Nodo first = new Nodo(lista.primero.valor);
        first.siguiente = lista.primero.siguiente;
        Nodo last = new Nodo(lista.último.valor);
        last.anterior = lista.último.anterior;
        this.primero = first;
        this.último = last;
    }
    
    @Override
    public String toString() {
        String lista = new String("[");
        int j = 0;
        if(j == 0){
            String first = new String(this.obtener(0).toString());
            lista = lista + first;
            j += 1;
        }
        while(j<longitud-1){
            String elemento = new String(this.obtener(j).toString());
            lista = lista + ", " + elemento;
            j += 1;
       }
            String last = new String(this.obtener(longitud-1).toString());
            lista = lista + ", " + last + "]";
       return lista;
    }

    private class ListaIterador implements Iterador<T> {
        
        Nodo prev;
        Nodo next; 

        ListaIterador(){
            next = primero;
        }

        public boolean haySiguiente() {
            if(longitud == 0){
                return false;
            }
            return next != null;
        }
        
        public boolean hayAnterior() {
            if(longitud == 0){
                return false;
            }
	        return prev != null;
        }

        public T siguiente() {
              Nodo pasaje = next;
              prev = pasaje; 
              next = pasaje.siguiente;
              return pasaje.valor;
            }
        
        public T anterior() {
            Nodo pasaje = prev;
            next = pasaje; 
            prev = pasaje.anterior;
            return pasaje.valor;
        }
    }

    public Iterador<T> iterador() {
        return new ListaIterador() {
        };
    }

}
