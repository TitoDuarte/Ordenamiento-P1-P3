/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3.parcial1;
//import gt.edu.umg.progra3.parcial1.DinamicStructuresManager;

import static gt.edu.umg.progra3.parcial1.DinamicStructuresManager.METODOordenar;
import static gt.edu.umg.progra3.parcial1.DinamicStructuresManager.METODOordenarInversa;
import static gt.edu.umg.progra3.parcial1.StaticStructureManager.METODOordenarEstatico;
import static gt.edu.umg.progra3.parcial1.StaticStructureManager.METODOordenarInversaEstatico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Humberto Duarte
 */
public class main {
    
     public static void main(String[] args) {
        System.out.println("Hello World!");
     
        boolean cicloLista = true;
                  Scanner leer = new Scanner(System.in);
        List<Integer> arrayListInt = new ArrayList();
        List<Integer> resultado = new ArrayList(); 
        
        while(cicloLista == true){
        
    
        
          System.out.println("¿Que metodo desea realizar? \n 1. Dinamic \n 2. Static");
       int respuesta = leer.nextInt();
     
       if(respuesta == 1)
       {
             System.out.println("Agregue el primer numero");
                    respuesta = leer.nextInt();     
                    arrayListInt.add(respuesta);
             
               System.out.println("\n\n¿Desea ingresar otro numero? \n 1. Si \n 2. No");
                respuesta = leer.nextInt();
                while(respuesta == 1)
                {
                     System.out.println("Agregue el numero");
                     respuesta = leer.nextInt();     
                    arrayListInt.add(respuesta);
                    
                System.out.println("\n\n¿Desea ingresar otro numero? \n 1. Si \n 2. No");
                respuesta = leer.nextInt();
                } // fin while para agregar numeros1
               
                  respuesta = 1; //para entrar en el ciclo
                
                                    System.out.print("La lista original es: ");
                                   System.out.println(arrayListInt);
               while(respuesta == 1){
                                    System.out.println("\n\n¿Que desea realizar? \n 1. ordenar \n 2. ordernar a la inversa");
                                    respuesta = leer.nextInt();

                                     if (respuesta == 1){
                                    System.out.print("La lista ordenada es: ");
                                     METODOordenar(arrayListInt);
                                   System.out.println(arrayListInt);
                                    }
                                    else if (respuesta == 2){
                                    System.out.print("La lista ordenada a la inversa es: ");
                                    METODOordenarInversa(arrayListInt);
                                   System.out.println(arrayListInt);
                                    } 
                                    else {
                                        System.out.print("La opcion seleccionada no existe");
                                    } 

                                   System.out.println("\n\n¿Que desea realizar? \n 1. volver a mostrar opciones \n 2. Salir");
                                    respuesta = leer.nextInt();

                                    if(respuesta != 1 ){
                                      System.out.println("se finalizo el proceso de estructuras dinamicas");
                                    }
                 
                 }// fin while para mostrar listas
                 
               }
        
                else  if(respuesta == 2)// estaticas
                            {
                                  System.out.println("¿Cuantos numeros desea ingresar?");
                                         respuesta = leer.nextInt();    
                                         
                                         if(respuesta == 0){
                                        System.out.println("El  valor minimo es 1, se coloca automaticamente");

                                         respuesta = 1; 
                                         }
                                          Integer [ ] arregloEstatico = new Integer [respuesta];
                                         
                                         
                                   Integer numero; 
                                     for(Integer i = 0; i < arregloEstatico.length; i++)
                                     {
  
                                    System.out.println("Ingrese el numero " + i.toString());
                                     numero = leer.nextInt();
                                        
                                        arregloEstatico[i] = numero;
                                     
                                     } // fin while para agregar numeros1

                                       respuesta = 1; //para entrar en el ciclo

                                                         System.out.print("La lista original es: ");
                                                        System.out.println(Arrays.toString(arregloEstatico));


                                    while(respuesta == 1){
                                                         System.out.println("\n\n¿Que desea realizar? \n 1. ordenar \n 2. ordernar a la inversa");
                                                         respuesta = leer.nextInt();

                                                          if (respuesta == 1){
                                                         System.out.print("La lista ordenada es: ");
                                                         METODOordenarEstatico(arregloEstatico);
                                                        System.out.println(Arrays.toString(arregloEstatico));
                                                         }
                                                         else if (respuesta == 2){
                                                         System.out.print("La lista ordenada a la inversa es: ");
                                                         METODOordenarInversaEstatico(arregloEstatico);
                                                         System.out.println(Arrays.toString(arregloEstatico));

                                                         } 
                                                         else {
                                                             System.out.print("La opcion seleccionada no existe");
                                                         } 

                                                        System.out.println("\n\n¿Que desea realizar? \n 1. volver a mostrar opciones \n 2. Salir");
                                                         respuesta = leer.nextInt();

                                                         if(respuesta != 1 ){
                                                           System.out.println("se finalizo el proceso de estructuras dinamicas");
                                                         }

                                      }// fin while para mostrar listas

                                    }

       
       

       
     
                
                
                
        //para volver a repetir todo el programa
       System.out.println("\n\n¿Desea ingresar una nueva lista? \n 1. Si \n 2. No");
       respuesta = leer.nextInt();
       if(respuesta != 1)
       {
       cicloLista = false;
                       System.out.println("Hasta luego");
       }
      
                
 }//fin de ciclo 
     
     }
     
     

}
