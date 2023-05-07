package Clases;

public class Pila {
    
    private Nodo ultimoValorIngresado;
    
    public Pila(){
        ultimoValorIngresado = null;
    }
    
    //Metodo para insertar dentro de la pila
    public void Insertar(char valor){
        Nodo nuevo = new Nodo();
        nuevo.informacion = valor;
        
        if (ultimoValorIngresado == null) {
            
            nuevo.siguiente = null;
            ultimoValorIngresado = nuevo;
            
        } else {
            
            nuevo.siguiente = ultimoValorIngresado;
            ultimoValorIngresado = nuevo;
            
        }
    }
   
    //Metodo para extraer de la pila
    public char extraer(){
        if (ultimoValorIngresado != null) {
            
            char informacion = ultimoValorIngresado.informacion;
            ultimoValorIngresado = ultimoValorIngresado.siguiente;
            return informacion;
            
        } else {
            
            return Character.MAX_VALUE;
            
        }
    }
    
    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia(){
        return ultimoValorIngresado == null;
    }
}
