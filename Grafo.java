
/*
    Ejercicio grafos 1.

        1.implementar matriz de adyacencia
        2.implemetar el metodo ingresar arista
        3.implementar el metodo borrar arista
        4.implementar el metodo verificar vecinos
        5.implementar los metodos testing que verifique:

            5.1 Agregar arista
            5.2 verificar arista opuesta
            5.3 borrar arista
            Nota implementar las excepciones 


*/

package com.mycompany.practica;

public class Grafo {
    
    private boolean M[][];
    
    public Grafo(int vertices){
        
        M=new boolean[vertices][vertices];
        
    }
    
    public void AgregarArista(int i, int j){
        
        Verificacion(i);
        Verificacion(j);
        VericarCiclos(i, j);
        
        M[i][j]=true;
        M[j][i]=true;
    }

    public void BorrarArista(int i, int j){
        
        M[i][j]=false;
        M[j][i]=false;
    }
    
    public int Tam(){
        
  
        return M.length;
    }
    
    public int[] vecinos(int i){
        
        int[] V=new int[M.length];
        int k=0;
        for(int j=0; j<M.length; j++){
            
            if (M[i][j]==true){
                
                V[k]=j;
                k++;
     
            }    
        }
        
        return V;
    }
 
    public void Verificacion(int i) throws IllegalArgumentException {
        if(i> M.length)
            throw new IllegalArgumentException("Arista fuera de rango");
        
        if(i <0 )
            throw new IllegalArgumentException("posición no puede ser negativa");
    }
    
    public void VericarCiclos(int i, int j) throws IllegalArgumentException {
        if(i==j)
            
            throw new IllegalArgumentException("No puede existir Ciclos en Grafo");
    }
  
}
