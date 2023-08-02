
/*
    Ejercicio grafos

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
        
        
        M[i][j]=true;
        M[j][i]=true;
    }
    
    public void BorrarArista(int i, int j){
        
        M[i][j]=false;
        M[j][i]=false;
    }
    
    
    
}
