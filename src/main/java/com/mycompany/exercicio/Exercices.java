
package com.mycompany.exercicio;

import java.util.ArrayList;

public class Exercices {
    
  public static String exe_one(int a){
    int valu= a;
   char it='*';
   String soma="";
String piramide="";
    for(int i = 0  ; i<valu; i++){
      soma+=it;
        piramide+=soma+"\n";
      }
   return piramide;
    }
  public static int exe_two(String a){
    int erro=0;
    int numbers=0;
    int characters=0;
    int lower=0;
    int upper=0;
    String caracteres="!@#$%^&*()-+";
    
    for(int i=0;i<a.length();i++){
       if( Character.isDigit(a.charAt(i))==true ){
        numbers+=1;
        }
    }
    for(int i=0;i<a.length();i++){
     for(var y=0; y < caracteres.length() ;y++){
            if(a.charAt(i)==caracteres.charAt(y)){
            characters+=1;
            }
         }
     }
      
     for(int b=0; b < a.length();b++){
     if(Character.isLowerCase(a.charAt(b))==true){
         lower+=1;
     }
     if(Character.isUpperCase(a.charAt(b))==true){
         upper+=1;
     }
     
     }
    if(a.length()<6){
        erro=6- a.length();
    }
    else if(numbers<=0){
    erro=1;}
    else if(characters<=0){
    erro=1;}
    else if(upper<=0){
    erro=1;}
    else if(lower<=0){
    erro=1;}
 
    return erro;
  }
public static int exe_tree(String palavra){
    ArrayList<String> anagramas = new ArrayList<String>();
    for(int i = 0; i <palavra.length(); i++) {
        for(int j = 1; j < palavra.length(); j++) {
            if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
                if(palavra.charAt(i) == palavra.charAt(i+1)) {
                String x = palavra.substring(i, i + 1);
                anagramas.add(x);
                } else {
                String y = palavra.substring(i, j);
                String z = palavra.substring(i + 1, j + 1);
                String h = palavra.substring(i, i + 1);
                anagramas.add(h);
                anagramas.add(y);
                anagramas.add(z);
                }
            }
        }
    }
    System.out.println(anagramas);
    return anagramas.size();
}
}
