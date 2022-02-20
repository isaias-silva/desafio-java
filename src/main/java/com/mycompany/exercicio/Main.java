
package com.mycompany.exercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author isaias
 */
class Main{
public static void main(String[] args){
       
    Scanner teclado = new Scanner(System.in);
        System.out.print("hello");
        
        while(true){
                
                System.out.println("Escolha uma das opções abaixo (digite somente o número):");
                System.out.println("1- exercicio 1");
                System.out.println("2- exercicio 2");
                System.out.println("3- exercicio 3");
               try{
                int entrada = teclado.nextInt();
               
                switch(entrada){
                    case 1:
                        System.out.println("entrada: ");
                         entrada = teclado.nextInt();
                      String returned=Exercices.exe_one(entrada); 
                        System.out.println("saida: ");  
                      System.out.println(returned);
                      break;
                    case 2:
                    System.out.println("entrada: ");
                    var entrada_02=teclado.next();
                  int returne_02 = Exercices.exe_two(entrada_02);
                        System.out.println("saida: ");
                        System.out.println(returne_02);
                    break;

                    case 3:
                 System.out.println("entrada: ");
                    var entrada_03=teclado.next();
                  int returne_03 = Exercices.exe_tree(entrada_03);
                        System.out.println("saida: ");
                        System.out.println(returne_03);
                      
                        break;
                    default:
                        throw new InputMismatchException("entrada inválida");
                       
                }}
               catch(InputMismatchException ex){
                   System.out.println("<ERRO DIGITE UMA OPÇAO VALIDA>");
                   
               }
}
}
}